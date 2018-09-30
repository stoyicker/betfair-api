package betfair.model

import com.squareup.moshi.Json

internal data class ApiNgException(
		@Json(name = "errorCode")
		private val errorCode: ApiNgExceptionErrorCode? = null,
		@Json(name = "requestUUID")
		private val requestUUID: String? = null,
		@Json(name = "errorDetails")
		private val errorDetails: String? = null)
