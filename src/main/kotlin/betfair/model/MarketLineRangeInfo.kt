package betfair.model

import com.squareup.moshi.Json

internal data class MarketLineRangeInfo(
		@Json(name = "maxUnitValue")
		private val maxUnitValue: Double,
		@Json(name = "minUnitValue")
		private val minUnitValue: Double,
		@Json(name = "interval")
		private val interval: Double,
		@Json(name = "marketUnit")
		private val marketUnit: String)
