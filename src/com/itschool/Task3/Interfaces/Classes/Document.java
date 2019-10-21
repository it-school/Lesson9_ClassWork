package com.itschool.Task3.Interfaces.Classes;

public class Document {
    private DocumentWorker document;

    public Document(String key) {
        switch (key) {
            case "11111":
                document = new DocumentWorkerPro();
                break;
            case "77777":
                document = new DocumentWorkerExpert();
                break;
            default:
                document = new DocumentWorker();
        }
    }

    public DocumentWorker getDocument() {
        return document;
    }

    public void setDocument(DocumentWorker document) {
        this.document = document;
    }
}
