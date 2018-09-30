package betfair.model

import com.squareup.moshi.Json

internal data class LimitOrder(
		@Json(name = "size")
		private val size: Double,
		@Json(name = "price")
		private val price: Double,
		@Json(name = "persistenceType")
		private val persistenceType: PersistenceType,
		@Json(name = "timeInForce")
		private val timeInForce: TimeInForce? = null,
		@Json(name = "minFillSize")
		private val minFillSize: Size? = null,
		@Json(name = "betTargetType")
		private val betTargetType: BetTargetType? = null,
		@Json(name = "betTargetSize")
		private val betTargetSize: Size? = null)
