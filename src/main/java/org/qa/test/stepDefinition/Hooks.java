package org.qa.test.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.qa.test.Utils.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.getDriver();
    }

    @After
    public void tearDown() {
        if(DriverManager.getDriver() != null){
            DriverManager.quitDriver();
        }
    }
}
