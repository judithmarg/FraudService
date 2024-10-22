package com.example.FraudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreditBlackController implements FraudApi {

    @Autowired
    CreditBlackService creditBlackService;

    @GetMapping("/check")
    public ResponseEntity<ResponseDto> creditBlack(@RequestParam RequestDto requestDto) {
        ResponseDto res = new ResponseDto(
                requestDto.card(),
                creditBlackService.isInBlackList(requestDto.card())
        );
        return ResponseEntity.ok(res);
    }

    @GetMapping("/blacklist")
    public ResponseEntity<List<ResponseDto>> index() {
        List<ResponseDto> blacklist = creditBlackService.getAllBlackListed();
        return ResponseEntity.ok(blacklist);
    }
}
