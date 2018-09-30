package betfair.api.model

import betfair.model.BetId
import betfair.model.BetStatus
import betfair.model.EventId
import betfair.model.EventTypeId
import betfair.model.GroupBy
import betfair.model.Locale
import betfair.model.MarketId
import betfair.model.RunnerId
import betfair.model.Side
import betfair.model.TimeRange
import com.squareup.moshi.Json

internal data class ListClearedOrdersRequestBody(
		@Json(name = "betStatus")
		private val betStatus: BetStatus? = null,
		@Json(name = "eventTypeIds")
		private val eventTypeIds: List<EventTypeId>? = null,
		@Json(name = "eventIds")
		private val eventIds: List<EventId>? = null,
		@Json(name = "marketIds")
		private val marketIds: List<MarketId>? = null,
		@Json(name = "runnerIds")
		private val runnerIds: List<RunnerId>? = null,
		@Json(name = "betIds")
		private val betIds: List<BetId>? = null,
		@Json(name = "side")
		private val side: Side? = null,
		@Json(name = "settledDateRange")
		private val settledDateRange: TimeRange? = null,
		@Json(name = "groupBy")
		private val groupBy: GroupBy? = null,
		@Json(name = "includeItemDescription")
		private val includeItemDescription: Boolean? = null,
		@Json(name = "locale")
		private val locale: Locale? = null,
		@Json(name = "fromRecord")
		private val fromRecord: Int? = null,
		@Json(name = "recordCount")
		private val recordCount: Int? = null)
