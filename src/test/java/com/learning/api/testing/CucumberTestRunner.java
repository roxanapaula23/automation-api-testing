package com.learning.api.testing;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.restassured.RestAssured;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.learning.api.testing.steps", "com.learning.api.testing.hooks"}
)
public class CucumberTestRunner {
}
