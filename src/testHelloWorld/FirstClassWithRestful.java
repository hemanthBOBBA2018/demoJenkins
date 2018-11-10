package testHelloWorld;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class FirstClassWithRestful {

	public FirstClassWithRestful() {
		// TODO Auto-generated constructor stub
	}
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	
	
}
