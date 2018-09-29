package betfair.model

data class CancelInstruction internal constructor(
		val betId: String,
		val sizeReduction: Double? = null)
