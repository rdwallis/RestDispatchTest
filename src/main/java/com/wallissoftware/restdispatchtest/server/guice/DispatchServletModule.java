package com.wallissoftware.restdispatchtest.server.guice;

import com.arcbees.guicyresteasy.GuiceRestEasyFilterDispatcher;
import com.google.inject.servlet.ServletModule;
import com.wallissoftware.restdispatchtest.server.guice.api.SimpleResourceImpl;
import com.wallissoftware.restdispatchtest.shared.api.SimpleResource;

public class DispatchServletModule extends ServletModule {
    @Override
    public void configureServlets() {
    	filter("/api/1/*").through(GuiceRestEasyFilterDispatcher.class);
        bind(SimpleResource.class).to(SimpleResourceImpl.class);
    }
}