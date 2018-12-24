package com.company;

public class Car
{

    public String model;
    public int power;
    public int weight;

    public Car ( String model, int power, int weight )
    {
        this.model= model;
        this.weight= weight;
        this.power= power;
        System.out.println(model + " " + power + " " + weight);
    }

    public void power  ( int power )
    {
        this.power = power;
        System.out.println(model + " " + power + " " + weight);

    }
}