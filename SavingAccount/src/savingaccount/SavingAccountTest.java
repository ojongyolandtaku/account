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
import java.util.Scanner;
public class SavingAccountTest {
 
 public static void main(String[] args){
SavingAccount myaccountSavings = new SavingAccount(25000, 0.10);

Scanner input = new Scanner(System.in);
System.out.println("Enter your name: ");
String thename = input.nextLine();
myaccountSavings.setName(thename);

myaccountSavings.withdraw(300);
myaccountSavings.deposit(200);
myaccountSavings.addInterest();

System.out.println(myaccountSavings.getBalance());
System.out.printf("%s BALANCE IS 1265.0", myaccountSavings.getName());
//1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0
} 
}

