package com.wallissoftware.restdispatchtest.server.guice.api;

import com.wallissoftware.restdispatchtest.shared.api.SimpleResource;

public class SimpleResourceImpl implements SimpleResource{

	@Override
	public String helloWorld() {
		return "Hello World";
	}

}
