package com.learning.api.testing.hooks;

import com.learning.api.testing.utils.PropsManager;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

import java.util.Objects;
import java.util.Properties;

public class CucumberHooks {

    @Before
    public void setUpRestAssured() {
        RestAssured.baseURI = Objects.requireNonNull(PropsManager.props()).getProperty("api.url");
    }
}
