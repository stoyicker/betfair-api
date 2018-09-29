package betfair.model

data class ClearedOrderSummaryReport internal constructor(
		val clearedOrders: List<ClearedOrderSummary>,
		val moreAvailable: Boolean)
