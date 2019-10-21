package com.itschool;

import com.itschool.Task2.Interfaces.Classes.Fighter;
import com.itschool.Task2.Interfaces.Classes.Jet;
import com.itschool.Task3.Classes.Document;
import com.itschool.Task3.Classes.DocumentWorker;
import com.itschool.Task3.Classes.DocumentWorkerExpert;
import com.itschool.Task3.Classes.DocumentWorkerPro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fighter fighter = new Fighter(10, 2);
        System.out.println(fighter);

        Jet jet = new Jet();
        jet.setMaxSpeed(900);
        jet.setPassengers(100);
        jet.setMaxDistance(2000);
        System.out.println(jet);

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


        System.out.println("\n Let's test:\n\n");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        Document document = new Document(key);

        document.getDocument().Open();
        document.getDocument().Edit();
        document.getDocument().Save();
    }
}
