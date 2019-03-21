package com.itschool.Task2.Interfaces.Classes;

public class Sedan extends AbstractCar
{
    int maxSpeed;
    @Override
    public int GetPassengersQuantity()
    {
        return getPassengers();
    }

    @Override
    public void GetCharacteristics()
    {
        System.out.println(this.maxSpeed);
    }

    @Override
    public void Move()
    {
        System.out.println("Let's move with passengers!");
    }


}
