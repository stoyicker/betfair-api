package betfair.model

internal data class MarketLicence(
		val wallet: String,
		val rules: String? = null,
		val rulesHasDate: Boolean? = null,
		val clarifications: String? = null)
