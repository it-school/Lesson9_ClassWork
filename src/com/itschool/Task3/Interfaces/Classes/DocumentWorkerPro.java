package com.itschool.Task3.Interfaces.Classes;

public class DocumentWorkerPro extends DocumentWorker
{
    @Override
    public void Edit()
    {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void Save()
    {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
