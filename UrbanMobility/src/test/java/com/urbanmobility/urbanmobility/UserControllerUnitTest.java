package com.urbanmobility.urbanmobility;

import com.urbanmobility.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService; 

    @Test
    public void testUserControllerEndpoint() throws Exception {
        when(userService.someUserServiceMethod()).thenReturn("Mocked UserService Result");

        mockMvc.perform(get("/user-endpoint"))
                .andExpect(status().isOk())
                .andExpect(content().string("Expected Response"));

    }
}
