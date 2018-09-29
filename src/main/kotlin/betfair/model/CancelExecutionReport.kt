package betfair.model

internal data class CancelExecutionReport(
		val customerRef: String? = null,
		val status: ExecutionReportStatus,
		val errorCode: ExecutionReportErrorCode? = null,
		val marketId: String? = null,
		val instructionReports: List<CancelInstructionReport>? = null)
