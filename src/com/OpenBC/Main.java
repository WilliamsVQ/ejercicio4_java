package com.OpenBC;

import java.net.StandardSocketOptions;

public class Main extends SmartDevice{
    public static void main(String[] args) {
        SmartPhone a = new SmartPhone("Sony","Xperia",1000);
        System.out.println("SmartPhone: "+a.toString());
        SmartWatch b = new SmartWatch("Samsung","S2",200);
        System.out.println("Smartwatch: "+b.toString());

    }
}
