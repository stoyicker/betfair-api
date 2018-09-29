package betfair.api

import betfair.Config
import okhttp3.Interceptor

internal class AuthenticationInterceptor(private val config: Config) : Interceptor {
	companion object {
		const val AUTHENTICATION_HEADER_NAME = "X-Authentication"
	}

	override fun intercept(chain: Interceptor.Chain) = chain.proceed(chain.request()).run {
		config.sessionToken?.run {
			newBuilder().addHeader(AUTHENTICATION_HEADER_NAME, this).build()!!
		} ?: this!!
	}
}
