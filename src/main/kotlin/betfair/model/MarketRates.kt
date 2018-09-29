package betfair.model

data class MarketRates internal constructor(
		val marketBaseRate: Double,
		val discountAllowed: Boolean)
