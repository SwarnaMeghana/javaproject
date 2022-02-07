package com.dxc.javaproject.polymorphism;

class MethodOverloading {
    private static void display(int a)
    {
        System.out.println(" Int data");
    }

    private static void display(String a)
    {
        System.out.println("String object.");
    }

    public static void main(String[] args)
    {
        display(5);
        display("Hai");
    }
}
