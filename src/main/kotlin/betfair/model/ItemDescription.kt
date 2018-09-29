package betfair.model

internal data class ItemDescription(
		val eventTypeDesc: String? = null,
		val eventDesc: String? = null,
		val marketDesc: String? = null,
		val marketType: String? = null,
		val marketStartTime: String? = null,
		val runnerDesc: String? = null,
		val numberOfWinners: Int? = null,
		val eachWayDivisor: Double? = null)
