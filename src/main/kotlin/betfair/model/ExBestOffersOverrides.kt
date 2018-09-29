package betfair.model

data class ExBestOffersOverrides internal constructor(
		val bestPricesDepth: Int? = null,
		val rollupModel: RollupModel? = null,
		val rollupLimit: Int? = null,
		val rollupLiabilityThreshold: Double? = null,
		val rollupLiabilityFactor: Int? = null)
