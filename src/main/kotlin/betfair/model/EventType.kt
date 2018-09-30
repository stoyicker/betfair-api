package betfair.model

import com.squareup.moshi.Json

internal data class EventType(
		@Json(name = "id")
		private val id: String? = null,
		@Json(name = "name")
		private val name: String? = null)
