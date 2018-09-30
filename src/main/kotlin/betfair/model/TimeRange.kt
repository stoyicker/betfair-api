package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class TimeRange(
		@Json(name = "from")
		private val from: Date? = null,
		@Json(name = "to")
		private val to: Date? = null)
