package betfair.model

import com.squareup.moshi.Json

internal data class VenueResult(
		@Json(name = "venue")
		private val venue: String? = null,
		@Json(name = "marketCount")
		private val marketCount: Int? = null)
