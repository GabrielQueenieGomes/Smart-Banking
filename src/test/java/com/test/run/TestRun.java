package com.test.run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/main/resources/Login.feature",
        glue = {"com.cucumber.bdd.login", "com.account.info"}, 
        plugin = {
                "pretty", 
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },
        monochrome = true,
        tags = "@Positive and @Negative"
)

public class TestRun extends AbstractTestNGCucumberTests {

}
