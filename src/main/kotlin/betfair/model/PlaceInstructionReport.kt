package betfair.model

import java.util.Date

data class PlaceInstructionReport internal constructor(
		val status: InstructionReportStatus,
		val errorCode: InstructionReportErrorCode? = null,
		val orderStatus: OrderStatus? = null,
		val instruction: PlaceInstruction,
		val betId: String? = null,
		val placedDate: Date? = null,
		val averagePriceMatched: Price? = null,
		val sizeMatched: Size? = null)
