package betfair.api

import betfair.model.LoginResult
import retrofit2.Call
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

internal interface BotLoginApiService {
	companion object {
		const val ENDPOINT = "https://identitysso.betfair.com/api/"
	}

	@POST("certlogin")
	@Headers("Content-Type: application/x-www-form-urlencoded")
	fun login(
			@Query("username") username: CharSequence,
			@Query("password") password: CharSequence): Call<LoginResult>
}
