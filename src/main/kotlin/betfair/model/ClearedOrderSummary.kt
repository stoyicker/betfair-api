package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class ClearedOrderSummary(
		@Json(name = "eventTypeId")
		private val eventTypeId: EventTypeId? = null,
		@Json(name = "eventId")
		private val eventId: EventId? = null,
		@Json(name = "marketId")
		private val marketId: MarketId? = null,
		@Json(name = "selectionId")
		private val selectionId: SelectionId? = null,
		@Json(name = "handicap")
		private val handicap: Handicap? = null,
		@Json(name = "betId")
		private val betId: BetId? = null,
		@Json(name = "placedDate")
		private val placedDate: Date? = null,
		@Json(name = "persistenceType")
		private val persistenceType: PersistenceType? = null,
		@Json(name =  "orderType")
		private val orderType: OrderType? = null,
		@Json(name = "side")
		private val side: Side? = null,
		@Json(name = "itemDescription")
		private val itemDescription: ItemDescription? = null,
		@Json(name = "betOutcome")
		private val betOutcome: String? = null,
		@Json(name = "priceRequested")
		private val priceRequested: Price? = null,
		@Json(name = "settledDate")
		private val settledDate: Date? = null,
		@Json(name = "lastMatchedDate")
		private val lastMatchedDate: Date? = null,
		@Json(name = "betCount")
		private val betCount: Int? = null,
		@Json(name = "commission")
		private val commission: Size? = null,
		@Json(name = "priceMatched")
		private val priceMatched: Price? = null,
		@Json(name = "priceReduced")
		private val priceReduced: Boolean? = null,
		@Json(name = "sizeSettled")
		private val sizeSettled: Size? = null,
		@Json(name = "profit")
		private val profit: Size? = null,
		@Json(name = "sizeCancelled")
		private val sizeCancelled: Size? = null,
		@Json(name = "customerOrderRef")
		private val customerOrderRef: String? = null,
		@Json(name = "customerStrategyRef")
		private val customerStrategyRef: String? = null)
