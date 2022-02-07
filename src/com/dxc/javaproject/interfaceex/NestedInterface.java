package com.dxc.javaproject.interfaceex;

class Fruit {
    interface Activity {
        void taste();
    }
}
class Mango implements Fruit.Activity {
    public void taste() {
        System.out.println("mango is sweet");
    }
}
public class NestedInterface {
    public static void main(String args[]) {
        Mango mango= new Mango();
        mango.taste();
        }
        }