package com.example.lab11_230028;

public class teacher {
    private String name;
    private String subject;

    public teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
}
