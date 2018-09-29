package betfair.model

internal enum class MarketBettingType {
	ODDS,
	LINE,
	@Deprecated(message = "Range Market - Now Deprecated")
	RANGE,
	ASIAN_HANDICAP_DOUBLE_LINE,
	ASIAN_HANDICAP_SINGLE_LINE,
	@Deprecated(
			message = "Sportsbook Odds Market. This type is deprecated and will be removed in future releases, when Sportsbook markets will be represented as ODDS market but with a different product type.",
			replaceWith = ReplaceWith("ODDS"))
	FIXED_ODDS
}
