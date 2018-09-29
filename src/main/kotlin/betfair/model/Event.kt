package betfair.model

import java.util.Date

internal data class Event(
		val id: String? = null,
		val name: String? = null,
		val countryCode: String? = null,
		val timeZone: String? = null,
		val venue: String? = null,
		val openDate: Date? = null)
