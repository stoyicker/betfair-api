package betfair

class Config(
		internal val applicationId: CharSequence,
		internal val username: CharSequence,
		internal val password: CharSequence) {
	internal var sessionToken: String? = null
}
