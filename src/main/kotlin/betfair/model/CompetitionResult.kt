package betfair.model

data class CompetitionResult internal constructor(
		val competition: Competition? = null,
		val marketCount: Int? = null,
		val competitionRegion: String)
