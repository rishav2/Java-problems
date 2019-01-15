package com.rishu;

public class Number {
    private String number;
    private String name;

    public Number(String name, String number) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
    public static Number createContact(String name,String number)
    {
        return new Number(name,number);

    }
}
