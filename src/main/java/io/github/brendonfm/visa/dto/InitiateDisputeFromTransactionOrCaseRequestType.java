
package io.github.brendonfm.visa.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_EMPTY)
public class InitiateDisputeFromTransactionOrCaseRequestType {

	@JsonProperty("VisaCaseNumber")
	private Long visaCaseNumber;
	@JsonProperty("RolTransactionId")
	private Long rolTransactionId;
	@JsonProperty("MemberCaseNumber")
	private String memberCaseNumber;
	@JsonProperty("DisputeCategory")
	private DisputeCategoryType disputeCategory;
	@JsonProperty("DisputeAmount")
	private AmountType disputeAmount;
	@JsonProperty("ExceptionCPD")
	@JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss",
			shape = JsonFormat.Shape.STRING,
			locale = "pt-BR",
			timezone = "Brazil/East")
	private Date exceptionCPD;
	@JsonProperty("DisputeAmtExcludeCashbackInd")
	private Boolean disputeAmtExcludeCashbackInd;
	@JsonProperty("SelectedTransExcludeCashbackInd")
	private Boolean selectedTransExcludeCashbackInd;
	@JsonProperty("CaseInformation")
	private DisputeCaseInformationType caseInformation;
	@JsonProperty("DisputeCardholderInfo")
	private DisputeCardholderInfoType disputeCardholderInfo;
	@JsonProperty("AccountOwnerInfo")
	private DisputeAccountOwnerContactInfoType accountOwnerInfo;
	@JsonProperty("DisputeFraudInfo")
	private DisputeFraudInfoType disputeFraudInfo;
	@JsonProperty("DisputeEFLInfo")
	private DisputeEFLInfoType disputeEFLInfo;

	/**
	 * @param visaCaseNumber
	 * @param rolTransactionId
	 * @param memberCaseNumber
	 * @param disputeCategory
	 * @param disputeAmount
	 * @param exceptionCPD
	 * @param disputeAmtExcludeCashbackInd
	 * @param selectedTransExcludeCashbackInd
	 * @param caseInformation
	 * @param disputeCardholderInfo
	 * @param accountOwnerInfo
	 * @param disputeFraudInfo
	 * @param disputeEFLInfo
	 */
	public InitiateDisputeFromTransactionOrCaseRequestType(final Long visaCaseNumber,
			final Long rolTransactionId,
			final String memberCaseNumber,
			final DisputeCategoryType disputeCategory,
			final AmountType disputeAmount,
			final Date exceptionCPD,
			final Boolean disputeAmtExcludeCashbackInd,
			final Boolean selectedTransExcludeCashbackInd,
			final DisputeCaseInformationType caseInformation,
			final DisputeCardholderInfoType disputeCardholderInfo,
			final DisputeAccountOwnerContactInfoType accountOwnerInfo,
			final DisputeFraudInfoType disputeFraudInfo,
			final DisputeEFLInfoType disputeEFLInfo) {
		super();
		this.visaCaseNumber = visaCaseNumber;
		this.rolTransactionId = rolTransactionId;
		this.memberCaseNumber = memberCaseNumber;
		this.disputeCategory = disputeCategory;
		this.disputeAmount = disputeAmount;
		this.exceptionCPD = exceptionCPD;
		this.disputeAmtExcludeCashbackInd = disputeAmtExcludeCashbackInd;
		this.selectedTransExcludeCashbackInd = selectedTransExcludeCashbackInd;
		this.caseInformation = caseInformation;
		this.disputeCardholderInfo = disputeCardholderInfo;
		this.accountOwnerInfo = accountOwnerInfo;
		this.disputeFraudInfo = disputeFraudInfo;
		this.disputeEFLInfo = disputeEFLInfo;
	}

	/**
	 * 
	 */
	public InitiateDisputeFromTransactionOrCaseRequestType() {
		super();
	}

	/**
	 * @return the visaCaseNumber
	 */
	public Long getVisaCaseNumber() {
		return visaCaseNumber;
	}

	/**
	 * @param visaCaseNumber the visaCaseNumber to set
	 */
	public void setVisaCaseNumber(final Long visaCaseNumber) {
		this.visaCaseNumber = visaCaseNumber;
	}

	/**
	 * @return the rolTransactionId
	 */
	public Long getRolTransactionId() {
		return rolTransactionId;
	}

	/**
	 * @param rolTransactionId the rolTransactionId to set
	 */
	public void setRolTransactionId(final Long rolTransactionId) {
		this.rolTransactionId = rolTransactionId;
	}

	/**
	 * @return the memberCaseNumber
	 */
	public String getMemberCaseNumber() {
		return memberCaseNumber;
	}

	/**
	 * @param memberCaseNumber the memberCaseNumber to set
	 */
	public void setMemberCaseNumber(final String memberCaseNumber) {
		this.memberCaseNumber = memberCaseNumber;
	}

	/**
	 * @return the disputeCategory
	 */
	public DisputeCategoryType getDisputeCategory() {
		return disputeCategory;
	}

	/**
	 * @param disputeCategory the disputeCategory to set
	 */
	public void setDisputeCategory(final DisputeCategoryType disputeCategory) {
		this.disputeCategory = disputeCategory;
	}

	/**
	 * @return the disputeAmount
	 */
	public AmountType getDisputeAmount() {
		return disputeAmount;
	}

	/**
	 * @param disputeAmount the disputeAmount to set
	 */
	public void setDisputeAmount(final AmountType disputeAmount) {
		this.disputeAmount = disputeAmount;
	}

	/**
	 * @return the exceptionCPD
	 */
	public Date getExceptionCPD() {
		return exceptionCPD;
	}

	/**
	 * @param exceptionCPD the exceptionCPD to set
	 */
	public void setExceptionCPD(final Date exceptionCPD) {
		this.exceptionCPD = exceptionCPD;
	}

	/**
	 * @return the disputeAmtExcludeCashbackInd
	 */
	public Boolean getDisputeAmtExcludeCashbackInd() {
		return disputeAmtExcludeCashbackInd;
	}

	/**
	 * @param disputeAmtExcludeCashbackInd the disputeAmtExcludeCashbackInd to set
	 */
	public void setDisputeAmtExcludeCashbackInd(final Boolean disputeAmtExcludeCashbackInd) {
		this.disputeAmtExcludeCashbackInd = disputeAmtExcludeCashbackInd;
	}

	/**
	 * @return the selectedTransExcludeCashbackInd
	 */
	public Boolean getSelectedTransExcludeCashbackInd() {
		return selectedTransExcludeCashbackInd;
	}

	/**
	 * @param selectedTransExcludeCashbackInd the selectedTransExcludeCashbackInd to set
	 */
	public void setSelectedTransExcludeCashbackInd(final Boolean selectedTransExcludeCashbackInd) {
		this.selectedTransExcludeCashbackInd = selectedTransExcludeCashbackInd;
	}

	/**
	 * @return the caseInformation
	 */
	public DisputeCaseInformationType getCaseInformation() {
		return caseInformation;
	}

	/**
	 * @param caseInformation the caseInformation to set
	 */
	public void setCaseInformation(final DisputeCaseInformationType caseInformation) {
		this.caseInformation = caseInformation;
	}

	/**
	 * @return the disputeCardholderInfo
	 */
	public DisputeCardholderInfoType getDisputeCardholderInfo() {
		return disputeCardholderInfo;
	}

	/**
	 * @param disputeCardholderInfo the disputeCardholderInfo to set
	 */
	public void setDisputeCardholderInfo(final DisputeCardholderInfoType disputeCardholderInfo) {
		this.disputeCardholderInfo = disputeCardholderInfo;
	}

	/**
	 * @return the accountOwnerInfo
	 */
	public DisputeAccountOwnerContactInfoType getAccountOwnerInfo() {
		return accountOwnerInfo;
	}

	/**
	 * @param accountOwnerInfo the accountOwnerInfo to set
	 */
	public void setAccountOwnerInfo(final DisputeAccountOwnerContactInfoType accountOwnerInfo) {
		this.accountOwnerInfo = accountOwnerInfo;
	}

	/**
	 * @return the disputeFraudInfo
	 */
	public DisputeFraudInfoType getDisputeFraudInfo() {
		return disputeFraudInfo;
	}

	/**
	 * @param disputeFraudInfo the disputeFraudInfo to set
	 */
	public void setDisputeFraudInfo(final DisputeFraudInfoType disputeFraudInfo) {
		this.disputeFraudInfo = disputeFraudInfo;
	}

	/**
	 * @return the disputeEFLInfo
	 */
	public DisputeEFLInfoType getDisputeEFLInfo() {
		return disputeEFLInfo;
	}

	/**
	 * @param disputeEFLInfo the disputeEFLInfo to set
	 */
	public void setDisputeEFLInfo(final DisputeEFLInfoType disputeEFLInfo) {
		this.disputeEFLInfo = disputeEFLInfo;
	}

}
