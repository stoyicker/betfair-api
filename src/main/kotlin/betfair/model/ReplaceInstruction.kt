package betfair.model

import com.squareup.moshi.Json

internal data class ReplaceInstruction(
		@Json(name = "betId")
		private val betId: String,
		@Json(name = "newPrice")
		private val newPrice: Double)
