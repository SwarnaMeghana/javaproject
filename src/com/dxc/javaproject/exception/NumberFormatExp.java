package com.dxc.javaproject.exception;

public class NumberFormatExp {

    public static void main(String args[])
    {
        try {
            int num = Integer.parseInt ("java") ;
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number format exception");
        }
    }
}
