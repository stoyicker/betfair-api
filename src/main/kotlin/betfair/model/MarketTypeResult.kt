package betfair.model

import com.squareup.moshi.Json

internal data class MarketTypeResult(
		@Json(name = "marketType")
		private val marketType: String? = null,
		@Json(name = "marketCount")
		private val marketCount: Int? = null)
