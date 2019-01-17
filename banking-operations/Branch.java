package com.rishu;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String naam;

    public Branch(String name) {
        this.naam= name;
        this.customers = new ArrayList<>();
    }
    public boolean addCustomer(String name , double initamount)
    {
        Customer customer = found(name);

        if (customer==null)
        {
            this.customers.add(new Customer(name,initamount));
            return true;
        }
        return false;

    }
    public boolean addTransactionC(String name , double initamount)
    {
        Customer customer = found(name);
        if (customer!=null)
        {
            customer.addTransactions(initamount);
            return true;
        }
        return false;

    }
    private Customer found(String name)
    {
        for (int i=0;i<customers.size();i++)
        {
            Customer customer = customers.get(i);
            if (name.equals(customer.getCustomerName()))
            {
                return  customer ;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return naam;
    }
}
