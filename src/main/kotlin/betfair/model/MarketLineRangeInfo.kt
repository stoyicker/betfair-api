package betfair.model

data class MarketLineRangeInfo internal constructor(
		val maxUnitValue: Double,
		val minUnitValue: Double,
		val interval: Double,
		val marketUnit: String)
