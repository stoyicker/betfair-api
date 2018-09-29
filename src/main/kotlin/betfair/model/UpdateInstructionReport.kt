package betfair.model

data class UpdateInstructionReport internal constructor(
		val status: InstructionReportStatus,
		val errorCode: InstructionReportErrorCode? = null,
		val instruction: UpdateInstruction)
