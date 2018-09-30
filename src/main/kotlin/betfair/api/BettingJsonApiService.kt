package betfair.api

import betfair.api.model.CancelOrdersRequestBody
import betfair.api.model.ListClearedOrdersRequestBody
import betfair.api.model.ListCompetitionsRequestBody
import betfair.api.model.ListCountriesRequestBody
import betfair.api.model.ListCurrentOrdersRequestBody
import betfair.api.model.ListEventTypesRequestBody
import betfair.api.model.ListEventsRequestBody
import betfair.api.model.ListMarketBookRequestBody
import betfair.api.model.ListMarketCatalogueRequestBody
import betfair.api.model.ListMarketProfitAndLossRequestBody
import betfair.api.model.ListMarketTypesRequestBody
import betfair.api.model.ListRunnerBookRequestBody
import betfair.api.model.ListTimeRangesRequestBody
import betfair.api.model.ListVenuesRequestBody
import betfair.api.model.PlaceOrdersRequestBody
import betfair.api.model.ReplaceOrdersRequestBody
import betfair.api.model.UpdateOrdersRequestBody
import betfair.model.CancelExecutionReport
import betfair.model.ClearedOrderSummaryReport
import betfair.model.CompetitionResult
import betfair.model.CountryCodeResult
import betfair.model.CurrentOrderSummaryReport
import betfair.model.EventResult
import betfair.model.EventTypeResult
import betfair.model.MarketBook
import betfair.model.MarketCatalogue
import betfair.model.MarketProfitAndLoss
import betfair.model.MarketTypeResult
import betfair.model.PlaceExecutionReport
import betfair.model.ReplaceExecutionReport
import betfair.model.TimeRangeResult
import betfair.model.UpdateExecutionReport
import betfair.model.VenueResult
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

internal interface BettingJsonApiService {
	companion object {
		const val ENDPOINT = "https://api.betfair.com/exchange/betting/rest/v1.0/"
	}

	@POST("listEventTypes")
	fun listEventTypes(@Body body: ListEventTypesRequestBody): Call<List<EventTypeResult>>

	@POST("listCompetitions")
	fun listCompetitions(@Body body: ListCompetitionsRequestBody): Call<List<CompetitionResult>>

	@POST("listTimeRanges")
	fun listTimeRanges(@Body body: ListTimeRangesRequestBody): Call<List<TimeRangeResult>>

	@POST("listEvents")
	fun listEvents(@Body body: ListEventsRequestBody): Call<List<EventResult>>

	@POST("listMarketTypes")
	fun listMarketTypes(@Body body: ListMarketTypesRequestBody): Call<List<MarketTypeResult>>

	@POST("listCountries")
	fun listCountries(@Body body: ListCountriesRequestBody): Call<List<CountryCodeResult>>

	@POST("listVenues")
	fun listVenues(@Body body: ListVenuesRequestBody): Call<List<VenueResult>>

	@POST("listMarketCatalogue")
	fun listMarketCatalogue(@Body body: ListMarketCatalogueRequestBody): Call<List<MarketCatalogue>>

	@POST("listMarketBook")
	fun listMarketBook(@Body body: ListMarketBookRequestBody): Call<List<MarketBook>>

	@POST("listMarketBook")
	fun listRunnerBook(@Body body: ListRunnerBookRequestBody): Call<List<MarketBook>>

	@POST("listMarketProfitAndLoss")
	fun listMarketProfitAndLoss(@Body body: ListMarketProfitAndLossRequestBody): Call<List<MarketProfitAndLoss>>

	@POST("listCurrentOrders")
	fun listCurrentOrders(@Body body: ListCurrentOrdersRequestBody): Call<CurrentOrderSummaryReport>

	@POST("listClearedOrders")
	fun listClearedOrders(@Body body: ListClearedOrdersRequestBody): Call<ClearedOrderSummaryReport>

	@POST("placeOrders")
	fun placeOrders(@Body body: PlaceOrdersRequestBody): Call<PlaceExecutionReport>

	@POST("cancelOrders")
	fun cancelOrders(@Body body: CancelOrdersRequestBody): Call<CancelExecutionReport>

	@POST("replaceOrders")
	fun replaceOrders(@Body body: ReplaceOrdersRequestBody): Call<ReplaceExecutionReport>

	@POST("updateOrders")
	fun updateOrders(@Body body: UpdateOrdersRequestBody): Call<UpdateExecutionReport>
}
