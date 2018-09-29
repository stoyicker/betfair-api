package betfair.model

internal data class ClearedOrderSummaryReport(
		val clearedOrders: List<ClearedOrderSummary>,
		val moreAvailable: Boolean)
