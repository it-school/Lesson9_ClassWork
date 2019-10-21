package com.itschool.Task1;

public class Main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil("Pupil", 10);
        System.out.println(pupil.study());
        System.out.println(pupil.read());
        System.out.println(pupil.write());
        System.out.println(pupil.relax());

        ExcelentPupil excelentPupil = new ExcelentPupil("John", 12);
        System.out.println(excelentPupil.study());
        System.out.println(excelentPupil.read());
        System.out.println(excelentPupil.write());
        System.out.println(excelentPupil.relax());

        GoodPupil goodPupil = new GoodPupil("Bill", 14);
        System.out.println(goodPupil.study());
        System.out.println(goodPupil.read());
        System.out.println(goodPupil.write());
        System.out.println(goodPupil.relax());

        BadPupil badPupil = new BadPupil("Mark", 20);
        System.out.println(badPupil.study());
        System.out.println(badPupil.read());
        System.out.println(badPupil.write());
        System.out.println(badPupil.relax());

        ClassRoom classRoom = new ClassRoom();
        System.out.println(classRoom);

        ClassRoomExtended classRoomExtended = new ClassRoomExtended(4);
        classRoomExtended.pupils[0] = excelentPupil;
        classRoomExtended.pupils[1] = badPupil;
        classRoomExtended.pupils[2] = goodPupil;
        classRoomExtended.pupils[3] = new ExcelentPupil("Kolya", 13);
/*

        System.out.println("\nClassRoomExtended\n\n");
        for (Pupil subpupil : classRoomExtended.pupils){
            System.out.println(subpupil);
        }

        System.out.println("\nClassRoomExtended\n\n");
        for (int i = 0; i < classRoomExtended.pupils.length; i++) {
            System.out.println(classRoomExtended.pupils[i]);
        }
*/
        System.out.println(classRoomExtended);

        System.out.println(classRoomExtended.pupils[0] instanceof Pupil);
        System.out.println(classRoomExtended.pupils[0] instanceof ExcelentPupil);
        System.out.println(classRoomExtended.pupils[0] instanceof GoodPupil);
        System.out.println(classRoomExtended.pupils[0] instanceof BadPupil);

        System.out.println();
        int i = 5;

        Integer integer = new Integer(5);
        integer = i; // boxing
        i = integer; // unboxing
        Double doubleNumber = new Double(5);
        System.out.println((int) integer == doubleNumber);
        System.out.println(new Long(integer) instanceof Number);
        System.out.println(doubleNumber instanceof Number);
    }
}
