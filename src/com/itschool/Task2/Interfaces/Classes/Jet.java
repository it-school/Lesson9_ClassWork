package com.itschool.Task2.Interfaces.Classes;

public class Jet extends AbstractPlane
{
    private int maxDistance;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

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

    @Override
    public String toString() {
        return "Jet{" +
                "maxDistance=" + maxDistance +
                ", maxSpeed=" + getMaxSpeed() +
                ", maxPassengers=" + getPassengers() +
                '}';
    }
}
