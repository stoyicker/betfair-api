package betfair.model

data class ItemDescription internal constructor(
		val eventTypeDesc: String? = null,
		val eventDesc: String? = null,
		val marketDesc: String? = null,
		val marketType: String? = null,
		val marketStartTime: String? = null,
		val runnerDesc: String? = null,
		val numberOfWinners: Int? = null,
		val eachWayDivisor: Double? = null)
