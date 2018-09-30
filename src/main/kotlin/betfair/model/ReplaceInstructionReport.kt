package betfair.model

import com.squareup.moshi.Json

internal data class ReplaceInstructionReport(
		@Json(name = "status")
		private val status: InstructionReportStatus,
		@Json(name = "errorCode")
		private val errorCode: ExecutionReportErrorCode? = null,
		@Json(name = "cancelInstructionReport")
		private val cancelInstructionReport: CancelInstructionReport? = null,
		@Json(name = "placeInstructionReport")
		private val placeInstructionReport: PlaceInstructionReport? = null)
