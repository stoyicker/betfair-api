package betfair.model

internal data class ApiNgException(
		val errorCode: ApiNgExceptionErrorCode?,
		val requestUUID: String?,
		val errorDetails: String?)
