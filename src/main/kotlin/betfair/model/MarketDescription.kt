package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class MarketDescription(
		@Json(name = "persistenceEnabled")
		private val persistenceEnabled: Boolean,
		@Json(name = "bspMarket")
		private val bspMarket: Boolean,
		@Json(name = "marketTime")
		private val marketTime: Date,
		@Json(name = "suspendTime")
		private val suspendTime: Date,
		@Json(name = "settleTime")
		private val settleTime: Date? = null,
		@Json(name = "bettingType")
		private val bettingType: MarketBettingType,
		@Json(name = "turnInPlayEnabled")
		private val turnInPlayEnabled: Boolean,
		@Json(name = "marketType")
		private val marketType: String,
		@Json(name = "regulator")
		private val regulator: String,
		@Json(name = "marketBaseRate")
		private val marketBaseRate: Double,
		@Json(name = "discountAllowed")
		private val discountAllowed: Boolean,
		@Json(name = "wallet")
		private val wallet: String? = null,
		@Json(name = "rules")
		private val rules: String? = null,
		@Json(name = "rulesHasDate")
		private val rulesHasDate: Boolean? = null,
		@Json(name = "eachWayDivisor")
		private val eachWayDivisor: Double? = null,
		@Json(name = "clarifications")
		private val clarifications: String? = null,
		@Json(name = "lineRangeInfo")
		private val lineRangeInfo: MarketLineRangeInfo? = null,
		@Json(name = "raceType")
		private val raceType: String? = null,
		@Json(name = "priceLadderDescription")
		private val priceLadderDescription: PriceLadderDescription? = null)
