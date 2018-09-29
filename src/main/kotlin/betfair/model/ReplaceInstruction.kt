package betfair.model

internal data class ReplaceInstruction(
		val betId: String,
		val newPrice: Double)
