package com.Bikroy.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.Bikroy.stepdefinitions", // Ensure this matches your actual step definitions package
        tags = "@Release", // Use the appropriate tag to filter tests
        plugin = {
                "pretty",
                "html:reports/cucumber-reports.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    // To run scenarios in parallel
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return new Object[][]{
                {"src/test/resources/features/UI/Login/Login.feature", "149.112.32.198"}, // Feature 1 on VM 1
                {"src/test/resources/features/UI/Login/Login.feature", "149.112.32.199"}, // Feature 2 on VM 2
                {"src/test/resources/features/UI/Login/Login.feature", "149.112.32.200"}  // Feature 3 on VM 3
        };
    }
}
