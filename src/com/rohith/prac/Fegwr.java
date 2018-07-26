package com.rohith.prac;


import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by rohith on 5/27/18.
 */
public class Fegwr {

    private static final String TEXT =  "I am a {0} account with {1,number,#} units of {2} currency";

        public static void main(String args[] ) throws Exception {

            List<BankAccount> accounts = new ArrayList<BankAccount>();
            accounts.add(new SavingsAccount("USD",3));//Savings
            accounts.add(new SavingsAccount("EUR",2));//Savings
            accounts.add(new CheckingAccount("HUF",100));//Checking
            accounts.add(new CheckingAccount("COP",10000));//Checking
            accounts.add(new BrokerageAccount("GBP",2));//Brokerage
            accounts.add(new BrokerageAccount("INR",600));//Brokerage

            accounts.stream().forEach(
                    account -> System.out.println(
                            MessageFormat.format(TEXT,
                                    new Object[]{
                                            account.getAccountType(),//make this work
                                            account.getUnits(),//make this work
                                            account.getCurrency()//make this work
                                    })));
        }
    }

