package betfair.model

import com.squareup.moshi.Json

internal data class TimeRangeResult(
		@Json(name = "timeRange")
		private val timeRange: TimeRange? = null,
		@Json(name = "marketCount")
		private val marketCount: Int? = null)
