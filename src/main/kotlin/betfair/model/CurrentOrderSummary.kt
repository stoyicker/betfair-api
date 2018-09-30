package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class CurrentOrderSummary(
		@Json(name = "betId")
		private val betId: String,
		@Json(name = "marketId")
		private val marketId: String,
		@Json(name = "selectionId")
		private val selectionId: Long,
		@Json(name = "handicap")
		private val handicap: Double,
		@Json(name = "priceSize")
		private val priceSize: PriceSize,
		@Json(name = "bspLiability")
		private val bspLiability: Double,
		@Json(name = "side")
		private val side: Side,
		@Json(name = "status")
		private val status: OrderStatus,
		@Json(name = "persistenceType")
		private val persistenceType: PersistenceType,
		@Json(name = "orderType")
		private val orderType: OrderType,
		@Json(name = "placedDate")
		private val placedDate: Date,
		@Json(name = "matchedDate")
		private val matchedDate: Date,
		@Json(name = "averagePriceMatched")
		private val averagePriceMatched: Double? = null,
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
		@Json(name = "regulatorAuthCode")
		private val regulatorAuthCode: String? = null,
		@Json(name = "regulatorCode")
		private val regulatorCode: String? = null,
		@Json(name = "customerOrderRef")
		private val customerOrderRef: String? = null,
		@Json(name = "customerStrategyRef")
		private val customerStrategyRef: String? = null)
