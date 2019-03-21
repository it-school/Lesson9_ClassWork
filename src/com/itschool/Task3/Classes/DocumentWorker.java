package com.itschool.Task3.Classes;

import com.itschool.Task3.Interfaces.IDocument;

public class DocumentWorker implements IDocument
{
    @Override
    public void Open()
    {
        System.out.println("Документ открыт");
    }

    @Override
    public void Edit()
    {
        System.out.println("Редактирование документа доступно в версии Про");
    }

    @Override
    public void Save()
    {
        System.out.println("Сохранение документа доступно в версии Про");
    }
}