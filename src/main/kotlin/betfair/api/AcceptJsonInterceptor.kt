package betfair.api

import okhttp3.Interceptor

internal class AcceptJsonInterceptor : Interceptor {
	override fun intercept(chain: Interceptor.Chain) = chain.proceed(chain.request())
			.newBuilder()
			.addHeader("Accept", "application/json")
			.build()!!
}
