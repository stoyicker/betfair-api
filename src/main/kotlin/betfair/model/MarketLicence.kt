package betfair.model

data class MarketLicence internal constructor(
		val wallet: String,
		val rules: String? = null,
		val rulesHasDate: Boolean? = null,
		val clarifications: String? = null)
