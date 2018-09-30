package betfair.api.model

import betfair.model.CancelInstruction
import com.squareup.moshi.Json
import kotlin.properties.Delegates

internal data class CancelOrdersRequestBody(
		@Json(name = "marketId")
		private val marketId: String? = null,
		@Transient
		private val instructions: List<CancelInstruction>? = null,
		@Transient
		private val customerRef: String? = null) {
	@Json(name = "instructions")
	private var safeInstructions: List<CancelInstruction>? by Delegates.vetoable(null as List<CancelInstruction>?) { prop, _, new ->
		if (new != null && new.size > 60) {
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

	init {
		safeInstructions = instructions
		safeCustomerRef = customerRef
	}
}
