package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "Arif"; name variable is private so write getter and setter
//        System.out.println(obj.name);  can't print as name is private

        obj.setName("Arif");
        System.out.println(obj.getName());
    }
}