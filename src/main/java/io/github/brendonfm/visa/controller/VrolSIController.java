/**
 * 
 */

package io.github.brendonfm.visa.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.brendonfm.visa.dto.SISubmitFraudReportRequestType;
import io.github.brendonfm.visa.dto.SISubmitFraudReportResponseType;
import io.github.brendonfm.visa.dto.SISubmitTranInquiryRequestType;
import io.github.brendonfm.visa.dto.SISubmitTranInquiryResponseType;
import io.github.brendonfm.visa.dto.client.VisaClientFactory;

/**
 * @author github.com/brendonfm
 */
@RestController
@RequestMapping("/")
public class VrolSIController {

	@Value("${visa.api.rol.si.url}")
	private String baseUrl;
	@Value("${visa.api.connectionTimeoutLimit}")
	private Integer connectionTimeoutLimit;
	@Value("${visa.api.clientKeyStorePath}")
	private String clientKeyStorePath;
	@Value("${visa.api.sslLogPath}")
	private String sslLogPath;
	@Value("${visa.api.debugSSL}")
	private Boolean debugSSL;
	@Value("${visa.api.useCertificate}")
	private Boolean useCertificate;
	@Value("${visa.api.username}")
	private String username;
	@Value("${visa.api.password}")
	private String password;
	@Value("${visa.api.certificate.password}")
	private String certificatePassword;

	@PostMapping("submitTranInquiry")
	public SISubmitTranInquiryResponseType submitTranInquiry(
			@RequestBody final SISubmitTranInquiryRequestType requestDto) throws KeyManagementException,
			UnrecoverableKeyException,
			KeyStoreException,
			NoSuchAlgorithmException,
			CertificateException,
			FileNotFoundException,
			IOException {
		return VisaClientFactory
				.create(baseUrl,
						connectionTimeoutLimit,
						clientKeyStorePath,
						sslLogPath,
						debugSSL,
						useCertificate,
						username,
						password,
						certificatePassword)
				.submitTranInquiry(requestDto);
	}

	@PostMapping("submitFraudReport")
	public SISubmitFraudReportResponseType submitFraudReport(
			@RequestBody final SISubmitFraudReportRequestType requestDto) throws KeyManagementException,
			UnrecoverableKeyException,
			KeyStoreException,
			NoSuchAlgorithmException,
			CertificateException,
			FileNotFoundException,
			IOException {
		return VisaClientFactory
				.create(baseUrl,
						connectionTimeoutLimit,
						clientKeyStorePath,
						sslLogPath,
						debugSSL,
						useCertificate,
						username,
						password,
						certificatePassword)
				.submitFraudReport(requestDto);

	}

}
