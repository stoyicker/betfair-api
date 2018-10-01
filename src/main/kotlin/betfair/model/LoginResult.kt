package betfair.model

import com.squareup.moshi.Json

internal data class LoginResult(
		@Json(name = "sessionToken")
		val sessionToken: String,
		@Json(name = "loginStatus")
		private val loginStatus: LoginStatus? = null)
