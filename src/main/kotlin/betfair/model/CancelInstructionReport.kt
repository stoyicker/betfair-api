package betfair.model

import java.util.Date

data class CancelInstructionReport internal constructor(
		val status: InstructionReportStatus,
		val errorCode: InstructionReportErrorCode? = null,
		val instruction: CancelInstruction? = null,
		val sizeCancelled: Double,
		val cancelledDate: Date? = null)
