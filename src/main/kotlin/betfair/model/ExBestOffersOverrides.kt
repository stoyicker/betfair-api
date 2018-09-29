package betfair.model

internal data class ExBestOffersOverrides(
		val bestPricesDepth: Int? = null,
		val rollupModel: RollupModel? = null,
		val rollupLimit: Int? = null,
		val rollupLiabilityThreshold: Double? = null,
		val rollupLiabilityFactor: Int? = null)
