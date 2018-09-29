package betfair.model

internal data class CurrentOrderSummaryReport(
		val currentOrders: List<CurrentOrderSummary>,
		val moreAvailable: Boolean)
