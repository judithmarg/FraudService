package com.example.FraudService;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CreditBlackService {

    private final List<String> blackListedCards = new ArrayList<>();
    private final BlackListRepository blackListRepository;

    public CreditBlackService(BlackListRepository blackListRepository) {
        this.blackListRepository = blackListRepository;
    }

    public boolean isInBlackList(String card){
        return this.blackListRepository.isIn(card) || this.blackListedCards.contains(card);
    }

    public List<ResponseDto> getAllBlackListed() {
        List<ResponseDto> response = new ArrayList<>();
        for (String card : blackListedCards) {
            response.add(new ResponseDto(card, true));
        }
        return response;
    }
}
