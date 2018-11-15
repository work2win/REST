package com.simu.freetipscentral;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class CustomerService {
	
	@GET
	@Path("/get/{custID}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomer(@PathParam("custID") String custID){
		Customer customer = new Customer();
		customer.setCustID(custID);
		customer.setName("simi");
		customer.setEmail("simi@gmail.com");
		return customer;
	}
	
	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Customer createCustomer(Customer customer){
		//create logic here
		return customer;
	}
	
	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Customer updateCustomer(Customer customer){
		//update logic here
		customer.setName(customer.getName() + "updated");
		return customer;
	}
	
	@DELETE
	@Path("/delete/{custID}")
	public Response deleteCustomer(@PathParam("custID") int custID) throws URISyntaxException{
		return Response.status(200).entity("Customer with " + custID + "is deleted successfully").build();
	}
	
	
}
