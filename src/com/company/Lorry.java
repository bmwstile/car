package com.company;

public class Lorry extends Car
{
    private int loadСapacity;

    public Lorry ( String model, int power, int weight, int loadСapacity )
    {
        super( model, power, weight );
        this.loadСapacity = loadСapacity;
        System.out.println("Грузоподъемность - " + loadСapacity);
    }

    public void model  ( String model )
    {
        this.model = model;
        System.out.println(model + " " + power + " " + weight + " " + loadСapacity);

    }

    public void loadСapacity ( int loadСapacity )
    {
        this.loadСapacity = loadСapacity;
        System.out.println(model + " " + power + " " + weight + " " + loadСapacity);

    }
}