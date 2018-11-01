package com.example.demo.configuration;

import java.util.List;

import io.strati.configuration.annotation.Configuration;
import io.strati.configuration.annotation.Property;

@Configuration(configName = "test")
public class AppConfig {
    @Property(propertyName = "test-neil")
    private String neil;

    @Property(propertyName = "test-prop")
    private String test;
    
    @Property(propertyName = "test-prop-inherited")
    private String inherited;

    public String getNeil() {
        return neil;
    }

    public void setNeil(String myString) {
        this.neil = myString;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String myInteger) {
        this.test = myInteger;
    }

    public String getInherited() {
        return inherited;
    }

    public void setInherited(String myStringArray) {
        this.inherited = myStringArray;
    }


}
