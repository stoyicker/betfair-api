package betfair.model

// TODO Json-annotate all of these fields
internal data class ApiNgException(
		val errorCode: ApiNgExceptionErrorCode?,
		val requestUUID: String?,
		val errorDetails: String?)
