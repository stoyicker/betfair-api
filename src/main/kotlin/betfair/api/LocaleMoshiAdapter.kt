package betfair.api

import betfair.model.Locale
import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson

internal class LocaleMoshiAdapter {
	@FromJson
	fun fromJson(json: String?) = when (json) {
		Locale.BULGARIAN.name -> Locale.BULGARIAN
		Locale.CZECH.name -> Locale.CZECH
		Locale.DANISH.name -> Locale.DANISH
		Locale.ENGLISH.name -> Locale.ENGLISH
		Locale.FRENCH.name -> Locale.FRENCH
		Locale.GERMAN.name -> Locale.GERMAN
		Locale.GREEK.name -> Locale.GREEK
		Locale.ITALIAN.name -> Locale.ITALIAN
		Locale.KOREAN.name -> Locale.KOREAN
		Locale.PORTUGUESE.name -> Locale.PORTUGUESE
		Locale.SPANISH.name -> Locale.SPANISH
		Locale.SWEDISH.name -> Locale.SWEDISH
		Locale.THAI.name -> Locale.THAI
		Locale.TURKISH.name -> Locale.TURKISH
		null -> null
		else -> throw IllegalArgumentException("Locale $json not supported, implement!")
	}

	@ToJson
  fun toJson(locale: Locale?) = locale?.code
}
