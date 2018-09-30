package betfair.model

import com.squareup.moshi.Json

internal data class CompetitionResult(
		@Json(name = "competition")
		val competition: Competition? = null,
		@Json(name = "marketCount")
		val marketCount: Int? = null,
		@Json(name = "competitionRegion")
		val competitionRegion: String? = null)
