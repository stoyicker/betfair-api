package betfair.model

import com.squareup.moshi.Json

internal data class RunnerProfitAndLoss(
		@Json(name = "selectionId")
		private val selectionId: SelectionId? = null,
		@Json(name = "ifWin")
		private val ifWin: Double? = null,
		@Json(name = "ifLose")
		private val ifLose: Double? = null,
		@Json(name = "ifPlace")
		private val ifPlace: Double? = null)
