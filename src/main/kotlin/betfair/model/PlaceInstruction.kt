package betfair.model

internal data class PlaceInstruction(
		val orderType: OrderType,
		val selectionId: Long,
		val handicap: Double? = null,
		val side: Side,
		val limitOrder: LimitOrder? = null,
		val limitOnCloseOrder: LimitOnCloseOrder? = null,
		val marketOnCloseOrder: MarketOnCloseOrder? = null,
		val customerOrderRef: String? = null)
