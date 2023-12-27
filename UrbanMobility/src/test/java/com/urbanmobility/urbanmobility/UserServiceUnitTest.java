package com.urbanmobility.urbanmobility;

import com.urbanmobility.repository.UserRepository;
import com.urbanmobility.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Test
    public void testSomeUserServiceMethod() {
        MockitoAnnotations.initMocks(this);

        when(userRepository.someUserRepositoryMethod()).thenReturn("Mocked UserRepository Result");

        String result = userService.someUserServiceMethod();

        assertEquals("Expected Result", result);
    }
}
