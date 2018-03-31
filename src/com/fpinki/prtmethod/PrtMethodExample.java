package com.fpinki.prtmethod;

public class PrtMethodExample {
    private int age;
    private String name;

    public PrtMethodExample(String name, int age){
        this(name);
        //this.name=name;
        this.age = age;
    }

    private PrtMethodExample(String name){
        this.name = name;
    }

    public PrtMethodExample(){
        name = "-- no name ---";
        age = 0;

    }

    private void printDetails(){
        System.out.println("Name: " + name + "\n" + "Age: " + age);
    }

    public void p(){
        System.out.println("Hi");
        printDetails();
        System.out.println("Exit");
    }

    public void setAge(int age){
        this.age = age;
    }

}
