package com.rohith.prac;


import java.util.logging.Logger;


/**
 * Created by rohith on 5/27/18.
 */
public class BankAccount {
    String accountType;
    int units;
    String currency;

    public BankAccount(String type,String usd, int i) {
        this.currency = usd;
        this.units = i;
        this.accountType = type;
    }


    public String getAccountType() {
        return accountType;
    }

    public Object getUnits() {
        return units;
    }

    public Object getCurrency() {
        return currency;
    }
}

enum AccountType {
    SAVINGS("gadsfgf");
    String accountName;
    AccountType(String s) {
        accountName = s;
    }

    String getName() {
        return accountName;
    }

}
