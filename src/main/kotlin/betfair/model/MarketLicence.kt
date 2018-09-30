package betfair.model

import com.squareup.moshi.Json

internal data class MarketLicence(
		@Json(name = "wallet")
		private val wallet: String,
		@Json(name = "rules")
		private val rules: String? = null,
		@Json(name = "rulesHasDate")
		private val rulesHasDate: Boolean? = null,
		@Json(name = "clarifications")
		private val clarifications: String? = null)
