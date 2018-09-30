package betfair.api.model

import betfair.model.UpdateInstruction
import com.squareup.moshi.Json
import kotlin.properties.Delegates

internal data class UpdateOrdersRequestBody(
		@Json(name = "marketId")
		private val marketId: String,
		@Transient
		private val instructions: List<UpdateInstruction>,
		@Transient
		private val customerRef: String) {
	@Json(name = "instructions")
	private var safeInstructions: List<UpdateInstruction> by Delegates.vetoable(emptyList()) { prop, _, new ->
		if (new.size > 60) {
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
