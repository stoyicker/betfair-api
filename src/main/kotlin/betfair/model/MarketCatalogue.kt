package betfair.model

import java.util.*

internal data class MarketCatalogue(
		val marketId: String,
		val marketName: String,
		val marketStartTime: Date? = null,
		val description: MarketDescription? = null,
		val totalMatched: Double? = null,
		val runners: List<RunnerCatalog>? = null,
		val eventType: EventType? = null,
		val competition: Competition? = null,
		val event: Event? = null)
