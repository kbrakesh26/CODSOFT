import java.io.*;
import java.util.Scanner;
public class AtmInterface{

  public static void displayBalance(int balance)
  {
    System.out.println("Your Current Balance is: " + balance);
    System.out.println("Minimum balance should be maintained in your account");
    System.out.println();
  }

  public static int amountWithdrawing(int balance,int withdrawAmount)
  {
    System.out.println("Withdrawn Status:");
    System.out.println("Withdrawing Amount : " + withdrawAmount);
    if (balance >= withdrawAmount) 
    {
      balance = balance - withdrawAmount;
      System.out.println("Please collect your money and collect your card");
      displayBalance(balance);
    }
    else {
      System.out.println("Sorry! Insufficient Balance in your Account");
      System.out.println();
    }
    return balance;
  }

  public static int amountDepositing(int balance,int depositAmount)
  {
    System.out.println("Deposit Status:");
    System.out.println("Enter the Amount You want to Deposit : "+ depositAmount);
    balance = balance + depositAmount;
    System.out.println("Your Money has been successfully deposited in your account");
    System.out.println("Your deposited amount will be shown on the screen");
    displayBalance(balance);
    return balance;
  }

  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int balance = 50000;
    System.out.println("Welcome to the ATM ");
    displayBalance(balance);
    System.out.println("You can check your current balance");
    System.out.println("You can go for withdraw option.");
    System.out.println("You can go for deposit option.");
    int withdrawAmount =sc.nextInt();
    int depositAmount =sc.nextInt();
    balance= amountWithdrawing(balance, withdrawAmount);
        balance = amountDepositing(balance, depositAmount);
       System.out.println("Thank you.....");
       System.out.println("Have a nice day!");
  }
}