package betfair.model

data class ReplaceInstruction internal constructor(
		val betId: String,
		val newPrice: Double)
