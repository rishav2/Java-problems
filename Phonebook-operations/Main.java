package com.rishu;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit=false;
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.info();
        while (!quit)
        {

            int a =  scanner.nextInt();
            scanner.nextLine();
            switch (a)
            {
                case 1:
                    System.out.println("enter name");
                    String name = scanner.nextLine();
                    System.out.println("enter number");
                    String number = scanner.nextLine();
                    mobilePhone.add(name,number);
                    break;
                case 2:
                    mobilePhone.print();
                    System.out.println("enter name");
                    String old = scanner.nextLine();
                    System.out.println("enter new name");
                    String n = scanner.nextLine();
                    System.out.println("enter number");
                    String num = scanner.nextLine();
                   mobilePhone.update(n,num,old);
                    break;
                case 3:
                    System.out.println("enter contact name to remove");
                    mobilePhone.print();
                    String rem = scanner.nextLine();
                    mobilePhone.remove(rem);
                    break;
                case 4:
                    mobilePhone.print();
                    break;
                case 5:
                    System.out.println("enter contact name ");
                    String name1 = scanner.nextLine();
                    mobilePhone.find(name1);
                    break;
                case 6:
                    mobilePhone.info();
                    break;
                default:
                    quit=true;
            }

        }



    }

}
