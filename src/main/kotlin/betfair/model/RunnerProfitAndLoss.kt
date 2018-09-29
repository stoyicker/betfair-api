package betfair.model

data class RunnerProfitAndLoss internal constructor(
		val selectionId: SelectionId? = null,
		val ifWin: Double? = null,
		val ifLose: Double? = null,
		val ifPlace: Double? = null)
