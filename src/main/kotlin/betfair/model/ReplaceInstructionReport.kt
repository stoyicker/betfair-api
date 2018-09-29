package betfair.model

internal data class ReplaceInstructionReport(
		val status: InstructionReportStatus,
		val errorCode: ExecutionReportErrorCode? = null,
		val cancelInstructionReport: CancelInstructionReport? = null,
		val placeInstructionReport: PlaceInstructionReport? = null)
