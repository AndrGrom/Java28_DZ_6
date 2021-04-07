package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(4, 2);
        Car car2 = new Car(4, 4);

        Motorcycle motorcycle1 = new Motorcycle(2, 250);
        Motorcycle motorcycle2 = new Motorcycle(3, 150);

        car1.printInfo();
        System.out.println();

        car2.printInfo();
        System.out.println();

        motorcycle1.printInfo();
        System.out.println();

        motorcycle2.printInfo();
        System.out.println();
    }
}
