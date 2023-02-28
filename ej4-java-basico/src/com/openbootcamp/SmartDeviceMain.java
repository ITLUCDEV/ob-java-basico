package com.openbootcamp;

public class SmartDeviceMain {

    public static void main(String[] args) {

        SmartPhone iphone5 = new SmartPhone("Apple", "Iphone 5", 2003, 499.99, 48.5, 45.2, 5);
        SmartWatch watchSE = new SmartWatch("Apple", "SmartWatch SE", 2017, 1499.99, 20.5, 20.5, 5);

        System.out.println(iphone5);
        System.out.println(watchSE);

    }

}
