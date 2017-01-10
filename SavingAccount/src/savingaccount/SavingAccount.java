/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingaccount;

/**
 *
 * @author dell
 */
public class SavingAccount {
    private double balance;
    private double interest;
    private String name;

    public SavingAccount(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
     public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
       balance = balance - amount; 
    }
    public void addInterest(){

     balance = balance + balance * interest;
    }
   

    
    

    /**
     * @param args the command line arguments
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
   
   
}      



