package com.step.maven.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestClass extends BaseTestClass{

    @Test
    public void verifyUrl(){
        String url = System.getProperty("base-url");
        Assertions.assertEquals("http:\\\\google.com", url);
    }

    @Test
    public void verifyUsername(){
        String username = System.getProperty("username");
        Assertions.assertNotEquals("user", username);
    }
}
