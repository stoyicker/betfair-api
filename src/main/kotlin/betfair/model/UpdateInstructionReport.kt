package betfair.model

internal data class UpdateInstructionReport(
		val status: InstructionReportStatus,
		val errorCode: InstructionReportErrorCode? = null,
		val instruction: UpdateInstruction)
