/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heartmanager.heartmanagerapp;

import com.google.gson.Gson;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author valentin
 */

@Stateless
@Path("")
public class PatientRest {
    
    @POST
    @Path("getAllPatient")
    @Produces({"application/json"})
    public Response getAllPatientData(@FormParam("identification") String identification) {
        
        if(identification.equals("12345")) {
            List<Patient> patients = PatientFacade.createDummyPatient();
            Gson gson = new Gson();
            String json = gson.toJson(patients);
            return Response.status(Response.Status.OK).entity(json).build(); 
        } else {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
    }
}
