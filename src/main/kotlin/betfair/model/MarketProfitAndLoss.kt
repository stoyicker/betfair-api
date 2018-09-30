package betfair.model

import com.squareup.moshi.Json

internal data class MarketProfitAndLoss(
		@Json(name = "marketId")
		private val marketId: String? = null,
		@Json(name = "commissionApplied")
		private val commissionApplied: Double? = null,
		@Json(name = "profitAndLosses")
		private val profitAndLosses: List<RunnerProfitAndLoss>? = null)
