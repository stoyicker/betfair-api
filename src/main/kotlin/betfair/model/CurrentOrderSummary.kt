package betfair.model

import java.util.Date

data class CurrentOrderSummary internal constructor(
		val betId: String,
		val marketId: String,
		val selectionId: Long,
		val handicap: Double,
		val priceSize: PriceSize,
		val bspLiability: Double,
		val side: Side,
		val status: OrderStatus,
		val persistenceType: PersistenceType,
		val orderType: OrderType,
		val placedDate: Date,
		val matchedDate: Date,
		val averagePriceMatched: Double? = null,
		val sizeMatched: Double? = null,
		val sizeRemaining: Double? = null,
		val sizeLapsed: Double? = null,
		val sizeCancelled: Double? = null,
		val sizeVoided: Double? = null,
		val regulatorAuthCode: String? = null,
		val regulatorCode: String? = null,
		val customerOrderRef: String? = null,
		val customerStrategyRef: String? = null)
