package betfair.api

import okhttp3.Interceptor

internal class HttpKeepAliveInterceptor : Interceptor {
	override fun intercept(chain: Interceptor.Chain) = chain.proceed(chain.request())
			.newBuilder()
			.addHeader("Connection", "keep-alive")
			.build()!!
}