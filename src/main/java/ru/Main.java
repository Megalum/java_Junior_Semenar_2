package ru;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Class<?> animalClass = Class.forName("ru.Animal");

        Animal[] animals = new Animal[]{
                new Dog("Пёс", 4, true),
                new Dog("Жук", 1, false),
                new Cat("Барсик", 2, false),
                new Cat("Мура", 7, true)
        };

        for (Animal animal : animals) {
            Method print = animalClass.getDeclaredMethod("displayInfo");
            print.invoke(animal);

            Method sound = animalClass.getDeclaredMethod("makeSound");
            sound.invoke(animal);

            System.out.println();
        }
    }
}