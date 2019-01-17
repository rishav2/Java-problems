package com.rishu;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String customerName;
    public Customer(String customerName, double intAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
        addTransactions(intAmount);

    }
    public void addTransactions(double intAmount)
    {

            this.transactions.add(intAmount);

    }


    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getCustomerName() {
        return customerName;
    }
}
