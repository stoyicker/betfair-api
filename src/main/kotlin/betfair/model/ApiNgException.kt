package betfair.model

data class ApiNgException internal constructor(
		val errorCode: ApiNgExceptionErrorCode?,
		val requestUUID: String?,
		val errorDetails: String?)
