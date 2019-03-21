package com.itschool.Task2.Interfaces.Classes;

public class Jet extends AbstractPlane
{
    int maxDistance;

    @Override
    public int GetPassengersQuantity()
    {
        return getPassengers();
    }

    @Override
    public void GetCharacteristics()
    {
        System.out.println(maxDistance);
    }

    @Override
    public void Move()
    {
        System.out.println("Let's fly to tranfers passengers!");
    }
}
