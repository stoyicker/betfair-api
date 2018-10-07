package betfair

import betfair.api.AcceptJsonInterceptor
import betfair.api.ApplicationKeyInterceptor
import betfair.api.AuthenticationInterceptor
import betfair.api.BettingJsonApiService
import betfair.api.BotLoginApiService
import betfair.api.ContentTypeApplicationJsonInterceptor
import betfair.api.HttpCompressionInterceptor
import betfair.api.HttpKeepAliveInterceptor
import betfair.api.HttpNoCacheInterceptor
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

// TODO Afterwards, configure the authentication client to use the certificate
class BettingApiClient private constructor(bettingJsonService: BettingJsonApiService)
	: BettingJsonApiService by bettingJsonService {
	companion object {
		private const val TIMEOUT_SECONDS = 30L
		fun from(config: Config) = OkHttpClient.Builder()
				.connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
				.readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
				.writeTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
				.addInterceptor(AcceptJsonInterceptor())
				.addInterceptor(ApplicationKeyInterceptor(config.applicationKey))
				.addInterceptor(AuthenticationInterceptor(
						OkHttpClient.Builder()
								.connectTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
								.readTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
								.writeTimeout(TIMEOUT_SECONDS, TimeUnit.SECONDS)
								.addInterceptor(AcceptJsonInterceptor())
								.addInterceptor(ApplicationKeyInterceptor(config.applicationKey))
								.addInterceptor(HttpCompressionInterceptor())
								.addInterceptor(HttpKeepAliveInterceptor())
								.addInterceptor(HttpNoCacheInterceptor())
								.build().run {
									Retrofit.Builder()
											.client(this)
											.baseUrl(BotLoginApiService.ENDPOINT)
											.addConverterFactory(MoshiConverterFactory.create())
											.build()
											.create(BotLoginApiService::class.java)
								},
						config))
				.addInterceptor(ContentTypeApplicationJsonInterceptor())
				.addInterceptor(HttpCompressionInterceptor())
				.addInterceptor(HttpKeepAliveInterceptor())
				.addInterceptor(HttpNoCacheInterceptor())
				.build().apply {
					Retrofit.Builder()
							.client(this)
							.baseUrl(BotLoginApiService.ENDPOINT)
							.addConverterFactory(MoshiConverterFactory.create())
							.addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
							.build()
							.create(BotLoginApiService::class.java)
				}
	}
}
