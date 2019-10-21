package com.itschool.Task1;

public class ClassRoom {
    Pupil pupil;
    ExcelentPupil excelentPupil;
    GoodPupil goodPupil;
    BadPupil badPupil;

    public ClassRoom() {
        pupil = new Pupil("", 0);
        excelentPupil = new ExcelentPupil("John", 12);
        goodPupil = new GoodPupil("Bill", 14);
        badPupil = new BadPupil("Mark", 20);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "pupil=" + pupil.study() + pupil.read() + pupil.write() + pupil.relax() +
                ", excelentPupil=" + excelentPupil.study() + excelentPupil.read() + excelentPupil.write() + excelentPupil.relax() +
                ", goodPupil=" + goodPupil.study() + goodPupil.read() + goodPupil.write() + goodPupil.relax() +
                ", badPupil=" + badPupil.study() + badPupil.read() + badPupil.write() + badPupil.relax() +
                '}';
    }
}
