package betfair.model

data class LimitOnCloseOrder internal constructor(
		val liability: Double,
		val price: Double)
