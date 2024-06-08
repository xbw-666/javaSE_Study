package com.Mystudy.study01;

public class Account {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("John", 10000, "1234");
        System.out.println("Account name: " + myAccount.GetName());
        System.out.println("Account balance: " + myAccount.GetBalance());
        System.out.println("Account password: " + myAccount.GetAccountPassword());
    }
}
class BankAccount {
    public String name;
    private double balance;
    private String accountPassword;

    public BankAccount(String name, double balance, String accountPassword) {
        SetName(name);
        SetBalance(balance);
        SetAccountPassword(accountPassword);
    }
    public void SetName(String name) {
        if(name.length()==2||name.length()==3||name.length()==4){
            this.name = name;
        }
        else{
            this.name = "Invalid name";
            System.out.println("你不是亚洲人");
        }
    }
    public void SetBalance(double balance) {
        if(balance>20){
            this.balance = balance;
        }
        else{
            this.balance = 0;
            System.out.println("Balance should be greater than 20");
        }
    }
    public void SetAccountPassword(String accountPassword) {
        if(accountPassword.length()==6){
            this.accountPassword = accountPassword;
        }
        else{
            this.accountPassword = "Invalid password";
            System.out.println("Account password should be 6 digits");
        }
    }
    public String GetName() {
        return name;
    }
    public double GetBalance() {
        return balance;
    }
    public String GetAccountPassword() {
        return accountPassword;
    }
    /*
    我们这里可以在这里直接显示Person信息
    Test:
    public void info(){
        System.out.println("Person name: " + name);
        System.out.println("Person age: " + age);
        System.out.println("Person gender: " + gender);
    }
    不管你属性的修饰符是什么,在同一个类我都是直接能去访问的,不需要实例化对象,直接通过类名.属性名来访问.
     */
}