package com.rishu;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<>();
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String getName() {
        return name;
    }
    public boolean addBranch(String branch)
    {
        Branch branch1 = found(branch);
        if (branch1==null)
        {
            this.branches.add(new Branch(branch));
            return true;
        }
        return false;
    }
    public boolean addCustomerB(String branch,String name,double amount)
    {
        Branch branch1 = found(branch);
        if (branch1!=null)
        {
             return  branch1.addCustomer(name,amount);
        }
        return false;
    }
    public boolean addCustomerT(String branch , String name , double amount)
    {
        Branch branch1 = found(branch);
        if (branch1!=null)
        {
             return branch1.addTransactionC(name,amount);
        }
        return false;

    }
    private Branch found(String nam)
    {
        for (int i=0;i<this.branches.size();i++)
        {
            Branch branc = this.branches.get(i);
            if (branc.getName().equals(nam))
            {
                return branc;
            }
        }
        return null;
    }
    public void print(String branch , boolean transactions)
    {
        Branch branch1 = found(branch);
        if (branch1!=null)
        {
            ArrayList<Customer> customers = branch1.getCustomers();
        for (int i=0;i<customers.size();i++)
        {
            System.out.println("customer-"+(i+1)+" "+ customers.get(i).getCustomerName());
            if (transactions)
            {
                System.out.println("transactions"+customers.get(i).getTransactions());
            }

        }
        }
        else
        {
            System.out.println("no customer in branch or wrong info");
        }
    }

    public void operations()
    {
        System.out.println("1.add new branch");
        System.out.println("2.add customer to that branch");
        System.out.println("3.add transactions to customer");
        System.out.println("4.show customers and transactions");
        System.out.println("5.quit");
    }

}
