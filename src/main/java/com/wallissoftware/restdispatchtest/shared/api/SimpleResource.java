package com.wallissoftware.restdispatchtest.shared.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("simple")
@Produces(MediaType.APPLICATION_JSON)
public interface SimpleResource {
	
	@GET
	String helloWorld();

}
