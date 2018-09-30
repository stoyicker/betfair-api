package betfair.model

import com.squareup.moshi.Json

internal data class CancelExecutionReport(
		@Json(name = "customerRef")
		private val customerRef: String? = null,
		@Json(name = "status")
		private val status: ExecutionReportStatus,
		@Json(name = "errorCode")
		private val errorCode: ExecutionReportErrorCode? = null,
		@Json(name = "marketId")
		private val marketId: String? = null,
		@Json(name = "instructionReports")
		private val instructionReports: List<CancelInstructionReport>? = null) {
}
