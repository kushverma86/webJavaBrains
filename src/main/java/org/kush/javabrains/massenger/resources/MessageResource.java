package org.kush.javabrains.massenger.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.kush.javabrains.massenger.service.MessageService;

import com.google.gson.Gson;

@Path("/messages")
public class MessageResource {
	
	
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMessage()
//	{
//		return "Sending Message...";
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getMessages()
	{
		MessageService msgServ = new MessageService();
		Gson gson = new Gson();
		String json = gson.toJson(msgServ.getAllMassages());
		
//		return Response.status(202).entity(json).build();
	
		return json;
	}
	
	@Path("auth")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAuthMap()
	{
		MessageService msgServ = new MessageService();
		Gson gson = new Gson();
		String json = gson.toJson(msgServ.getAuthConfig());
		
//		return Response.status(202).entity(json).build();
	
		return json;
	}

}
