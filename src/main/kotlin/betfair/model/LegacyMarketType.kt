package betfair.model

@Deprecated(message = "marketType - Legacy Data", replaceWith = ReplaceWith("MarketType"))
internal enum class LegacyMarketType {
	A,
	L,
	O,
	R,
	NOT_APPLICABLE
}
