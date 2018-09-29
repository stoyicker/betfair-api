package betfair.model

data class UpdateExecutionReport internal constructor(
		val customerRef: String? = null,
		val status: ExecutionReportStatus,
		val errorCode: ExecutionReportErrorCode? = null,
		val marketId: String? = null,
		val instructionReports: List<UpdateInstructionReport>? = null)
