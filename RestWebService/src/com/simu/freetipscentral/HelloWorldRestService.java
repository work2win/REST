package com.simu.freetipscentral;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@Path("/simi")
public class HelloWorldRestService {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getGreeting(){
		
		return "simi";
	}
	
	/*
	@GET
	@Produces(MediaType.TEXT_XML)
	public String getXMLGreeting(){
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
		
	}
	
	
	// This method is called if HTML is request
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Simi" + "</title>"
	        + "<body><h1>" + "Hello Simi" + "</body></h1>" + "</html> ";
	  }
	*/
	}
