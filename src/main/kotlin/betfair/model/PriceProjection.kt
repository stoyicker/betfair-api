package betfair.model

data class PriceProjection internal constructor(
		val priceData: List<PriceData>? = null,
		val exBestOffersOverrides: ExBestOffersOverrides? = null,
		val virtualise: Boolean? = null,
		val rolloverStakes: Boolean? = null)
