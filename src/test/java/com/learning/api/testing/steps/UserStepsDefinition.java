package com.learning.api.testing.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.baseURI;

public class UserStepsDefinition {
    @Given("The service is up")
    public void theServiceIsUp() {
        Response response = RestAssured.get(baseURI +"/user");
        Assert.assertEquals("Status code might be 503- Service Unavailable", 200, response.getStatusCode());
        String status = response.jsonPath().getString("status");
        Assert.assertEquals("The status is different", "UP", status);
    }


    @When("I send a POST request having valid credentials")
    public void iSendAPOSTRequestHavingValidCredentials() {
//        UserModel user = new UserModel();
//        user.setId(12);
//        user.setUsername("anapop");
//        user.setFirstName("Ana");
//        user.setLastName("Pop");
//        user.setEmail("anapop@yopmail.com");
//        user.setPassword("Pass123!");
//        user.setPhone("0740122421");
//        user.setUserStatus(1);
//
//
//        RestAssured.baseURI = "apiUrl";
//
//        // Create request specification
//        RequestSpecification request = RestAssured.given();
//        request.header("Content-Type", "application/json");
//        request.body(user); // Pass the UserModel object directly
//
//        // Send POST request and get response
//        Response response = request.post("/user");
//
//        // Get response details
//        int statusCode = response.getStatusCode();
//        String responseBody = response.getBody().asString();
        throw new io.cucumber.java.PendingException();
    }

    @Then("I have {int} status code")
    public void iHaveStatusCode(int arg0) {
        throw new io.cucumber.java.PendingException();
    }

    @When("I send a POST request to create a new account with empty body")
    public void iSendAPOSTRequestToCreateANewAccountWithEmptyBody() {
        throw new io.cucumber.java.PendingException();
//        String emptyBody = "{}";
//
//        // Define request
//        request = RestAssured.given();
//        request.header("Content-Type", "application/json");
//        request.body(emptyBody);
//
//        // Send POST request to the endpoint for account creation
//        response = request.post("/register");
    }

}

