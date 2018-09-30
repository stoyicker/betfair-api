package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class PlaceInstructionReport(
		@Json(name = "status")
		private val status: InstructionReportStatus,
		@Json(name = "errorCode")
		private val errorCode: InstructionReportErrorCode? = null,
		@Json(name = "orderStatus")
		private val orderStatus: OrderStatus? = null,
		@Json(name = "instruction")
		private val instruction: PlaceInstruction,
		@Json(name = "betId")
		private val betId: String? = null,
		@Json(name = "placedDate")
		private val placedDate: Date? = null,
		@Json(name = "averagePriceMatched")
		private val averagePriceMatched: Price? = null,
		@Json(name = "sizeMatched")
		private val sizeMatched: Size? = null)
