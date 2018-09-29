package betfair.model

internal data class MarketFilter(
        val textQuery: String? = null,
        val exchangeIds: List<String>? = null,
        val eventTypeIds: List<String>? = null,
        val eventIds: List<String>? = null,
        val competitionIds: List<String>? = null,
        val marketIds: List<String>? = null,
        val venues: List<String>? = null,
        val bspOnly: List<String>? = null,
        val turnInPlayEnabled: Boolean? = null,
        val inPlayOnly: Boolean? = null,
        val marketBettingTypes: List<MarketBettingType>? = null,
        val marketCountries: List<String>? = null,
        val marketTypeCodes: List<String>? = null,
        val marketStartTime: TimeRange? = null,
        val withOrders: List<OrderStatus>? = null,
        val raceTypes: List<String>? = null)
