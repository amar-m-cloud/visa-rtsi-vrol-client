
package io.github.brendonfm.visa.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class DisputeCaseInformationType {

	@JsonProperty("FraudClassification")
	private String fraudClassification;
	@JsonProperty("InitiatorAndSource")
	private String initiatorAndSource;
	@JsonProperty("CardholderContactDate")
	@JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss",
			shape = JsonFormat.Shape.STRING,
			locale = "pt-BR",
			timezone = "Brazil/East")
	private Date cardholderContactDate;
	@JsonProperty("CardholderWrittenNotiffDate")
	@JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss",
			shape = JsonFormat.Shape.STRING,
			locale = "pt-BR",
			timezone = "Brazil/East")
	private Date cardholderWrittenNotiffDate;
	@JsonProperty("FollowUpDate")
	@JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss",
			shape = JsonFormat.Shape.STRING,
			locale = "pt-BR",
			timezone = "Brazil/East")
	private Date followUpDate;
	@JsonProperty("FeeAmount")
	private BigDecimal feeAmount;
	@JsonProperty("RegEIndicator")
	private Boolean regEIndicator;
	@JsonProperty("RegZIndicator")
	private Boolean regZIndicator;
	@JsonProperty("RegERegZExpirationDate")
	@JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss",
			shape = JsonFormat.Shape.STRING,
			locale = "pt-BR",
			timezone = "Brazil/East")
	private Date regERegZExpirationDate;

	/**
	 * @param fraudClassification
	 * @param initiatorAndSource
	 * @param cardholderContactDate
	 * @param cardholderWrittenNotiffDate
	 * @param followUpDate
	 * @param feeAmount
	 * @param regEIndicator
	 * @param regZIndicator
	 * @param regERegZExpirationDate
	 */
	public DisputeCaseInformationType(final String fraudClassification,
			final String initiatorAndSource,
			final Date cardholderContactDate,
			final Date cardholderWrittenNotiffDate,
			final Date followUpDate,
			final BigDecimal feeAmount,
			final Boolean regEIndicator,
			final Boolean regZIndicator,
			final Date regERegZExpirationDate) {
		super();
		this.fraudClassification = fraudClassification;
		this.initiatorAndSource = initiatorAndSource;
		this.cardholderContactDate = cardholderContactDate;
		this.cardholderWrittenNotiffDate = cardholderWrittenNotiffDate;
		this.followUpDate = followUpDate;
		this.feeAmount = feeAmount;
		this.regEIndicator = regEIndicator;
		this.regZIndicator = regZIndicator;
		this.regERegZExpirationDate = regERegZExpirationDate;
	}

	/**
	 * 
	 */
	public DisputeCaseInformationType() {
		super();
	}

	/**
	 * @return the fraudClassification
	 */
	public String getFraudClassification() {
		return fraudClassification;
	}

	/**
	 * @param fraudClassification the fraudClassification to set
	 */
	public void setFraudClassification(final String fraudClassification) {
		this.fraudClassification = fraudClassification;
	}

	/**
	 * @return the initiatorAndSource
	 */
	public String getInitiatorAndSource() {
		return initiatorAndSource;
	}

	/**
	 * @param initiatorAndSource the initiatorAndSource to set
	 */
	public void setInitiatorAndSource(final String initiatorAndSource) {
		this.initiatorAndSource = initiatorAndSource;
	}

	/**
	 * @return the cardholderContactDate
	 */
	public Date getCardholderContactDate() {
		return cardholderContactDate;
	}

	/**
	 * @param cardholderContactDate the cardholderContactDate to set
	 */
	public void setCardholderContactDate(final Date cardholderContactDate) {
		this.cardholderContactDate = cardholderContactDate;
	}

	/**
	 * @return the cardholderWrittenNotiffDate
	 */
	public Date getCardholderWrittenNotiffDate() {
		return cardholderWrittenNotiffDate;
	}

	/**
	 * @param cardholderWrittenNotiffDate the cardholderWrittenNotiffDate to set
	 */
	public void setCardholderWrittenNotiffDate(final Date cardholderWrittenNotiffDate) {
		this.cardholderWrittenNotiffDate = cardholderWrittenNotiffDate;
	}

	/**
	 * @return the followUpDate
	 */
	public Date getFollowUpDate() {
		return followUpDate;
	}

	/**
	 * @param followUpDate the followUpDate to set
	 */
	public void setFollowUpDate(final Date followUpDate) {
		this.followUpDate = followUpDate;
	}

	/**
	 * @return the feeAmount
	 */
	public BigDecimal getFeeAmount() {
		return feeAmount;
	}

	/**
	 * @param feeAmount the feeAmount to set
	 */
	public void setFeeAmount(final BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}

	/**
	 * @return the regEIndicator
	 */
	public Boolean getRegEIndicator() {
		return regEIndicator;
	}

	/**
	 * @param regEIndicator the regEIndicator to set
	 */
	public void setRegEIndicator(final Boolean regEIndicator) {
		this.regEIndicator = regEIndicator;
	}

	/**
	 * @return the regZIndicator
	 */
	public Boolean getRegZIndicator() {
		return regZIndicator;
	}

	/**
	 * @param regZIndicator the regZIndicator to set
	 */
	public void setRegZIndicator(final Boolean regZIndicator) {
		this.regZIndicator = regZIndicator;
	}

	/**
	 * @return the regERegZExpirationDate
	 */
	public Date getRegERegZExpirationDate() {
		return regERegZExpirationDate;
	}

	/**
	 * @param regERegZExpirationDate the regERegZExpirationDate to set
	 */
	public void setRegERegZExpirationDate(final Date regERegZExpirationDate) {
		this.regERegZExpirationDate = regERegZExpirationDate;
	}

}
