package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class Order(
		@Json(name = "betId")
		private val betId: String,
		@Json(name = "orderType")
		private val orderType: OrderType,
		@Json(name = "status")
		private val status: OrderStatus,
		@Json(name = "persistenceType")
		private val persistenceType: PersistenceType,
		@Json(name = "side")
		private val side: Side,
		@Json(name = "price")
		private val price: Double,
		@Json(name = "size")
		private val size: Double,
		@Json(name = "bspLiability")
		private val bspLiability: Double,
		@Json(name = "placedDate")
		private val placedDate: Date,
		@Json(name = "avgPriceMatched")
		private val avgPriceMatched: Double? = null,
		@Json(name = "sizeMatched")
		private val sizeMatched: Double? = null,
		@Json(name = "sizeRemaining")
		private val sizeRemaining: Double? = null,
		@Json(name = "sizeLapsed")
		private val sizeLapsed: Double? = null,
		@Json(name = "sizeCancelled")
		private val sizeCancelled: Double? = null,
		@Json(name = "sizeVoided")
		private val sizeVoided: Double? = null,
		@Json(name = "customerOrderRef")
		private val customerOrderRef: CustomerOrderRef,
		@Json(name = "customerStrategyRef")
		private val customerStrategyRef: CustomerStrategyRef)
