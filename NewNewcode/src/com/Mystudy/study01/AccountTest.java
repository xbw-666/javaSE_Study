package com.Mystudy.study01;

public class AccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("xbw", 12000, "xbw666");
        System.out.println(account.GetName());
        System.out.println(account.GetBalance());
        System.out.println(account.GetAccountPassword());
    }
}
