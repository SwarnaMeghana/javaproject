package com.dxc.javaproject.exception;

public class StringIndexExcep {
    public static void main(String[] args) {
        String str = "Welcome to java.";
        try {
            str.charAt(20);
            System.out.println("String Index is valid");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index is out of bounds");
        }
    }
}