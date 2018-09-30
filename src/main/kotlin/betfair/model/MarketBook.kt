package betfair.model

import com.squareup.moshi.Json
import java.util.Date

internal data class MarketBook(
		@Json(name = "marketId")
		private val marketId: String,
		@Json(name = "isMarketDataDelayed")
		private val isMarketDataDelayed: Boolean,
		@Json(name = "status")
		private val status: MarketStatus? = null,
		@Json(name = "betDelay")
		private val betDelay: Int? = null,
		@Json(name = "bspReconciled")
		private val bspReconciled: Boolean? = null,
		@Json(name = "complete")
		private val complete: Boolean? = null,
		@Json(name = "inplay")
		private val inPlay: Boolean? = null,
		@Json(name = "numberOfWinners")
		private val numberOfWinners: Int? = null,
		@Json(name = "numberOfRunners")
		private val numberOfRunners: Int? = null,
		@Json(name = "numberOfActiveRunners")
		private val numberOfActiveRunners: Int? = null,
		@Json(name = "lastMatchTime")
		private val lastMatchTime: Date? = null,
		@Json(name = "totalMatched")
		private val totalMatched: Double? = null,
		@Json(name = "totalAvailable")
		private val totalAvailable: Double? = null,
		@Json(name = "crossMatching")
		private val crossMatching: Boolean? = null,
		@Json(name = "runnersVoidable")
		private val runnersVoidable: Boolean? = null,
		@Json(name = "version")
		private val version: Long? = null,
		@Json(name = "runners")
		private val runners: List<Runner>? = null,
		@Json(name = "keyLineDescription")
		private val keyLineDescription: KeyLineDescription? = null)
