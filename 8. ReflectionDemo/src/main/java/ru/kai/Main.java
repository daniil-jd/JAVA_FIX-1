package ru.kai;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 16.04.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class aClass = Human.class;
        System.out.println(aClass.getName());

        Human humanObject = (Human)aClass.newInstance();
        System.out.println(humanObject.age);

        Field ageField = aClass.getField("age");
        System.out.println(ageField.getType() + " " + ageField.getName());

        ageField.set(humanObject, 15);
        System.out.println(humanObject.age);

        // humanObject.makeOlder(10);

        Method makeOlderMethod = aClass.getMethod("makeOlder", int.class);
        makeOlderMethod.invoke(humanObject, 30);
        System.out.println(humanObject.age);

        Constructor humanConstructor = aClass.getConstructor(int.class, String.class);

        Human byConstructorHumanObject = (Human) humanConstructor.newInstance(24, "Marsel");
        System.out.println(byConstructorHumanObject.age +" " + byConstructorHumanObject.name);
    }
}
