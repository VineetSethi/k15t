package com.k15t.pat.registration;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.springframework.stereotype.Component;

import com.k15t.pat.registration.model.Register;


@Path("/")
@Component
public class RegistrationResource {

	private Register member = null;

    // Extend the current resource to receive and store the data in memory.
    // Return a success information to the user including the entered information.
    // In case of the address split the information into a better format/structure
    // for better handling later on.
	@POST
    @Path("/register")
	public Response registerMember(@BeanParam Register member) throws URISyntaxException {
		
		System.out.println(member.toString());
		
		java.net.URI location = null; 
		if(member.getName() != null)
			location = new java.net.URI("/result.html");
		else 
			location = new java.net.URI("/error.html");
		
	    ResponseBuilder redirect = Response.temporaryRedirect(location);
	    return redirect.entity(member).build();
	}
}
