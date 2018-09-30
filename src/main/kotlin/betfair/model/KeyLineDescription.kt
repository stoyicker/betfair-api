package betfair.model

import com.squareup.moshi.Json

internal data class KeyLineDescription(
		@Json(name = "keyLine")
		private val keyLine: List<KeyLineSelection>? = null)
