package com.urbanmobility.urbanmobility;

import com.urbanmobility.mock.MockService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;



@SpringBootTest
@AutoConfigureMockMvc
public class YourControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MockService paymentService;

    @MockBean
    private MockService transportationService;

    @Test
    public void testYourControllerEndpoint() throws Exception {
        when(paymentService.mockMethod(anyString())).thenReturn("Mock Payment Processed");
        when(transportationService.mockMethod(anyString())).thenReturn("Mock Transportation Booked");

        mockMvc.perform(get("/your-endpoint"))
                .andExpect(status().isOk())
                .andExpect(content().string("Expected Response"));

    }
}
