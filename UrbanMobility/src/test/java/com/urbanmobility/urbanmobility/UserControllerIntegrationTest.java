package com.urbanmobility.urbanmobility;

import com.urbanmobility.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService; // Mock the UserService

    @Test
    public void testUserInformationSaveToDatabase() throws Exception {
        // Define mock behavior for UserService
        when(userService.createUser(any(User.class))).thenReturn(new User(/* Your mock user data */));

        // Perform an HTTP POST request to save user information
        mockMvc.perform(MockMvcRequestBuilders.post("/api/users")
                .content("{...}") // Your user information payload
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(jsonPath("$.id").exists()) // Check if the returned user has an ID
                .andExpect(jsonPath("$.username").value("testUser")) // Adjust as per your mock user data
                .andExpect(jsonPath("$.contactInformation").value("test@example.com"))
                .andExpect(jsonPath("$.paymentInformation").value("1234567890"))
                .andExpect(jsonPath("$.paymentHistory").doesNotExist()); // Assuming paymentHistory is initially null
    }

}
