package betfair.model

data class UpdateInstruction internal constructor(
		val betId: String,
		val newPersistenceType: PersistenceType)
