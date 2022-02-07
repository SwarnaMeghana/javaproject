package com.dxc.javaproject.exception;

class ArrayIndex
{
    public static void main(String args[])
    {
        try{
            int a[] = new int[4];
            a[7] = 8;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
}