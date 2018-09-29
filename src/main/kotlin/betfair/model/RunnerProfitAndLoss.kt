package betfair.model

internal data class RunnerProfitAndLoss(
		val selectionId: SelectionId? = null,
		val ifWin: Double? = null,
		val ifLose: Double? = null,
		val ifPlace: Double? = null)
