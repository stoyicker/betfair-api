package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class CancelInstructionReport(
		@Json(name = "status")
		private val status: InstructionReportStatus,
		@Json(name = "errorCode")
		private val errorCode: InstructionReportErrorCode? = null,
		@Json(name = "instruction")
		private val instruction: CancelInstruction? = null,
		@Json(name = "sizeCancelled")
		private val sizeCancelled: Double,
		@Json(name = "cancelledDate")
		private val cancelledDate: Date? = null)
