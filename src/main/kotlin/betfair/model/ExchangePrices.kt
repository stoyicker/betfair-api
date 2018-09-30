package betfair.model

import com.squareup.moshi.Json

internal data class ExchangePrices(
		@Json(name = "availableToBack")
		private val availableToBack: List<PriceSize>? = null,
		@Json(name = "availableToLay")
		private val availableToLay: List<PriceSize>? = null,
		@Json(name = "tradedVolume")
		private val tradedVolume: List<PriceSize>? = null)
