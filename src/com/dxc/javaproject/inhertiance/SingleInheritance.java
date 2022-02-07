package com.dxc.javaproject.inhertiance;
class classA{
    void display1()
    {
        System.out.println("display1() method of classA");
    }
}
class classB extends classA{
    void display2()
    {
        System.out.println("display2() method of classB");
    }
}
public class SingleInheritance {
    public static void main(String args[]){
        classB b=new classB();
        b.display1();
        b.display2();
    }
}

