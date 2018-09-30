package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class Match(
		@Json(name = "betId")
		private val betId: String? = null,
		@Json(name = "matchId")
		private val matchId: String? = null,
		@Json(name = "side")
		private val side: Side,
		@Json(name = "price")
		private val price: Double,
		@Json(name = "size")
		private val size: Double,
		@Json(name = "matchDate")
		private val matchDate: Date? = null)
