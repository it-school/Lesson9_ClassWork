package com.itschool;

import com.itschool.Task2.Interfaces.Classes.Fighter;
import com.itschool.Task3.Classes.DocumentWorker;
import com.itschool.Task3.Classes.DocumentWorkerExpert;
import com.itschool.Task3.Classes.DocumentWorkerPro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fighter figter = new Fighter(10, 2);
        System.out.println(figter);

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

        int key;
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();
        DocumentWorker dw;
        switch (key)
        {
            case 11111:
                dw = new DocumentWorkerPro();
                break;
            case 77777:
                dw = new DocumentWorkerExpert();
                break;
            default:
                dw = new DocumentWorker();
        }
        System.out.println("\n Let's test:\n\n");
        dw.Open();
        dw.Edit();
        dw.Save();
    }
}
