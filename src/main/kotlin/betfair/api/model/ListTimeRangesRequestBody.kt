package betfair.api.model

import betfair.model.MarketFilter
import betfair.model.TimeGranularity
import com.squareup.moshi.Json

internal data class ListTimeRangesRequestBody(
		@Json(name = "filter")
		private val filter: MarketFilter,
		@Json(name = "granularity")
		private val granularity: TimeGranularity)
