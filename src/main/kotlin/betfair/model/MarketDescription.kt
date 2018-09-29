package betfair.model

import java.util.Date

internal data class MarketDescription(
		val persistenceEnabled: Boolean,
		val bspMarket: Boolean,
		val marketTime: Date,
		val suspendTime: Date,
		val settleTime: Date? = null,
		val bettingType: MarketBettingType,
		val turnInPlayEnabled: Boolean,
		val marketType: String,
		val regulator: String,
		val marketBaseRate: Double,
		val discountAllowed: Boolean,
		val wallet: String? = null,
		val rules: String? = null,
		val rulesHasDate: Boolean? = null,
		val eachWayDivisor: Double? = null,
		val clarifications: String? = null,
		val lineRangeInfo: MarketLineRangeInfo? = null,
		val raceType: String? = null,
		val priceLadderDescription: PriceLadderDescription? = null)
