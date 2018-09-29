package betfair.model

internal data class MarketLineRangeInfo(
		val maxUnitValue: Double,
		val minUnitValue: Double,
		val interval: Double,
		val marketUnit: String)
