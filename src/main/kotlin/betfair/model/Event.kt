package betfair.model

import java.util.Date

data class Event internal constructor(
		val id: String? = null,
		val name: String? = null,
		val countryCode: String? = null,
		val timeZone: String? = null,
		val venue: String? = null,
		val openDate: Date? = null)
