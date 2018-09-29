package betfair.api

import betfair.Config
import okhttp3.Interceptor
import okhttp3.Response

// TODO Make this trigger when I need it to (wrong auth is still 200)
internal class AuthenticationInterceptor(private val config: Config) : Interceptor {
	companion object {
		const val HEADER_NAME_AUTHENTICATION = "X-Authentication"
		const val HEADER_NAME_AUTHENTICATION_ATTEMPTED = "X-Authentication-Attempted"
		const val HEADER_VALUE_AUTHENTICATION_ATTEMPTED = "true"
	}

	override fun intercept(chain: Interceptor.Chain): Response? {
		val request = chain.request()
		return if (request.header(HEADER_NAME_AUTHENTICATION_ATTEMPTED) == null) {
			chain.proceed(chain.request()).run {
				config.sessionToken?.run {
					newBuilder().apply {
						addHeader(HEADER_NAME_AUTHENTICATION, this@run)
						addHeader(HEADER_NAME_AUTHENTICATION_ATTEMPTED, HEADER_VALUE_AUTHENTICATION_ATTEMPTED)
					}.build()!!
				} ?: this!!
			}
		} else null
	}
}
