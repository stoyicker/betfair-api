package betfair.model

internal data class UpdateInstruction(
		val betId: String,
		val newPersistenceType: PersistenceType)
