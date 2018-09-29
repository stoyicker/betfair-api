package betfair.model

data class LimitOrder internal constructor(
		val size: Double,
		val price: Double,
		val persistenceType: PersistenceType,
		val timeInForce: TimeInForce? = null,
		val minFillSize: Size? = null,
		val betTargetType: BetTargetType? = null,
		val betTargetSize: Size? = null)
