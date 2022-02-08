package com.dxc.javaproject.string;

import java.io.*;
import java.util.*;
class StringEx
{
    public static void main (String[] args)
    {
        String s= "Javaprogramming";
        System.out.println("String length = " + s.length());
        System.out.println("Character at 3rd position = "
               + s.charAt(3));
        System.out.println("Substring " + s.substring(3));
        System.out.println("Substring  = " + s.substring(2,5));
        String s1 = "Java";
        String s2 = "programming";
        System.out.println("Concatenated string  = " +
                s1.concat(s2));
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " +
                s4.indexOf("Share"));
        System.out.println("Index of a  = " +
                s4.indexOf('a',3));
        Boolean out = "Java".equals("programming");
        System.out.println("Checking Equality  " + out);
        out = "Java".equals("programming");
        System.out.println("Checking Equality  " + out);
        out = "Java".equalsIgnoreCase("prOgRamming ");
        System.out.println("Checking Equality " + out);
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        String word1 = "JavAPro";
        System.out.println("Changing to lower Case " +
                word1.toLowerCase());
        String word2 = "JavaPRO";
        System.out.println("Changing to UPPER Case " +
                word2.toUpperCase());
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());
        String str1 = "zavaprogramming";
        System.out.println("Original String " + str1);
        String str2 = "zavaprogramming".replace('z' ,'j') ;
        System.out.println("Replaced z with j -> " + str2);
    }
}