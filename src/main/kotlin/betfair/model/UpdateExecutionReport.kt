package betfair.model

internal data class UpdateExecutionReport(
		val customerRef: String? = null,
		val status: ExecutionReportStatus,
		val errorCode: ExecutionReportErrorCode? = null,
		val marketId: String? = null,
		val instructionReports: List<UpdateInstructionReport>? = null)
