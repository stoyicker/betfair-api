package betfair.model

import com.squareup.moshi.Json

internal data class ExBestOffersOverrides(
		@Json(name = "bestPricesDepth")
		private val bestPricesDepth: Int? = null,
		@Json(name = "rollupModel")
		private val rollupModel: RollupModel? = null,
		@Json(name = "rollupLimit")
		private val rollupLimit: Int? = null,
		@Json(name = "rollupLiabilityThreshold")
		private val rollupLiabilityThreshold: Double? = null,
		@Json(name = "rollupLiabilityFactor")
		private val rollupLiabilityFactor: Int? = null)
