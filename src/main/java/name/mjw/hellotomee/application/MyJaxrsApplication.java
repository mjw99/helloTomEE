package name.mjw.hellotomee.application;

import java.util.HashSet;
import java.util.Set;

import jakarta.servlet.ServletConfig;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.Context;

public class MyJaxrsApplication extends Application {

	private Set<Object> singletons = new HashSet<>();

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

	public MyJaxrsApplication(@Context ServletConfig servletConfig) {
		super();

		singletons.add(new HelloWorld());

	}

}
