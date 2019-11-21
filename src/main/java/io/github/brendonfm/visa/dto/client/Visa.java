/**
 * 
 */

package io.github.brendonfm.visa.dto.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.github.brendonfm.visa.dto.SISubmitDisputeQuestionnaireRequestType;
import io.github.brendonfm.visa.dto.SISubmitDisputeQuestionnaireResponseType;
import io.github.brendonfm.visa.dto.SISubmitFraudReportRequestType;
import io.github.brendonfm.visa.dto.SISubmitFraudReportResponseType;
import io.github.brendonfm.visa.dto.SISubmitTranInquiryRequestType;
import io.github.brendonfm.visa.dto.SISubmitTranInquiryResponseType;

/**
 * @author github.com/brendonfm
 */
public interface Visa {

	@POST
	@Path("/submitTranInquiry")
	@Consumes("application/json;charset=utf-8")
	@Produces("application/json;charset=utf-8")
	SISubmitTranInquiryResponseType submitTranInquiry(SISubmitTranInquiryRequestType request);

	@POST
	@Path("/submitFraudReport")
	@Consumes("application/json;charset=utf-8")
	@Produces("application/json;charset=utf-8")
	SISubmitFraudReportResponseType submitFraudReport(SISubmitFraudReportRequestType request);

	@POST
	@Path("/submitDisputeQuestionnaire")
	@Consumes("application/json;charset=utf-8")
	@Produces("application/json;charset=utf-8")
	SISubmitDisputeQuestionnaireResponseType
			submitDisputeQuestionnaire(SISubmitDisputeQuestionnaireRequestType request);

}
