package ru;

public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(){
        name = "Name";
        age = 1;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.printf("Кличка: %s; \nВозраст: %d\n", name, age);
    }

    public void makeSound(){
    }
}
