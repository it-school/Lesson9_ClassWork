package com.itschool.Task1;

public class BadPupil extends Pupil {
    public BadPupil(String name, int age) {
        super(name, age);
        this.characteristics = "bad";
    }

    @Override
    public String relax() {
        return super.relax() + "excellent";
    }
}
