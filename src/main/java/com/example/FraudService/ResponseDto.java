package com.example.FraudService;

public record ResponseDto(
        String card,
        boolean isIn
) {
}
