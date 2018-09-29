package betfair.model

internal data class PriceProjection(
		val priceData: List<PriceData>? = null,
		val exBestOffersOverrides: ExBestOffersOverrides? = null,
		val virtualise: Boolean? = null,
		val rolloverStakes: Boolean? = null)
