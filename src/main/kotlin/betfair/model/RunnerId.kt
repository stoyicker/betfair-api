package betfair.model

internal data class RunnerId(
		val marketId: MarketId? = null,
		val selectionId: SelectionId? = null,
		val handicap: Handicap? = null)
