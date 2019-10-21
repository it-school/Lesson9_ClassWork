package com.itschool.Task1;

public class ClassRoomExtended {
    public Pupil[] pupils;

    public ClassRoomExtended(int pupilsNumber) {
        pupils = new Pupil[pupilsNumber];
    }

    @Override
    public String toString() {
        String result = "\nClassRoomExtended\n\n";
        for (int i = 0; i < this.pupils.length; i++) {
            result += "\n" + pupils[i];
        }

        return result;
    }
}
