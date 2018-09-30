package betfair.model

import com.squareup.moshi.Json

internal data class PriceProjection(
		@Json(name = "priceData")
		private val priceData: List<PriceData>? = null,
		@Json(name = "exBestOffersOverrides")
		private val exBestOffersOverrides: ExBestOffersOverrides? = null,
		@Json(name = "virtualise")
		private val virtualise: Boolean? = null,
		@Json(name = "rolloverStakes")
		private val rolloverStakes: Boolean? = null)
