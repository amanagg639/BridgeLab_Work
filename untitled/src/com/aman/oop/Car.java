package com.aman.oop;

public class Car extends Vechile{
        String color;
        public Car(int wheels, int speed,String color){
            super(wheels, speed);
            this.color = color;
        }
        public void getInfo() {
            System.out.println("wheels: " + super.wheels);
            System.out.println("color: " + this.color);
            System.out.println("speed: " + this.speed);
        }
}
