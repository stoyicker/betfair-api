package betfair

import java.time.LocalDateTime
import kotlin.properties.Delegates

class Config(
		internal val applicationKey: String,
		internal val username: CharSequence,
		internal val password: CharSequence) {
	internal var sessionToken: String? by Delegates.observable(null as String?) { _, _, _ -> true.also {
		lastSessionTokenUpdate = LocalDateTime.now()
	}
	}
	internal var lastSessionTokenUpdate = LocalDateTime.now()
		private set
}
