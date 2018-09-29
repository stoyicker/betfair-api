package betfair.api

import okhttp3.Interceptor

internal class HttpCompressionInterceptor : Interceptor {
	override fun intercept(chain: Interceptor.Chain) = chain.proceed(chain.request())
			.newBuilder()
			.addHeader("Accept-Encoding", "gzip, deflate")
			.build()!!
}