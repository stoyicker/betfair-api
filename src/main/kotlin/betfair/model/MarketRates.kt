package betfair.model

import com.squareup.moshi.Json

internal data class MarketRates(
		@Json(name = "marketBaseRate")
		private val marketBaseRate: Double,
		@Json(name = "discountAllowed")
		private val discountAllowed: Boolean)
