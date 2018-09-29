package betfair.model

data class ReplaceInstructionReport internal constructor(
		val status: InstructionReportStatus,
		val errorCode: ExecutionReportErrorCode? = null,
		val cancelInstructionReport: CancelInstructionReport? = null,
		val placeInstructionReport: PlaceInstructionReport? = null)
