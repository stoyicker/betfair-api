package betfair.model

data class RunnerId internal constructor(
		val marketId: MarketId? = null,
		val selectionId: SelectionId? = null,
		val handicap: Handicap? = null)
