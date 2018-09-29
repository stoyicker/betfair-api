package betfair.model

internal data class ReplaceExecutionReport(
		val customerRef: String? = null,
		val status: ExecutionReportStatus,
		val errorCode: ExecutionReportErrorCode,
		val marketId: String? = null,
		val instructionReports: List<ReplaceInstructionReport>? = null)
