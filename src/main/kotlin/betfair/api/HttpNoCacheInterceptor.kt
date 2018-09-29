package betfair.api

import okhttp3.Interceptor

internal class HttpNoCacheInterceptor : Interceptor {
	override fun intercept(chain: Interceptor.Chain) = chain.proceed(chain.request())
			.newBuilder()
			.addHeader("Cache-Control", "no-cache, no-store, must-revalidate")
			.addHeader("Pragma","no-cache")
			.addHeader("Expires", "0")
			.build()!!
}
