package betfair.model

import com.squareup.moshi.Json

internal data class UpdateInstructionReport(
		@Json(name = "status")
		private val status: InstructionReportStatus,
		@Json(name = "errorCode")
		private val errorCode: InstructionReportErrorCode? = null,
		@Json(name = "instruction")
		private val instruction: UpdateInstruction)
