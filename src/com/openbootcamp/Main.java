package com.openbootcamp;

import com.openbootcamp.SmartDevices;
import com.openbootcamp.SmartPhone;
import com.openbootcamp.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartPhone iPhone11 = new SmartPhone();
            iPhone11.battery = 2000;
            iPhone11.red = "5G";
            iPhone11.camera = 12;
            iPhone11.touchScreen = true;
            iPhone11.capacidad = 120;

                    System.out.println("Características del iPhone 11");
                    System.out.println("Batería:"+ " " + iPhone11.battery);
                    System.out.println("Red sportada:" + " " + iPhone11.red);
                    System.out.println("Cámara de:" + " " + iPhone11.camera + "mpx");
                    System.out.println(iPhone11.touchScreen);
                    System.out.println("Y capacidad de:" + " " + iPhone11.battery);

        SmartWatch AppleWatch = new SmartWatch();
            AppleWatch.battery = 296;
            AppleWatch.red = "4G";
            AppleWatch.capacidad = 32;
            AppleWatch.touchScreen = true;
            AppleWatch.WalkieTalkie = true;

                    System.out.println("Características del Apple Watch");
                    System.out.println("Batería:" + " " + AppleWatch.battery);
                    System.out.println("Red sportada:" + " " + AppleWatch.red);
                    System.out.println("Capacidad de:" + " " + AppleWatch.capacidad);
                    System.out.println(AppleWatch.touchScreen);
                    System.out.println(AppleWatch.WalkieTalkie);

    }
}