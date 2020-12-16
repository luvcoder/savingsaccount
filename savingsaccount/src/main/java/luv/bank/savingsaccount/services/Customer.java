package luv.bank.savingsaccount.services;

import java.util.*;

public class Customer {



    public static String bankName="|| State Bank of India ||";
    public String name;
    public double balance;
    Customer(String name)
    {
        this.name = name;


    }

    public void deposit(double amount)
    {
        this.balance=this.balance+amount;
        System.out.println("After Deposit Balance " + this.balance);
    }
    public void withdraw(double amount) {
        if(amount>balance)
        {
            System.out.println("Sorry.Insufficient Funds");
//            System.exit(status);
        }
        else
        {balance=this.balance-amount;
            System.out.println("After withdrawal the balance is :" + balance);
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to"+Customer.bankName);
        Scanner sc = new Scanner(System.in);
//		Scanner sca = new Scanner(s);
        System.out.println("Enter your Name");
        String name=sc.next();
        Customer c1 = new Customer(name);
        System.out.println("Hello "+ c1.name +", Your Account Created");

        while(true)
        {
            System.out.println("Choose Your Option to perform:");
            System.out.println("D-Deposit \n W-Withdraw \n E-Exit");
            String option=sc.next();


            if (option.equalsIgnoreCase("D"))
            {
                System.out.println("Enter Amount:");
                double amount = sc.nextDouble();
                c1.deposit(amount);
            }
            else if(option.equalsIgnoreCase("W"))
            {
                System.out.println("Enter amount to Withdraw:");
                double amount = sc.nextDouble();
                c1.withdraw(amount);

            }
        }

    }
}
