package betfair.api

import okhttp3.Interceptor

class ApplicationKeyInterceptor(private val applicationId: String) : Interceptor {
	override fun intercept(chain: Interceptor.Chain) = chain.proceed(chain.request())
			.newBuilder()
			.addHeader("X-Application", applicationId)
			.build()!!
}