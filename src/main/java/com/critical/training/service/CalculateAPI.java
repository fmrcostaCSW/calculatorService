
package com.critical.training.service;

import com.critical.training.engine.InvalidStatementException;
import com.critical.training.model.CalculateBase;
import com.critical.training.model.query;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("query")
public class CalculateAPI {

    CalculateService calculateService = new CalculateService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<query> getMessages() {

        return calculateService.getAllMessages();
    }

//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public query addMessage(String statQuery){
//        return "Post works!!";
//    }


    @GET
    @Path("/{query}")
    @Produces(MediaType.APPLICATION_JSON)
    public query getExecuteQuery(@PathParam("query") String statQuery)throws InvalidStatementException {
        return calculateService.getExecuteQuery(statQuery);
    }

}
