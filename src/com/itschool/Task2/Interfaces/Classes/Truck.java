package com.itschool.Task2.Interfaces.Classes;

public class Truck extends AbstractCar
{
    int tonnage;
    @Override
    public int GetPassengersQuantity()
    {
        return getPassengers();
    }

    @Override
    public void GetCharacteristics()
    {
        System.out.println(this.tonnage);
    }

    @Override
    public void Move()
    {
        System.out.println("Let's transfer some luggage");
    }
}
