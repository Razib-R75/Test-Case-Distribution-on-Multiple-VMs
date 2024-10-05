package com.compass.stepdefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.compass.testbase.TestContextSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    private TestContextSetup context;

    public Hooks(TestContextSetup testContextSetup) {
        this.context = testContextSetup;
    }

    @Before
    public void BeforeScenario(Scenario scenario) throws IOException, InterruptedException {
        Properties properti = new Properties();
        FileInputStream file = new FileInputStream("src/main/resources/config/global.properties");
        properti.load(file);
        if (scenario.getSourceTagNames().contains("@SAJIM")) {
            context.testBase.RemoteDriver(properti.getProperty("ip1"));
        } else if(scenario.getSourceTagNames().contains("@RAZIB")){
            context.testBase.RemoteDriver(properti.getProperty("ip1"));
        }
        System.out.println("Initializing WebDriver with IP: " + context.testBase.DIp);
        context.initializeDriver();
    	context.testBase.navigateToUrl();
    }
    ///////////////////
    @Before("@login")
    public void login() throws IOException, InterruptedException {
        String Username = context.testBase.prop.getProperty("Username");
        String Password = context.testBase.prop.getProperty("Password");
//        context.getLoginPage().login(Username,Password);
    }
    //////////////////

    @After
    public void AfterScenario() throws IOException, InterruptedException {
        // Close the driver after each scenario
        context.testBase.CloseDriver();
    }
}
