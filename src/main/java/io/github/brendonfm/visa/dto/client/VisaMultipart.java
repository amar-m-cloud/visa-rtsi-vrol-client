package io.github.brendonfm.visa.dto.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.ext.multipart.Multipart;
import org.apache.cxf.jaxrs.ext.multipart.MultipartBody;

import io.github.brendonfm.visa.dto.SISubmitDisputeQuestionnaireResponseType;

public interface VisaMultipart {
	
	@POST
	@Path("/submitDisputeQuestionnaire")
	//@Consumes(MediaType.MULTIPART_FORM_DATA)
	//@Produces(MediaType.APPLICATION_JSON)
	SISubmitDisputeQuestionnaireResponseType submitDisputeQuestionnaire(@Multipart("request") MultipartBody body);

}
