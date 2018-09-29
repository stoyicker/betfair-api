package betfair.model

data class CancelExecutionReport internal constructor(
		val customerRef: String? = null,
		val status: ExecutionReportStatus,
		val errorCode: ExecutionReportErrorCode? = null,
		val marketId: String? = null,
		val instructionReports: List<CancelInstructionReport>? = null)
