package ru.kai;

/**
 * 16.04.2018
 * Human
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Human {
    public int age;
    public String name;

    public void makeOlder(int years) {
        this.age = age + years;
    }

    public Human() {

    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
