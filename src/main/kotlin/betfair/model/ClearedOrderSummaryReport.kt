package betfair.model

import com.squareup.moshi.Json

internal data class ClearedOrderSummaryReport(
		@Json(name = "clearedOrders")
		private val clearedOrders: List<ClearedOrderSummary>,
		@Json(name = "moreAvailable")
		private val moreAvailable: Boolean)
