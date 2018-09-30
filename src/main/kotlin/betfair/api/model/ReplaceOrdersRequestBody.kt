package betfair.api.model

import betfair.model.MarketVersion
import betfair.model.ReplaceInstruction
import com.squareup.moshi.Json
import kotlin.properties.Delegates

internal data class ReplaceOrdersRequestBody(
		@Json(name = "marketId")
		private val marketId: String,
		@Transient
		private val instructions: List<ReplaceInstruction>,
		@Transient
		private val customerRef: String? = null,
		@Json(name = "marketVersion")
		private val marketVersion: MarketVersion? = null,
		@Json(name = "async")
		private val async: Boolean? = null) {
	@Json(name = "instructions")
	private var safeInstructions: List<ReplaceInstruction> by Delegates.vetoable(emptyList()) { prop, _, new ->
		if (new.size > 60) {
			throw IllegalArgumentException("Illegal value for ${prop.name}: $new")
		}
		true
	}
	@Json(name = "customerRef")
	private var safeCustomerRef: String? by Delegates.vetoable(null as String?) { prop, _, new ->
		// Max length
		if (new == null || new.length > 32) {
			throw IllegalArgumentException("Illegal value for ${prop.name}: $new")
		}
		true
	}

	init {
		safeInstructions = instructions
		safeCustomerRef = customerRef
	}
}
