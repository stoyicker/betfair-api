package betfair.model

import java.util.Date

internal data class MarketBook(
		val marketId: String,
		val isMarketDataDelayed: Boolean,
		val status: MarketStatus? = null,
		val betDelay: Int? = null,
		val bspReconciled: Boolean? = null,
		val complete: Boolean? = null,
		val inPlay: Boolean? = null,
		val numberOfWinners: Int? = null,
		val numberOfRunners: Int? = null,
		val numberOfActiveRunners: Int? = null,
		val lastMatchTime: Date? = null,
		val totalMatched: Double? = null,
		val totalAvailable: Double? = null,
		val crossMatching: Boolean? = null,
		val runnersVoidable: Boolean? = null,
		val version: Long? = null,
		val runners: List<Runner>? = null,
		val keyLineDescription: KeyLineDescription? = null)
