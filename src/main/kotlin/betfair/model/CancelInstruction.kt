package betfair.model

internal data class CancelInstruction(
		val betId: String,
		val sizeReduction: Double? = null)
