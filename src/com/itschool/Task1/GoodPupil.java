package com.itschool.Task1;

public class GoodPupil extends Pupil {
    public GoodPupil(String name, int age) {
        super(name, age);
        this.characteristics = "good";
    }

    @Override
    public String relax() {
        return super.relax() + this.characteristics;
    }
}

