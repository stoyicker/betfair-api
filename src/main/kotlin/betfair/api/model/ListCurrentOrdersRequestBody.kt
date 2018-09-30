package betfair.api.model

import betfair.model.BetId
import betfair.model.OrderBy
import betfair.model.OrderProjection
import betfair.model.SortDir
import betfair.model.TimeRange
import com.squareup.moshi.Json
import kotlin.properties.Delegates

internal data class ListCurrentOrdersRequestBody(
		@Transient
		private val betIds: List<BetId>? = null,
		@Transient
		private val marketIds: List<String>? = null,
		@Json(name = "orderProjection")
		private val orderProjection: OrderProjection? = null,
		@Json(name = "placedDateRange")
		private val placedDateRange: TimeRange? = null,
		@Json(name = "dateRange")
		private val dateRange: TimeRange?,
		@Json(name = "orderBy")
		private val orderBy: OrderBy? = null,
		@Json(name = "sortDir")
		private val sortDir: SortDir? = null,
		@Json(name = "fromRecord")
		private val fromRecord: Int? = null,
		@Json(name = "recordCount")
		private val recordCount: Int? = null) {
	@Json(name = "betIds")
	// Make sure that the size is 250 at most
	private var safeBetIds: List<BetId>? by Delegates.vetoable(null as List<BetId>?) { prop, _, new ->
		if (new != null && new.size > 250) {
			throw IllegalArgumentException("Illegal value for ${prop.name}: $new")
		}
		true
	}
	@Json(name = "marketIds")
	// Make sure that the size is 250 at most
	private var safeMarketIds: List<String>? by Delegates.vetoable(null as List<String>?) { prop, _, new ->
		if (new != null && new.size > 250) {
			throw IllegalArgumentException("Illegal value for ${prop.name}: $new")
		}
		true
	}

	init {
		safeBetIds = betIds
		safeMarketIds = marketIds
	}
}
