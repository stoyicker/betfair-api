package betfair.model

import com.squareup.moshi.Json

internal data class CancelInstruction(
		@Json(name = "betId")
		private val betId: String,
		@Json(name = "sizeReduction")
		private val sizeReduction: Double? = null)
