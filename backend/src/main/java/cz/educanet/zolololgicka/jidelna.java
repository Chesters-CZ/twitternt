package cz.educanet.zolololgicka;

import cz.educanet.obvladacenebotakneco.useremanager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("zvjer")
public class jidelna {
    @Inject
    private useremanager usrmng;

    @POST
    public Response addnom(@QueryParam("pos") @DefaultValue("-2147483648") int pos, menuitem animal) {
        if (pos == -2147483648)
            return Response.status(201, "Your food's id is: " + usrmng.uvarnom(animal)).build();
        else usrmng.uvarnom(animal, pos);
        return Response.status(201).build();
    }

    @PUT
    public Response editnom(@QueryParam("pos") int pos, menuitem animal) {
        usrmng.editnom(animal, pos);
        return Response.ok().build();
    }

    @DELETE
    public Response remnom(@QueryParam("pos") int pos) {
        usrmng.karlesnezto(pos);
        return Response.ok().build();
    }

    @GET
    public Response getnom(@QueryParam("pos") @DefaultValue("-2147483648") int pos) {
        if (pos == -2147483648) return Response.ok(usrmng.serveallnoms()).build();
        return Response.ok(usrmng.servenom(pos).toString()).build();
    }
}
