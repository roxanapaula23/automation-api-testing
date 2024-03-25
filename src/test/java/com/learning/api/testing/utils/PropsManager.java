package com.learning.api.testing.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropsManager {
    public static Properties props() {

        Properties prop = new Properties();

        // Load properties file from classpath
        try (InputStream input = PropsManager.class.getClassLoader().getResourceAsStream("config.properties")) {
            // Check if file was found
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return null;
            }
            prop.load(input);

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        return prop;
    }
}