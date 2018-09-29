package betfair.api

import okhttp3.Authenticator
import okhttp3.Response
import okhttp3.Route

internal class BotLoginAuthenticator(
		private val botLoginApiService: BotLoginApiService,
		private val username: CharSequence,
		private val password: CharSequence) : Authenticator {
	override fun authenticate(route: Route, response: Response) = when (response.priorResponse()) {
		null -> response.request().newBuilder()
				.addHeader(AuthenticationInterceptor.AUTHENTICATION_HEADER_NAME, requestSessionToken())
				.build()
		else -> null
	}

	private fun requestSessionToken() = botLoginApiService.login(username, password).execute().body()
}
