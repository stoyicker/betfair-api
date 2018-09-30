package betfair.model

import com.squareup.moshi.Json

internal data class StartingPrices(
		@Json(name = "nearPrice")
		private val nearPrice: Double? = null,
		@Json(name = "farPrice")
		private val farPrice: Double? = null,
		@Json(name = "backStakeTaken")
		private val backStakeTaken: List<PriceSize>? = null,
		@Json(name = "layLiabilityTaken")
		private val layLiabilityTaken: List<PriceSize>? = null,
		@Json(name = "actualSP")
		private val actualSP: Double? = null)
