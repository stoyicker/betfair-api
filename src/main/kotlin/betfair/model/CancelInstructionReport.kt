package betfair.model

import java.util.Date

internal data class CancelInstructionReport(
		val status: InstructionReportStatus,
		val errorCode: InstructionReportErrorCode? = null,
		val instruction: CancelInstruction? = null,
		val sizeCancelled: Double,
		val cancelledDate: Date? = null)
