package com;

import java.io.Serializable;
import java.nio.file.WatchEvent;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewMyCar myCar = new NewMyCar();
        myCar.drive();
    }
}

interface Car {
   default void drive(){
       System.out.println("Car drive");
   }
}

interface Motorcicle {
    void drive();
}

class Toyota implements Car {
    public void drive() {
        System.out.println("Toyotaq drive");
    }
}

class Yamaha implements Motorcicle {
    public void drive() {
        System.out.println("Toyotaq drive");
    }
}

class NewMyCar implements Car, Motorcicle {
    @Override
    public void drive() {
        System.out.println("MyNewCar drive");
    }
}