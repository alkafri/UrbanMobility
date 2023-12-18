package com.urbanmobility.urbanmobility;

import com.urbanmobility.model.User;
import com.urbanmobility.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserInformationSaveToDatabase() throws Exception {
        User testUser = new User(/* Your actual user data */);

        User savedUser = userService.createUser(testUser);

        assertNotNull(savedUser);

        assertNotNull(savedUser.getId());
        assertEquals("testUser", savedUser.getUsername());
        assertEquals("test@example.com", savedUser.getContactInformation());
    }
}
