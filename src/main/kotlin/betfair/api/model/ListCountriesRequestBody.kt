package betfair.api.model

import betfair.model.Locale
import betfair.model.MarketFilter
import com.squareup.moshi.Json

internal data class ListCountriesRequestBody(
		@Json(name = "filter")
		private val filter: MarketFilter,
		@Json(name = "locale")
		private val locale: Locale? = null)
