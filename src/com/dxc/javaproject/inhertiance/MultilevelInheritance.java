package com.dxc.javaproject.inhertiance;
class Tree{
    void leaves()
    {
        System.out.println("green...");
    }
}
class Fruits extends Tree{
    void taste()
    {
        System.out.println("sweet...");
    }
}
class Mango extends Fruits{
    void color()
    {
        System.out.println("yellow...");
    }
}
public class MultilevelInheritance {
    public static void main(String args[]) {
        Mango d = new Mango();
        d.leaves();
        d.taste();
        d.color();
    }
}