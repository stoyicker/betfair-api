package betfair.model

import java.util.Date

internal data class Runner(
		val selectionId: Long,
		val handicap: Double,
		val status: RunnerStatus,
		val adjustmentFactor: Double,
		val lastPriceTraded: Double? = null,
		val totalMatched: Double? = null,
		val removalDate: Date? = null,
		val sp: StartingPrices? = null,
		val ex: ExchangePrices? = null,
		val orders: List<Order>? = null,
		val matches: List<Match>? = null,
		val matchesByStrategy: Map<String, Match>? = null)
