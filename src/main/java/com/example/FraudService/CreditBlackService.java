package com.example.FraudService;

import org.springframework.stereotype.Service;

@Service
public class CreditBlackService {

    BlackListRepository blackListRepository;
    public CreditBlackService(BlackListRepository blackListRepository) {
        this.blackListRepository = blackListRepository;
    }

    public boolean isInBlackList(String card){
        return this.blackListRepository.isIn(card);
    }
}
