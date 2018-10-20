package betfair.api

import java.security.SecureRandom
import javax.net.ssl.KeyManagerFactory
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.TrustManagerFactory
import java.security.KeyStore

internal object SSLSocketFactoryHolder {
	internal val socketFactory: SSLSocketFactory by lazy {
		val sslContext = SSLContext.getInstance("SSL")
		val trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm())
		val keyStore = readKeyStore()
		trustManagerFactory.init(keyStore)
		val keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm())
		keyManagerFactory.init(keyStore, "keystore_pass".toCharArray())
		sslContext.init(keyManagerFactory.keyManagers, trustManagerFactory.trustManagers, SecureRandom())
		sslContext.socketFactory
	}

	private fun readKeyStore(): KeyStore {
		val ks = KeyStore.getInstance(KeyStore.getDefaultType())

		// get user password and file input stream
		val password = getPassword()

		var fis: java.io.FileInputStream? = null
		try {
			fis = java.io.FileInputStream("keyStoreName")
			ks.load(fis, password)
		} finally {
			fis?.close()
		}
		return ks
	}
}