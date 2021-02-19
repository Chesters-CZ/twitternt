package cz.educanet.twitternt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("login")
public class login {

    @GET                    // TODO: spojit j userlistem
    public Response getnom(@QueryParam("user") String username, @QueryParam("pass") String password) {
        for (int i = 0; i < userarray.size(); i++){
            if (userarray.get(i).password = password && userarray.get(i).username = username)
                return Response.ok().build(i);
        }
    }
}
