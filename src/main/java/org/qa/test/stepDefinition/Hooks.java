package org.qa.test.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.qa.test.Utils.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.initDriver();
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
