package betfair.model

import com.squareup.moshi.Json

internal data class MarketOnCloseOrder(
		@Json(name = "liability")
		private val liability: Double)
