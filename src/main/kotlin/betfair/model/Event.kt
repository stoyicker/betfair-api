package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class Event(
		@Json(name = "id")
		private val id: String? = null,
		@Json(name = "name")
		private val name: String? = null,
		@Json(name = "countryCode")
		private val countryCode: String? = null,
		@Json(name = "timezone")
		private val timeZone: String? = null,
		@Json(name = "venue")
		private val venue: String? = null,
		@Json(name = "openDate")
		private val openDate: Date? = null)
