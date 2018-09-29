package betfair.model

data class MarketProfitAndLoss internal constructor(
		val marketId: String? = null,
		val commissionApplied: Double? = null,
		val profitAndLosses: List<RunnerProfitAndLoss>? = null)
