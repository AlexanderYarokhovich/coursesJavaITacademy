package ru.javabegin.training.fastjava2;

import ru.javabegin.training.fastjava2.edy.academy.jc.Car;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car1 = new Car();
        car1.setSpeed(100);
        car1.setSpeed(220);
        Car car2 = new Car();
        car2.setColor("red");
        car1.setColor("green");
        car1.setSpeed(0);
        car2.setSpeed(0);
    }
}
