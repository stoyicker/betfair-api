package betfair.model

import java.util.Date

data class Match internal constructor(
		val betId: String? = null,
		val matchId: String? = null,
		val side: Side,
		val price: Double,
		val size: Double,
		val matchDate: Date? = null)
