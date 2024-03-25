package com.learning.api.testing.steps;

import com.learning.api.testing.model.UserModel;
import com.learning.api.testing.utils.PropsManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.Properties;

import static io.restassured.RestAssured.baseURI;

public class UserStepsDefinition {

    private Response response;

    @Given("The service is up")
    public void theServiceIsUp() {
        Response response = RestAssured.get(baseURI);
        Assert.assertEquals("Status code might be 503- Service Unavailable", 200, response.getStatusCode());
    }

    @When("I send a POST request having valid credentials")
    public void iSendAPOSTRequestHavingValidCredentials() {
        UserModel user = new UserModel();
        user.setId(12);
        user.setUsername("roxana");
        user.setFirstName("Roxana");
        user.setLastName("Pancu");
        user.setEmail("roxana@yopmail.com");
        user.setPassword("Pass123!");
        user.setPhone("0740122421");
        user.setUserStatus(1);

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(user);

        response = request.post("/v2/user");
    }

    @Then("I have {int} status code")
    public void iHaveStatusCode(int statusCode) {
        Assert.assertEquals("Expected status code is " + statusCode, statusCode, this.response.getStatusCode());
    }

    @And("Response is valid")
    public void responseBodyIsValid() {
        Assert.assertEquals("Expected status code is 200", 200, response.getStatusCode());
        Assert.assertEquals("Expected content type is application/json", "application/json", response.getContentType());
        Assert.assertNotNull("Response body should not be null", response.getBody());
    }
}

