package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car= new Car("BMW", 272, 1500);
        car.power(300);

        Lorry lorry= new Lorry("Mercedes", 850, 7000, 40000);
        lorry.model("Scania");
        lorry.loadСapacity(15000);
    }
}
