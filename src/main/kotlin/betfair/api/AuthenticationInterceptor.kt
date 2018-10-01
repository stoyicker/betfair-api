package betfair.api

import betfair.Config
import okhttp3.Interceptor
import okhttp3.Response
import java.time.LocalDateTime

internal class AuthenticationInterceptor(
		private val botLoginApiService: BotLoginApiService,
		private val config: Config) : Interceptor {
	companion object {
		const val HEADER_NAME_AUTHENTICATION = "X-Authentication"
		const val AUTHENTICATION_THRESHOLD_MINUTES = 10L
	}

	override fun intercept(chain: Interceptor.Chain): Response {
		updateSessionToken()
		return chain.proceed(chain.request()).run {
			config.sessionToken?.let {
				newBuilder().apply {
					addHeader(HEADER_NAME_AUTHENTICATION, it)
				}.build()!!
			} ?: this!!
		}
	}

	private fun updateSessionToken() {
		if (config.sessionToken == null ||
				config.lastSessionTokenUpdate.plusMinutes(AUTHENTICATION_THRESHOLD_MINUTES).isAfter(LocalDateTime.now())) {
			config.sessionToken = botLoginApiService.login(config.username, config.password).execute().body()?.sessionToken
		}
	}
}
