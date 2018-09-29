package betfair.model

data class CurrentOrderSummaryReport internal constructor(
		val currentOrders: List<CurrentOrderSummary>,
		val moreAvailable: Boolean)
