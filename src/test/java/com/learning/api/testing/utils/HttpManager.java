package com.learning.api.testing.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HttpManager {
    public static Response get(String path, String contentType) {
        String url = "https://petstore.swagger.io/" + path;
        return RestAssured.given()
                .contentType(contentType)
                .get(url);
    }

    public static Response post(String path, String requestBody, String contentType) {
        String url = "https://petstore.swagger.io/" + path;
        return RestAssured.given()
                .contentType(contentType)
                .body(requestBody)
                .post(url);
    }
}