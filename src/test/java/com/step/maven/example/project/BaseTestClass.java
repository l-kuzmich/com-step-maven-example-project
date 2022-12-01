package com.step.maven.example.project;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BaseTestClass implements PropertiesReader{

    @BeforeAll
    public void readProperties(){
        readPropertiesFile();
    }
}
