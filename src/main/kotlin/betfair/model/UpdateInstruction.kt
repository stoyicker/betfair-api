package betfair.model

import com.squareup.moshi.Json

internal data class UpdateInstruction(
		@Json(name = "betId")
		private val betId: String,
		@Json(name = "newPersistenceType")
		private val newPersistenceType: PersistenceType)
