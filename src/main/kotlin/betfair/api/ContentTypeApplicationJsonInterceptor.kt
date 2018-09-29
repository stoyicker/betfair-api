package betfair.api

import okhttp3.Interceptor

internal class ContentTypeApplicationJsonInterceptor : Interceptor {
	override fun intercept(chain: Interceptor.Chain) = chain.proceed(chain.request())
			.newBuilder()
			.addHeader("Content-Type", "application/json")
			.build()!!
}
