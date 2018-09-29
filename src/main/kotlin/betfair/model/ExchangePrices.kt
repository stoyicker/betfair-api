package betfair.model

internal data class ExchangePrices(
		val availableToBack: List<PriceSize>? = null,
		val availableToLay: List<PriceSize>? = null,
		val tradedVolume: List<PriceSize>? = null)
