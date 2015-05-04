package com.wallissoftware.restdispatchtest.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.wallissoftware.restdispatchtest.RestDispatchTest";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}