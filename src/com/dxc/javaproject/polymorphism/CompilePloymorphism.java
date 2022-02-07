package com.dxc.javaproject.polymorphism;

public class CompilePloymorphism {
    public static void main(String args[]) {
        CompileTimePloymorphismExample obj = new CompileTimePloymorphismExample();
        obj.display();
        obj.display("Polymorphism");
    }
}
class CompileTimePloymorphismExample {
    void display() {

        System.out.println("In Display without parameter");
    }
    void display(String value) {
        System.out.println("In Display with parameter" + value);
    }
}
