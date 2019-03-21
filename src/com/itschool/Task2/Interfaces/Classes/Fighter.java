package com.itschool.Task2.Interfaces.Classes;

public class Fighter extends AbstractPlane
{
    private int ammo;

    public int getAmmo()
    {
        return ammo;
    }

    public void setAmmo(int ammo)
    {
        this.ammo = ammo >= 0 ? ammo : 0;
    }

    @Override
    public int GetPassengersQuantity()
    {
        return getPassengers();
    }

    @Override
    public void GetCharacteristics()
    {
        System.out.println(ammo);
    }

    @Override
    public void Move()
    {
        System.out.println("Let's fly to attack!!!");
    }

    public Fighter(int ammo, int passengers)
    {
        setAmmo(ammo);
        setPassengers(passengers);
    }

    @Override
    public String toString()
    {
        return "Fighter{" + "ammo=" + ammo + ", passengers=" + getPassengers() + '}';
    }

    //TODO Add method ToBomb();
}
