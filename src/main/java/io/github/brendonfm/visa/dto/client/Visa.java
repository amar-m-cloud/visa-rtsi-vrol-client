/**
 * 
 */

package io.github.brendonfm.visa.dto.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.github.brendonfm.visa.dto.SISubmitFraudReportRequestType;
import io.github.brendonfm.visa.dto.SISubmitFraudReportResponseType;
import io.github.brendonfm.visa.dto.SISubmitTranInquiryRequestType;
import io.github.brendonfm.visa.dto.SISubmitTranInquiryResponseType;


/**
 * @author github.com/brendonfm
 */
public interface Visa {

	@POST
	@Path("/submitFraudReport")
	@Consumes("application/json")
	@Produces("application/json")
	SISubmitFraudReportResponseType submitFraudReport(SISubmitFraudReportRequestType request);

	@POST
	@Path("/submitTranInquiry")
	@Consumes("application/json")
	@Produces("application/json")
	SISubmitTranInquiryResponseType submitTranInquiry(SISubmitTranInquiryRequestType request);

}
