package betfair.model

import com.squareup.moshi.Json

internal data class Competition(
		@Json(name = "id")
		val id: String? = null,
		@Json(name = "name")
		val name: String? = null)
