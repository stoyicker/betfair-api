package betfair.model

import com.squareup.moshi.Json

internal data class MarketVersion(
		@Json(name = "version")
		private val version: Long? = null)
