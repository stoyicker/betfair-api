package betfair.model

data class ExchangePrices internal constructor(
		val availableToBack: List<PriceSize>? = null,
		val availableToLay: List<PriceSize>? = null,
		val tradedVolume: List<PriceSize>? = null)
