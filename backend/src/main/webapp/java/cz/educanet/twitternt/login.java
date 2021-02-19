package cz.educanet.twitternt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("login")
public class Login {

    @GET                    // TODO: spojit j userlistem
    public Response GetUserLogin (@QueryParam("user") String username, @QueryParam("pass") String password) {
        return Response.status(501).build(); //Not implemented
        /* Not yet functional, userarray does not exist.
        for (int i = 0; i < userarray.size(); i++){
            if (userarray.get(i).password = password && userarray.get(i).username = username)
                return Response.ok(i).build();
        }
        return Response.status(404, "This combination of username and password does not exist.").build();
         */
    }
}
