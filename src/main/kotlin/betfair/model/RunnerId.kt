package betfair.model

import com.squareup.moshi.Json

internal data class RunnerId(
		@Json(name = "marketId")
		private val marketId: MarketId? = null,
		@Json(name = "selectionId")
		private val selectionId: SelectionId? = null,
		@Json(name = "handicap")
		private val handicap: Handicap? = null)
