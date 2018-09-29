package betfair.model

internal data class MarketProfitAndLoss(
		val marketId: String? = null,
		val commissionApplied: Double? = null,
		val profitAndLosses: List<RunnerProfitAndLoss>? = null)
