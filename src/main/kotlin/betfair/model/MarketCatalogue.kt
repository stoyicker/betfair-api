package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class MarketCatalogue(
		@Json(name = "marketId")
		private val marketId: String,
		@Json(name = "marketName")
		private val marketName: String,
		@Json(name = "marketStartTime")
		private val marketStartTime: Date? = null,
		@Json(name = "description")
		private val description: MarketDescription? = null,
		@Json(name = "totalMatched")
		private val totalMatched: Double? = null,
		@Json(name = "runners")
		private val runners: List<RunnerCatalog>? = null,
		@Json(name = "eventType")
		private val eventType: EventType? = null,
		@Json(name = "competition")
		private val competition: Competition? = null,
		@Json(name = "event")
		private val event: Event? = null)
