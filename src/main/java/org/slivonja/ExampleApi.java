package org.slivonja;

import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import java.util.Date;

@Component
@Path("api")
public class ExampleApi {

    @GET
    @Path("ping")
    @Produces(MediaType.APPLICATION_JSON)
    public ExampleResponse ping(@Context UriInfo uri) {
        String hostNm = System.getenv("HOST_NAME");
        ExampleResponse rsp = new ExampleResponse();
        rsp.setMessage("OK");
        rsp.setCode(200);
        rsp.setDate(new Date());
        rsp.setHostName(hostNm);
        return rsp;
    }
}
