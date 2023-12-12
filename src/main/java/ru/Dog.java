package ru;

public class Dog extends Animal{

    private static final String ANIMAL_FAMILY = "Семейство собачьих";
    private Boolean trainedInTeams;

    public Dog(String name, int age, Boolean trainedInTeams){
        super(name, age);
        this.trainedInTeams = trainedInTeams;
    }

    public void displayInfo(){
        System.out.printf("%s; \nКличка: %s; \nВозраст: %d; \nЗнание команд: %s\n",
                ANIMAL_FAMILY, super.name, super.age,
                trainedInTeams ? "имеет" : "не имеет");
    }

    public void makeSound(){
        System.out.printf("Гав!\n");
    }

    public void newCommand(){
        System.out.println(trainedInTeams ? "Обучилась новой команде" : "Непоняла что от неё хотят");
    }
}
