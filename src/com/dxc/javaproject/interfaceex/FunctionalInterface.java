package com.dxc.javaproject.interfaceex;

interface message{
    void say(String msg);
}
public class FunctionalInterface implements message{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInterface fi = new FunctionalInterface();
        fi.say("Hai");
    }
}
