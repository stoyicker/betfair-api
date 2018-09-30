package betfair.api.model

import betfair.model.Locale
import betfair.model.MarketFilter
import betfair.model.MarketProjection
import betfair.model.MarketSort
import com.squareup.moshi.Json
import kotlin.properties.Delegates

internal data class ListMarketCatalogueRequestBody(
		@Json(name = "filter")
		private val filter: MarketFilter,
		@Json(name = "marketProjection")
		private val marketProjection: List<MarketProjection>? = null,
		@Json(name = "sort")
		private val sort: MarketSort? = null,
		@Transient // Delegated to safeMaxResults
		private val maxResults: Int,
		@Json(name = "locale")
		private val locale: Locale? = null) {
	@Json(name = "maxResults")
	// Make sure that the value is between 1 and 1000 (both inclusive)
	private var safeMaxResults: Int by Delegates.vetoable(1) { prop, _, new ->
		if (new < 1 || new > 1000) {
				throw IllegalArgumentException("Illegal value for ${prop.name}: $new")
		}
		true
	}

	init {
		safeMaxResults = maxResults
	}
}
