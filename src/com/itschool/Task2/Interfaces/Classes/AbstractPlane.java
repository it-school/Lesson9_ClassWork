package com.itschool.Task2.Interfaces.Classes;

import com.itschool.Task2.Interfaces.IVehicle;

public abstract class AbstractPlane implements IVehicle
{
    private int maxSpeed;
    private int passengers;

    public int getPassengers()
    {
        return passengers;
    }
    public void setPassengers(int passengers)
    {
        this.passengers = passengers > 0 ? passengers : 1;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
}
