package com.learning.api.testing.hooks;

import com.learning.api.testing.utils.PropsManager;
import io.cucumber.java.Before;
import io.restassured.RestAssured;

import java.util.Properties;

public class CucumberHooks {

    @Before
    public void setUpRestAssured() {
        Properties properties = new Properties();
        try {
            String apiURL = PropsManager.props().getProperty("api.URL");
            RestAssured.baseURI = apiURL;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
