package com.itschool.Task2.Interfaces.Classes;
import com.itschool.Task2.Interfaces.IVehicle;

public abstract class AbstractCar implements IVehicle
{
    public int getPassengers()
    {
        return passengers;
    }

    public void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }

    private int passengers;

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    private int maxSpeed;

    //TODO Add GetInfo
}
