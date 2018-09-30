package betfair.model

import com.squareup.moshi.Json

internal data class EventResult(
		@Json(name = "event")
		private val event: Event? = null,
		@Json(name = "eventResult")
		private val marketCount: Int? = null)
