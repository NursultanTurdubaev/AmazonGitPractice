package com.digital_nomads.javaFall2021.applications;
import static com.digital_nomads.javaFall2021.applications.KyrgyzstanBankInterface.*;

public class KyrgyzBankDemo {
    public static void main(String[] args) throws Exception {
        KyrgyzstanBank nursultanKyrgyzBankAccount = new KyrgyzstanBank("+996555444333");
        KyrgyzstanBank aidarKyrgyzBankAccount = new KyrgyzstanBank("+996777665544");
        nursultanKyrgyzBankAccount.deposit(100000);
        transferWithMbank(nursultanKyrgyzBankAccount,aidarKyrgyzBankAccount,10000);
        System.out.println("Nursultan's balance " +nursultanKyrgyzBankAccount.getBalance());
        System.out.println("Aidar's balance "+aidarKyrgyzBankAccount.getBalance());
        System.out.println("Nurs phone " +nursultanKyrgyzBankAccount.getPhoneNumber());
        System.out.println("Aidar phone "+aidarKyrgyzBankAccount.getPhoneNumber());





    }
}
