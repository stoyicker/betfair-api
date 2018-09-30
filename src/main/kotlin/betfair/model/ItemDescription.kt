package betfair.model

import com.squareup.moshi.Json

internal data class ItemDescription(
		@Json(name = "eventTypeDesc")
		private val eventTypeDesc: String? = null,
		@Json(name = "eventDesc")
		private val eventDesc: String? = null,
		@Json(name = "marketDesc")
		private val marketDesc: String? = null,
		@Json(name = "marketType")
		private val marketType: String? = null,
		@Json(name = "marketStartTime")
		private val marketStartTime: String? = null,
		@Json(name = "runnerDesc")
		private val runnerDesc: String? = null,
		@Json(name = "numberOfWinners")
		private val numberOfWinners: Int? = null,
		@Json(name = "eachWayDivisor")
		private val eachWayDivisor: Double? = null)
