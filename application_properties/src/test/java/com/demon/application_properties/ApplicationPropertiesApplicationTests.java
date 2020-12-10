package com.demon.application_properties;

import com.demon.application_properties.config.PersonProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class ApplicationPropertiesApplicationTests {
    @Autowired
    private PersonProperties personProperties;
    @Test
    void contextLoads() {
        System.out.println(personProperties);
    }

}
