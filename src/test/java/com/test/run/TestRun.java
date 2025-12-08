package com.test.run;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/main/resources/Login.feature",
        glue = {"com.cucumber.bdd.login", "com.account.info"}, 
        plugin = {
                "pretty", 
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },
        monochrome = true,
        tags = "@Regression"
)

public class TestRun {

}
