package com.urbanmobility.mock;

import org.springframework.stereotype.Service;

@Service
public class MockTransportationService implements MockService {
    @Override
    public String mockMethod(String input) {
        // Simulate interactions with transportation providers
        return "Transportation service called with input: " + input;
    }
}
