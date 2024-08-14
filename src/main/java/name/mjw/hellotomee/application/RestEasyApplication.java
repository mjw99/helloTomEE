package name.mjw.hellotomee.application;

import java.util.HashSet;
import java.util.Set;

import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.ApplicationPath;

@ApplicationPath("/foo")
public class RestEasyApplication extends Application {
	private Set<Class> classes = new HashSet<Class>();

	public RestEasyApplication() {
		classes.add(HelloWorld.class);
	}

}
