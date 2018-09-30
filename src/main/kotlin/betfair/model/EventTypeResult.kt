package betfair.model

import com.squareup.moshi.Json

internal data class EventTypeResult(
		@Json(name = "eventType")
		private val eventType: EventType? = null,
		@Json(name = "marketCount")
		private val marketCount: Int? = null)
