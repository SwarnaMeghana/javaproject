package com.dxc.javaproject.polymorphism;

class Fruites {
    public void displayInfo() {
        System.out.println("It is a fruit");
    }
}
class Grapes extends Fruites {

    public void displayInfo() {
        System.out.println("grapes");
    }
}
class MethodOverriding {
    public static void main(String[] args) {
        Grapes d1 = new Grapes();
        d1.displayInfo();
    }
}