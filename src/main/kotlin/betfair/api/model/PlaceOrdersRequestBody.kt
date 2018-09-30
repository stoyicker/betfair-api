package betfair.api.model

import betfair.model.MarketVersion
import betfair.model.PlaceInstruction
import com.squareup.moshi.Json
import kotlin.properties.Delegates

internal data class PlaceOrdersRequestBody(
		@Json(name = "marketId")
		private val marketId: String,
		@Transient
		private val instructions: List<PlaceInstruction>,
		@Transient
		private val customerRef: String? = null,
		@Json(name = "marketVersion")
		private val marketVersion: MarketVersion? = null,
		@Transient
		private val customerStrategyRef: String? = null,
		@Json(name = "async")
		private val async: Boolean? = null) {
	@Json(name = "instructions")
	private var safeInstructions: List<PlaceInstruction> by Delegates.vetoable(emptyList()) { prop, _, new ->
		// Note that this is lower for the italian exchange
		if (new.size > 200) {
			throw IllegalArgumentException("Illegal value for ${prop.name}: $new")
		}
		true
	}
	@Json(name = "customerRef")
	private var safeCustomerRef: String? by Delegates.vetoable(null as String?) { prop, _, new ->
		// Max length
		if (new != null && new.length > 32) {
			throw IllegalArgumentException("Illegal value for ${prop.name}: $new")
		}
		true
	}
	@Json(name = "customerStrategyRef")
	private var safeCustomerStrategyRef: String? by Delegates.vetoable(null as String?) { prop, _, new ->
		// Max length
		if (new != null && new.length > 15) {
			throw IllegalArgumentException("Illegal value for ${prop.name}: $new")
		}
		true
	}

	init {
		safeInstructions = instructions
		safeCustomerRef = customerRef
		safeCustomerStrategyRef = customerStrategyRef
	}
}
