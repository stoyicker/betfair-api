package betfair.model

data class StartingPrices internal constructor(
		val nearPrice: Double? = null,
		val farPrice: Double? = null,
		val backStakeTaken: List<PriceSize>? = null,
		val layLiabilityTaken: List<PriceSize>? = null,
		val actualSP: Double? = null)
