package betfair.model

import com.squareup.moshi.Json

internal data class LimitOnCloseOrder(
		@Json(name = "liability")
		private val liability: Double,
		@Json(name = "price")
		private val price: Double)
