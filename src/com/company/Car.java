package com.company;

public class Car extends Vehicle implements Costable {

    private int doorsCount;

    public Car(int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    protected void printInfo() {
        System.out.println(this + "\n Цена машины = "+ getCost() + " $");
    }

    @Override
    public String toString() {
        return "Транспортное средство: машина \n" +
                "Количество дверей: " + this.doorsCount +
                "\n Количество колес: " + this.wheelCount;
    }

    @Override
    public int getCost() {
        return (int) (Math.random() * 10000);
    }
}
