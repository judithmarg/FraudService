package com.example.FraudService;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BlackListRepository {
    private static final ArrayList<BlackCredit> blacks = new ArrayList<BlackCredit>();

    static {
        blacks.add(
                new BlackCredit("1346557482","Santander", true)
        );
        blacks.add(new BlackCredit("1346557482","HCB", true));
        blacks.add(new BlackCredit("554648799","Inbursa", true));
        blacks.add(new BlackCredit("123121325","Invex Banco", true));
        blacks.add(new BlackCredit("441121245","Banorte", true));
        blacks.add(new BlackCredit("5530022223","Inbursa2", true));
    }

    public static ArrayList<BlackCredit> getBlackList() {
        return blacks;
    }

    public boolean isIn(String card){
        boolean found = false;
        for (BlackCredit black : blacks) {
            if (black.getNumber().equals(card)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public void addCardToBlackList(BlackCredit card){
        blacks.add(card);
    }
}
