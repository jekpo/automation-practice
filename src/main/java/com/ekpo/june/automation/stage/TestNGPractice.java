package com.ekpo.june.automation.stage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;

public class TestNGPractice {

    public static void main(String[] args) {

        // These are the expected values
        int expectedAge = 18;
        double expectedSalary = 100000;
        boolean expectedState = true;
        String expectedCountry = "USA";

        // This map will store any errors from the soft assertions
        final Map<String, AssertionError> assertionResults = new HashMap<String, AssertionError>();

        // We are going to start performing the soft assertions
        try {
            Assert.assertEquals(19, expectedAge);
        } catch (AssertionError error) {
            assertionResults.put("Age Assertion", error);
        }

        try {
            Assert.assertEquals(25000, expectedSalary);
        } catch (AssertionError error) {
            assertionResults.put("Salary Assertion", error);
        }

        try {
            Assert.assertEquals(true, expectedState);
        } catch (AssertionError error) {
            assertionResults.put("State Assertion", error);
        }

        try {
            Assert.assertEquals("India", expectedCountry);
        } catch (AssertionError error) {
            assertionResults.put("Country Assertion", error);
        }

        Set<Map.Entry<String,AssertionError>> errors = assertionResults.entrySet();

        for (Map.Entry<String,AssertionError> error : errors) {
            System.out.println(error.getKey() + "-> " + error.getValue());
        }
    }
}
