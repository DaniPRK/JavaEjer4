package com.openbootcamp;

public class SmartDevices {

    boolean touchScreen;
    int battery;
    String red;
    int capacidad;

    // Constructor vacío
    public SmartDevices(){

    }
    // Constructor con parámetros
    public SmartDevices(boolean touchScreen, int battery, String red, int capacidad){
        this.touchScreen = touchScreen;
        this.battery = battery;
        this.red= red;
        this.capacidad = capacidad;
    }
}
