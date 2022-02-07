package com.dxc.javaproject.polymorphism;
class Test {
    public void method()
    {
        System.out.println("A");
    }
}
public class Run extends Test{
    public void method()
    {
        System.out.println("B");
    }


    public static void main(String args[])
    {
        Test test = new Run();

        test.method();
    }

}