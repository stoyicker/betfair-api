package betfair.api

import betfair.model.BetId
import betfair.model.BetStatus
import betfair.model.CancelExecutionReport
import betfair.model.CancelInstruction
import betfair.model.ClearedOrderSummaryReport
import betfair.model.CompetitionResult
import betfair.model.CountryCodeResult
import betfair.model.CurrentOrderSummaryReport
import betfair.model.EventId
import betfair.model.EventResult
import betfair.model.EventTypeId
import betfair.model.EventTypeResult
import betfair.model.GroupBy
import betfair.model.Locale
import betfair.model.MarketBook
import betfair.model.MarketCatalogue
import betfair.model.MarketFilter
import betfair.model.MarketId
import betfair.model.MarketProfitAndLoss
import betfair.model.MarketProjection
import betfair.model.MarketSort
import betfair.model.MarketTypeResult
import betfair.model.MarketVersion
import betfair.model.MatchProjection
import betfair.model.OrderBy
import betfair.model.OrderProjection
import betfair.model.PlaceExecutionReport
import betfair.model.PlaceInstruction
import betfair.model.PriceProjection
import betfair.model.ReplaceExecutionReport
import betfair.model.ReplaceInstruction
import betfair.model.RunnerId
import betfair.model.SelectionId
import betfair.model.Side
import betfair.model.SortDir
import betfair.model.TimeGranularity
import betfair.model.TimeRange
import betfair.model.TimeRangeResult
import betfair.model.UpdateExecutionReport
import betfair.model.UpdateInstruction
import betfair.model.VenueResult
import retrofit2.Call
import retrofit2.http.POST
import java.util.Date

// TODO Review all methods to add @Query(paramKey) annotations and review mandatory parameters
// TODO Review the full response structure (potential wrapper?)
// TODO Review exception strucutre correctness (wrapper maybe needed here too?)

internal interface BettingJsonApiService {
	companion object {
		const val ENDPOINT = "https://api.betfair.com/exchange/betting/rest/v1.0/"
	}

	@POST("listEventTypes")
	fun listEventTypes(marketFilter: MarketFilter, locale: Locale): Call<List<EventTypeResult>>

	@POST("listCompetitions")
	fun listCompetitions(marketFilter: MarketFilter, locale: Locale): Call<List<CompetitionResult>>

	@POST("listTimeRanges")
	fun listTimeRanges(marketFilter: MarketFilter, granularity: TimeGranularity): Call<List<TimeRangeResult>>

	@POST("listEvents")
	fun listEvents(marketFilter: MarketFilter, locale: Locale): Call<List<EventResult>>

	@POST("listMarketTypes")
	fun listMarketTypes(marketFilter: MarketFilter, locale: Locale): Call<List<MarketTypeResult>>

	@POST("listCountries")
	fun listCountries(marketFilter: MarketFilter, locale: Locale): Call<List<CountryCodeResult>>

	@POST("listVenues")
	fun listVenues(marketFilter: MarketFilter, locale: Locale): Call<List<VenueResult>>

	@POST("listMarketCatalogue")
	fun listMarketCatalogue(
			marketFilter: MarketFilter,
			marketProjection: List<MarketProjection>,
			sort: MarketSort,
			maxResults: Int,
			locale: Locale): Call<List<MarketCatalogue>>

	@POST("listMarketBook")
	fun listMarketBook(
			marketIds: List<String>,
			priceProjection: PriceProjection,
			orderProjection: OrderProjection,
			matchProjection: MatchProjection,
			includeOverallPosition: Boolean,
			partitionMatchedByStrategyRef: Boolean,
			customerStrategyRefs: List<String>,
			currencyCode: String,
			locale: Locale,
			matchedSince: Date,
			betIds: List<BetId>): Call<List<MarketBook>>

	@POST("listMarketBook")
	fun listRunnerBook(
			marketId: MarketId,
			selectionId: SelectionId,
			handicap: Double,
			priceProjection: PriceProjection,
			orderProjection: OrderProjection,
			matchProjection: MatchProjection,
			includeOverallPosition: Boolean,
			partitionMatchedByStrategyRef: Boolean,
			customerStrategyRefs: List<String>,
			currencyCode: String,
			locale: Locale,
			matchedSince: Date,
			betIds: List<BetId>): Call<List<MarketBook>>

	@POST("listMarketProfitAndLoss")
	fun listMarketProfitAndLoss(
			marketIds: List<String>,
			includeSettledBets: Boolean,
			includeBspBets: Boolean,
			netOfCommission: Boolean): Call<List<MarketProfitAndLoss>>

	@POST("listCurrentOrders")
	fun listCurrentOrders(
			betIds: List<BetId>,
			marketIds: List<String>,
			orderProjection: OrderProjection,
			placedDateRange: TimeRange,
			dateRange: TimeRange,
			orderBy: OrderBy,
			sortDir: SortDir,
			fromRecord: Int,
			recordCount: Int): Call<CurrentOrderSummaryReport>

	@POST("listClearedOrders")
	fun listClearedOrders(
			betStatus: BetStatus,
			eventTypeIds: List<EventTypeId>,
			eventIds: List<EventId>,
			marketIds: List<MarketId>,
			runnerIds: List<RunnerId>,
			betIds: List<BetId>,
			side: Side,
			settledDateRange: TimeRange,
			groupBy: GroupBy,
			includeItemDescription: Boolean,
			locale: Locale,
			fromRecord: Int,
			recordCount: Int): Call<ClearedOrderSummaryReport>

	@POST("placeOrders")
	fun placeOrders(
			marketId: String,
			instructions: List<PlaceInstruction>,
			customerRef: String,
			marketVersion: MarketVersion,
			customerStrategyRef: String,
			async: Boolean): Call<PlaceExecutionReport>

	@POST("cancelOrders")
	fun cancelOrders(
			marketId: String,
			instructions: List<CancelInstruction>,
			customerRef: String): Call<CancelExecutionReport>

	@POST("replaceOrders")
	fun replaceOrders(
			marketId: String,
			instructions: List<ReplaceInstruction>,
			customerRef: String,
			marketVersion: MarketVersion,
			async: Boolean): Call<ReplaceExecutionReport>

	@POST("updateOrders")
	fun updateOrders(
			marketId: String,
			instructions: List<UpdateInstruction>,
			customerRef: String): Call<UpdateExecutionReport>
}
