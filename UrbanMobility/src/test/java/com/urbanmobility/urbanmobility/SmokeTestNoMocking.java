/* 
* This test is verifying that the Spring application context loads without errors.
*/ 

package com.urbanmobility.urbanmobility;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void contextLoads() {
        // Check if the application context loads without errors
        assertNotNull(context);
    }
}
