package betfair.model

import com.squareup.moshi.Json

internal data class PriceSize(
		@Json(name = "price")
		private val price: Double,
		@Json(name = "size")
		private val size: Double)
