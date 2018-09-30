package betfair.api.model

import betfair.model.BetId
import betfair.model.Locale
import betfair.model.MatchProjection
import betfair.model.OrderProjection
import betfair.model.PriceProjection
import com.squareup.moshi.Json
import java.util.Date
import kotlin.properties.Delegates

internal data class ListMarketBookRequestBody(
		@Json(name = "marketIds")
		private val marketIds: List<String>,
		@Json(name = "priceProjection")
		private val priceProjection: PriceProjection? = null,
		@Json(name = "orderProjection")
		private val orderProjection: OrderProjection? = null,
		@Json(name = "matchProjection")
		private val matchProjection: MatchProjection? = null,
		@Json(name = "includeOverallPosition")
		private val includeOverallPosition: Boolean? = null,
		@Json(name = "partitionMatchedByStrategyRef")
		private val partitionMatchedByStrategyRef: Boolean? = null,
		@Transient
		private val customerStrategyRefs: List<String>? = null,
		@Json(name = "currencyCode")
		private val currencyCode: String? = null,
		@Json(name = "locale")
		private val locale: Locale? = null,
		@Json(name = "matchedSince")
		private val matchedSince: Date? = null,
		@Transient
		private val betIds: List<BetId>? = null) {
	@Json(name = "betIds")
	// Make sure that the size is 250 at most
	private var safeBetIds: List<BetId>? by Delegates.vetoable(null as List<BetId>?) { prop, _, new ->
		if (new != null && new.size > 250) {
			throw IllegalArgumentException("Illegal value for ${prop.name}: $new")
		}
		true
	}
	@Json(name = "customerStrategyRef")
	private var safeCustomerStrategyRefs: List<String>? by Delegates.vetoable(null as List<String>?) { prop, _, new ->
		// Max length of a single one
		if (new != null && new.any { it.length > 15 }) {
			throw IllegalArgumentException("Illegal value for ${prop.name}: $new")
		}
		true
	}

	init {
		safeBetIds = betIds
		safeCustomerStrategyRefs = customerStrategyRefs
	}
}
