package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class Runner(
		@Json(name = "selectionId")
		private val selectionId: Long,
		@Json(name = "handicap")
		private val handicap: Double,
		@Json(name = "status")
		private val status: RunnerStatus,
		@Json(name = "adjustmentFactor")
		private val adjustmentFactor: Double,
		@Json(name = "lastPriceTraded")
		private val lastPriceTraded: Double? = null,
		@Json(name = "totalMatched")
		private val totalMatched: Double? = null,
		@Json(name = "removalDate")
		private val removalDate: Date? = null,
		@Json(name = "sp")
		private val sp: StartingPrices? = null,
		@Json(name = "ex")
		private val ex: ExchangePrices? = null,
		@Json(name = "orders")
		private val orders: List<Order>? = null,
		@Json(name = "matches")
		private val matches: List<Match>? = null,
		@Json(name = "matchesByStrategy")
		private val matchesByStrategy: Map<String, Match>? = null)
