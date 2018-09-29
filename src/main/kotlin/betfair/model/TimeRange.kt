package betfair.model

import java.util.Date

data class TimeRange internal constructor(
		val from: Date? = null,
		val to: Date? = null)
