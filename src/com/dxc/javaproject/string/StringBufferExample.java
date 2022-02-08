package com.dxc.javaproject.string;

public class StringBufferExample {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hai ");
        sb.append("java");
        sb.insert(1,"java");
        sb.replace(1,3,"java");
        sb.delete(1,2);
        sb.reverse();
        System.out.println(sb);

    }
}
