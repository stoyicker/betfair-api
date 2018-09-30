package betfair.model

import com.squareup.moshi.Json

internal data class PriceLadderDescription(
		@Json(name = "type")
		private val type: PriceLadderType? = null)