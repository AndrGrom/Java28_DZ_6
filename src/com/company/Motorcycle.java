package com.company;

public class Motorcycle extends Vehicle {

    private int maxSpeed;

    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }


    @Override
    protected void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Транспортное средство: Мотоцикл \n" +
                "Максимальная скорость: " + maxSpeed + " км/ч " +
                "\n Количество колес:" + wheelCount;
    }



}
