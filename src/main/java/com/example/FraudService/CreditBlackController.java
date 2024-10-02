package com.example.FraudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditBlackController {

    @Autowired
    CreditBlackService creditBlackService;

    @GetMapping
    public ResponseEntity<ResponseDto> creditBlack(@RequestParam RequestDto requestDto) {
        ResponseDto res = new ResponseDto(
                requestDto.card(),
                creditBlackService.isInBlackList(requestDto.card())
        );
        return ResponseEntity.ok(res);
    }
}
