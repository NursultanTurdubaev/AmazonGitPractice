package com.digital_nomads.javaFall2021.applications;
import static com.digital_nomads.javaFall2021.applications.Bank.*;

public class BankerDemo {
    public static void main(String[] args) throws Exception {

        DemirBank nursultanDemirBankAccount = new DemirBank(123456789111L, 123456789);
        DemirBank urmatDemirBankAccount = new DemirBank(11800000222L, 987654321);

        System.out.println(nursultanDemirBankAccount.getBalance());
        nursultanDemirBankAccount.deposit(5000);
        System.out.println("After deposit: "+ nursultanDemirBankAccount.getBalance());

        transferFunds(nursultanDemirBankAccount,urmatDemirBankAccount,2000);

        System.out.println("Urmat's balance after transfer is: "+urmatDemirBankAccount.getBalance());
        System.out.println("Nursultan's balance after transfer is: " +nursultanDemirBankAccount.getBalance());

        transferFunds(urmatDemirBankAccount,nursultanDemirBankAccount,100000);
        System.out.println(nursultanDemirBankAccount.getBalance());
    }


}
