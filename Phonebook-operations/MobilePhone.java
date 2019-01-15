package com.rishu;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Number> contacts = new ArrayList<>();
    public void add( String name , String number)
    {
         Number a =Number.createContact(name,number);
         if (found(a.getName())>=0)
         {
             System.out.println("contact is already there");
             exit();
         }
        else {

             contacts.add(a);
             System.out.println("contact added succesfully ,");
             exit();

         }

    }
    private int found(String name)
    {
        int i;
        for (i =0;i<contacts.size();i++)
        {
            Number number = contacts.get(i);
            if (name.equals(number.getName()))
            {
                return i;
            }
        }
        return -1;


    }
    public void update(String newone ,String number,String old)
    {
        Number b = Number.createContact(newone,number);
        if (found(old)>=0) {
            contacts.set(found(old), b);
            System.out.println("contact updated succesfully ");
            exit();
        }
        else
        {
            System.out.println("contact not there ");
            exit();
        }
    }
    public void remove(String  contact)
    {
        int a = found(contact);

        if(a>=0)
        {
            Number number = contacts.get(a);

            contacts.remove(number);
            System.out.println("contact removed succesfully ");
            exit();
        }
        else
        {
            System.out.println("wrong choice");
            exit();
        }

    }
    public void find(String contact)
    {

        if (found(contact)>=0)
        {
            Number number = contacts.get(found(contact));

            System.out.println("contact is there");
            System.out.println("name-"+number.getName()+" number-"+number.getNumber());
            exit();
        }
        else
        {
            System.out.println("not here");
            exit();
        }

    }
    public void print()
    {
        System.out.println("there are "+contacts.size()+" available");
        for (int i = 0;i<contacts.size();i++)
        {
            Number number = contacts.get(i);
            System.out.println(i+1+".name-"+number.getName()+" number-"+number.getNumber());
        }
        exit();
    }
    public void info()
    {
        System.out.println("1-Add contact");
        System.out.println("2-Update contact");
        System.out.println("3-Delete contact");
        System.out.println("4-show contacts");
        System.out.println("5-find contact");
        System.out.println("7-quit");
    }
    public void exit()
    {
        System.out.println("enter 6 for options , 7 for exit");
    }
}
