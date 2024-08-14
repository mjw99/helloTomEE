package name.mjw.hellotomee.application;

import jakarta.ws.rs.GET;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

/**
 * Root resource (exposed at "helloworld" path)
 */
@Path("helloworld")
public class HelloWorld {

	/**
	 * Retrieves representation of an instance of helloWorld.HelloWorld
	 * 
	 * @return an instance of java.lang.String
	 */
	@GET
	@Produces("text/html")
	public String getHtml() {
		return "<html lang=\"en\"><body><h1>Hello, World!!</h1></body></html>";
	}
}
