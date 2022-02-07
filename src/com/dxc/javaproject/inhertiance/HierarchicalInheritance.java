package com.dxc.javaproject.inhertiance;

    class Fruit{
        void taste()
        {
            System.out.println("sweet...");
        }
    }
    class Apple extends Fruit {
        void color()
        {
            System.out.println("red...");
        }
    }
    class Mangoes extends Fruit{
        void color()
        {
            System.out.println("yellow...");
        }
    }
    public class HierarchicalInheritance  {
        public static void main(String args[])
        {
           Mangoes d = new Mangoes();
            d.taste();
            d.color();
            Apple b= new Apple();
            b.color();

        }
    }

