package ru;

import java.util.Random;

public class Cat extends Animal{

    private static final String ANIMAL_FAMILY = "Семейство кошачьих";
    private Boolean sterilization;

    public Cat(String name, int age, Boolean sterilization){
        super(name, age);
        this.sterilization = sterilization;
    }

    public void displayInfo(){
        System.out.printf("%s; \nКличка: %s; \nВозраст: %d; \nСтерилизация: %s\n",
                ANIMAL_FAMILY, name, age,
                sterilization ? "Да" : "Нет");
    }

    /*public void makeSound(){
        System.out.printf("Мяу!\n");
    }*/

    public void hunting(){
        Random r = new Random();
        int prey = r.nextInt(100 + 1);
        if (prey < 10)
            System.out.printf("Добыча: хвост");
        else if (prey < 30)
            System.out.printf("Добыча: яцерица");
        else if (prey < 80)
            System.out.printf("Добыча: мышь");
        else
            System.out.printf("Добыча: крот");
    }
}
