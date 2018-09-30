package betfair.model

import com.squareup.moshi.Json

internal data class KeyLineSelection(
		@Json(name = "selectionId")
		private val selectionId: SelectionId? = null,
		@Json(name = "handicap")
		private val handicap: Handicap? = null)
