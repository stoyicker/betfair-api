package betfair.model

import com.squareup.moshi.Json

internal data class LoginResult(
		@Json(name = "sessionToken")
		private val sessionToken: String,
		@Json(name = "loginStatus")
		private val loginStatus: LoginStatus? = null)
