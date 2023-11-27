import com.urbanmobility.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
public class EndToEndTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService; // Mock the UserService

    @Test
    public void testCreateBookingEndToEnd() throws Exception {
        // Define mock behavior for UserService
        when(userService.someUserServiceMethod()).thenReturn("Mocked UserService Result");

        // Perform an HTTP POST request to create a booking
        mockMvc.perform(MockMvcRequestBuilders.post("/api/bookings")
                .content("{ \"user\": {\"id\": 1}, \"departurePlace\": \"A\", \"arrivalPlace\": \"B\", \"transportationType\": \"Bus\", \"estimatedDeparture\": \"2023-12-01T12:00:00\", \"estimatedArrival\": \"2023-12-01T14:00:00\", \"price\": 20.0 }")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists()); // Check if the returned booking has an ID
    }
}
