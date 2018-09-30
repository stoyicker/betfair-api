package betfair.model

import com.squareup.moshi.Json

internal data class CountryCodeResult(
		@Json(name = "countryCode")
		val countryCode: String? = null,
		@Json(name = "marketCount")
		val marketCount: Int? = null)
