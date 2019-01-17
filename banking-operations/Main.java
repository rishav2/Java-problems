package com.rishu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank("hello");
        boolean quit = false;
        while (!quit)
        {
            bank.operations();
            int a = scanner.nextInt();
            scanner.nextLine();
            switch (a)
            {
                case 1:
                    System.out.println("enter name of branch");
                    String branch = scanner.nextLine();
                    if (bank.addBranch(branch))
                    {
                        System.out.println("added sucessfully");
                    }
                    else
                    {
                        System.out.println("branch already there");
                    }
                    break;
                case 2:
                    System.out.println("enter name of branch ");
                    String bran = scanner.nextLine();
                    System.out.println("enter name of customer ");
                    String name = scanner.nextLine();
                    System.out.println("enter initial amount");
                    double init = scanner.nextDouble();
                    if (bank.addCustomerB(bran,name,init))
                    {
                        System.out.println("added sucessfully");
                    }
                    else
                    {
                        System.out.println("customer already there or branch is wrong");
                    }
                    break;
                case  3:
                    System.out.println("enter branch");
                    String branc = scanner.nextLine();
                    System.out.println("enter name ");
                    String nam = scanner.nextLine();
                    System.out.println("enter amount");
                    double am = scanner.nextDouble();
                    if (bank.addCustomerT(branc,nam,am))
                    {
                        System.out.println("added sucessfully");
                    }
                    else
                    {
                        System.out.println("please enter a valid information");
                    }
                    break;
                case 4:
                    System.out.println("enter branch");
                    String b = scanner.nextLine();
                    System.out.println("do you want to see transactions press y/n ");
                    String c = scanner.nextLine();
                    if (c.equals("y"))
                    {
                        bank.print(b,true);
                    }
                    else
                    {
                        bank.print(b,false);
                    }
                    break;
                case 5:
                    System.out.println("have a good day");
                    quit=true;

            }

        }


	// write your code here
    }
}
