package betfair.model

import com.squareup.moshi.Json

internal data class MarketFilter(
		@Json(name = "textQuery")
		private val textQuery: String? = null,
		@Json(name = "exchangeIds")
		private val exchangeIds: List<String>? = null,
		@Json(name = "eventTypeIds")
		private val eventTypeIds: List<String>? = null,
		@Json(name = "eventIds")
		private val eventIds: List<String>? = null,
		@Json(name = "competitionIds")
		private val competitionIds: List<String>? = null,
		@Json(name = "marketIds")
		private val marketIds: List<String>? = null,
		@Json(name = "venues")
		private val venues: List<String>? = null,
		@Json(name = "bspOnly")
		private val bspOnly: List<String>? = null,
		@Json(name = "turnInPlayEnabled")
		private val turnInPlayEnabled: Boolean? = null,
		@Json(name = "inPlayOnly")
		private val inPlayOnly: Boolean? = null,
		@Json(name = "marketBettingTypes")
		private val marketBettingTypes: List<MarketBettingType>? = null,
		@Json(name = "marketCountries")
		private val marketCountries: List<String>? = null,
		@Json(name = "marketTypeCodes")
		private val marketTypeCodes: List<String>? = null,
		@Json(name = "marketStartTime")
		private val marketStartTime: TimeRange? = null,
		@Json(name = "withOrders")
		private val withOrders: List<OrderStatus>? = null,
		@Json(name = "raceTypes")
		private val raceTypes: List<String>? = null)
