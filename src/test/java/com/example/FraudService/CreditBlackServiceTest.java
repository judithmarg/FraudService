package com.example.FraudService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditBlackServiceTest {

    @Test
    void isInBlackList() {
        BlackListRepository blackListRepository = new BlackListRepository();
        CreditBlackService creditBlackService = new CreditBlackService(blackListRepository);
        String blackCardNum = "1346557482";

        assertTrue(creditBlackService.isInBlackList(blackCardNum));
    }

    @Test
    void isNotInBlackList() {
        BlackListRepository blackListRepository = new BlackListRepository();
        CreditBlackService creditBlackService = new CreditBlackService(blackListRepository);
        String blackCardNum = "55555555555";

        assertFalse(creditBlackService.isInBlackList(blackCardNum));
    }
}