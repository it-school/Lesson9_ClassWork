package com.itschool;

import com.itschool.Task1.*;
import com.itschool.Task2.Interfaces.Classes.Fighter;
import com.itschool.Task2.Interfaces.Classes.Jet;
import com.itschool.Task3.Interfaces.Classes.Document;
import com.itschool.Task3.Interfaces.Classes.DocumentWorker;
import com.itschool.Task3.Interfaces.Classes.DocumentWorkerExpert;
import com.itschool.Task3.Interfaces.Classes.DocumentWorkerPro;

import java.util.Scanner;

public class Main {
    public static void task1() {
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
    }

    private static void task2() {
        Fighter fighter = new Fighter(10, 2);
        System.out.println(fighter);

        Jet jet = new Jet();
        jet.setMaxSpeed(900);
        jet.setPassengers(100);
        jet.setMaxDistance(2000);
        System.out.println(jet);
    }

    private static void task3() {
        DocumentWorker documentWorker = new DocumentWorker();
        documentWorker.Open();
        documentWorker.Edit();
        documentWorker.Save();

        DocumentWorkerPro documentWorkerPro = new DocumentWorkerPro();
        documentWorkerPro.Open();
        documentWorkerPro.Edit();
        documentWorkerPro.Save();

        DocumentWorkerExpert documentWorkerExpert = new DocumentWorkerExpert();
        documentWorkerExpert.Open();
        documentWorkerExpert.Edit();
        documentWorkerExpert.Save();

        System.out.println("\n Let's test documents. Input registration key:\n\n");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        Document document = new Document(key);

        document.getDocument().Open();
        document.getDocument().Edit();
        document.getDocument().Save();
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
}
