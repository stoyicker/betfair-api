package betfair.model

import java.util.Date

data class ClearedOrderSummary internal constructor(
		val eventTypeId: EventTypeId? = null,
		val eventId: EventId? = null,
		val marketId: MarketId? = null,
		val selectionId: SelectionId? = null,
		val handicap: Handicap? = null,
		val betId: BetId? = null,
		val placedDate: Date? = null,
		val persistenceType: PersistenceType? = null,
		val orderType: OrderType? = null,
		val side: Side? = null,
		val itemDescription: ItemDescription? = null,
		val betOutcome: String? = null,
		val priceRequested: Price? = null,
		val settledDate: Date? = null,
		val lastMatchedDate: Date? = null,
		val betCount: Int? = null,
		val commission: Size? = null,
		val priceMatched: Price? = null,
		val priceReduced: Boolean? = null,
		val sizeSettled: Size? = null,
		val profit: Size? = null,
		val sizeCancelled: Size? = null,
		val customerOrderRef: String? = null,
		val customerStrategyRef: String? = null)
