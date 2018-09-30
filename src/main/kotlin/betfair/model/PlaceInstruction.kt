package betfair.model

import com.squareup.moshi.Json

internal data class PlaceInstruction(
		@Json(name = "orderType")
		private val orderType: OrderType,
		@Json(name = "selectionId")
		private val selectionId: Long,
		@Json(name = "handicap")
		private val handicap: Double? = null,
		@Json(name = "side")
		private val side: Side,
		@Json(name = "limitOrder")
		private val limitOrder: LimitOrder? = null,
		@Json(name = "limitOnCloseOrder")
		private val limitOnCloseOrder: LimitOnCloseOrder? = null,
		@Json(name = "marketOnCloseOrder")
		private val marketOnCloseOrder: MarketOnCloseOrder? = null,
		@Json(name = "customerOrderRef")
		private val customerOrderRef: String? = null)
