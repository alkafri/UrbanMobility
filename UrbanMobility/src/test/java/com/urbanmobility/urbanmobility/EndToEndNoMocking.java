/*
 * This code is an example of an end-to-end test for a specific scenario, 
 * related to creating a booking through an HTTP POST request to the /api/bookings endpoint.
 */
import com.urbanmobility.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EndToEndTest {

    @LocalServerPort
    private int port;

    @Autowired
    private UserService userService;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testCreateBookingEndToEnd() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String requestBody = "{ \"user\": {\"id\": 1}, \"departurePlace\": \"A\", \"arrivalPlace\": \"B\", \"transportationType\": \"Bus\", \"estimatedDeparture\": \"2023-12-01T12:00:00\", \"estimatedArrival\": \"2023-12-01T14:00:00\", \"price\": 20.0 }";

        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        String url = "http://localhost:" + port + "/api/bookings";
        
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);

        assertEquals(200, responseEntity.getStatusCodeValue());

        String responseBody = responseEntity.getBody();
        assertNotNull(responseBody);
    }
}
