package ru.javabegin.training.fastjava2.edy.academy.jc;

public class Car {
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed; 
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public static int accelerate(int x){
        return  x=x+1;
    }
    public static int slowDown(int x){
        return  x=x-1;
    }
}
