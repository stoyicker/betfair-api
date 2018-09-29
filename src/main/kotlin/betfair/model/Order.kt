package betfair.model

import java.util.Date

data class Order internal constructor(
		val betId: String,
		val orderType: OrderType,
		val status: OrderStatus,
		val persistenceType: PersistenceType,
		val side: Side,
		val price: Double,
		val size: Double,
		val bspLiability: Double,
		val placedDate: Date,
		val avgPriceMatched: Double? = null,
		val sizeMatched: Double? = null,
		val sizeRemaining: Double? = null,
		val sizeLapsed: Double? = null,
		val sizeCancelled: Double? = null,
		val sizeVoided: Double? = null,
		val customerOrderRef: CustomerOrderRef,
		val customerStrategyRef: CustomerStrategyRef)
