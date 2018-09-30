package betfair.model

import com.squareup.moshi.Json

internal data class RunnerCatalog(
		@Json(name = "selectionId")
		private val selectionId: Long,
		@Json(name = "runnerName")
		private val runnerName: String,
		@Json(name = "handicap")
		private val handicap: Double,
		@Json(name = "sortPriority")
		private val sortPriority: Int,
		@Json(name = "metadata")
		private val metadata: Map<String, String>? = null)
