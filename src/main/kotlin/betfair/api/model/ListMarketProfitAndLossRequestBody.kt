package betfair.api.model

import com.squareup.moshi.Json

internal data class ListMarketProfitAndLossRequestBody(
		@Json(name = "marketIds")
		private val marketIds: List<String>? = null,
		@Json(name = "includeSettledBets")
		private val includeSettledBets: Boolean? = null,
		@Json(name = "includeBspBets")
		private val includeBspBets: Boolean? = null,
		@Json(name = "netOfCommission")
		private val netOfCommission: Boolean? = null)
