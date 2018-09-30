package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class CancelInstructionReport(
		@Json(name = "status")
		val status: InstructionReportStatus,
		@Json(name = "errorCode")
		val errorCode: InstructionReportErrorCode? = null,
		@Json(name = "instruction")
		val instruction: CancelInstruction? = null,
		@Json(name = "sizeCancelled")
		val sizeCancelled: Double,
		@Json(name = "cancelledDate")
		val cancelledDate: Date? = null)
