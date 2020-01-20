
package io.github.brendonfm.visa.dto.client;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.net.ssl.TrustManager;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.provider.MultipartProvider;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import io.github.brendonfm.visa.util.LoggingUtils;

public class VisaClientFactoryMultipart {

	public static final List<Object> providers = new ArrayList<>();
	static {
		providers.add(new JacksonJaxbJsonProvider());
		providers.add(new JacksonJsonProvider());
		providers.add(new MultipartProvider());
	}

	public static VisaMultipart create(final String baseUrl,
			final Integer connectionTimeoutLimit,
			final String clientKeyStorePath,
			final String sslLogPath,
			final Boolean debugSSL,
			final Boolean useCertificate,
			final String username,
			final String password,
			final String certificatePassword) throws KeyManagementException,
			UnrecoverableKeyException,
			KeyStoreException,
			NoSuchAlgorithmException,
			CertificateException,
			FileNotFoundException,
			IOException {
		LoggingUtils.debug(VisaClientFactoryMultipart.class, "create", baseUrl);

		final VisaMultipart proxy = JAXRSClientFactory.create(baseUrl, VisaMultipart.class, providers);
		WebClient.client(proxy).accept(MediaType.APPLICATION_JSON_TYPE, MediaType.MULTIPART_FORM_DATA_TYPE).type(MediaType.MULTIPART_FORM_DATA_TYPE);

		final HTTPConduit http = (HTTPConduit) WebClient.getConfig(proxy).getConduit();
		final HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		httpClientPolicy.setConnectionTimeout(connectionTimeoutLimit);
		http.setClient(httpClientPolicy);

		final String usernameColonPassword = username + ":" + password;
		final String basicAuthPayload = "Basic " + Base64.getEncoder().encodeToString(usernameColonPassword.getBytes());
		WebClient.client(proxy).authorization(basicAuthPayload);

		if (useCertificate != null && useCertificate) {

			if (debugSSL) {
				System.setProperty("javax.net.debug", "all");
				final PrintStream printStream = new PrintStream(new FileOutputStream(sslLogPath));
				System.setOut(printStream);
				System.setErr(printStream);
			}

			System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
			System.setProperty("javax.net.ssl.keyStore", clientKeyStorePath);
			System.setProperty("javax.net.ssl.keyStorePassword", certificatePassword);

			final TLSClientParameters tcp = new TLSClientParameters();
			tcp.setTrustManagers(new TrustManager[] { new TrustAllX509TrustManager() });
			http.setTlsClientParameters(tcp);
		}

		LoggingUtils.debug(VisaClientFactoryMultipart.class, "create", proxy);
		return proxy;
	}

}
