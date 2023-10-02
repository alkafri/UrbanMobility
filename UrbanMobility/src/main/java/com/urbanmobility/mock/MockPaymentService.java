package com.urbanmobility.mock;

import org.springframework.stereotype.Service;

@Service
public class MockPaymentService implements MockService {
    @Override
    public String mockMethod(String input) {
        // Simulate payment processing logic
        return "Payment processed for: " + input;
    }
}
