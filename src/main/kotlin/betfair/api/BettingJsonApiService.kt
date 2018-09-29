package betfair.api

internal interface BettingJsonApiService {
	companion object {
		const val ENDPOINT = "https://api.betfair.com/exchange/betting/rest/v1.0/"
	}

	fun listEventTypes()

	fun listCompetitions()

	fun listTimeRanges()

	fun listEvents()

	fun listMarketTypes()

	fun listCountries()

	fun listVenues()

	fun listMarketCatalogue()

	fun listMarketBook()

	fun listRunnerBook()

	fun listMarketProfitAndLoss()

	fun listCurrentOrders()

	fun listClearedOrders()

	fun placeOrders()

	fun cancelOrders()

	fun replaceOrders()

	fun updateOrders()
}
