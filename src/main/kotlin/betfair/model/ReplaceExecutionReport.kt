package betfair.model

data class ReplaceExecutionReport internal constructor(
		val customerRef: String? = null,
		val status: ExecutionReportStatus,
		val errorCode: ExecutionReportErrorCode,
		val marketId: String? = null,
		val instructionReports: List<ReplaceInstructionReport>? = null)
