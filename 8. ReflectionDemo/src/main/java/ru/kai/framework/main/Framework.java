package ru.kai.framework.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * 16.04.2018
 * Framework
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Framework {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String className = scanner.nextLine();

        Class aClass = Class.forName(className);

        System.out.println("Fields: ");
        Field[] fields = aClass.getDeclaredFields();
        Class constructorParameters[] = new Class[fields.length];
        int i = 0;
        for (Field field : fields) {
            System.out.println(field.getType() + " " + field.getName());
            constructorParameters[i] = field.getType();
            i++;
        }

        Constructor constructor = aClass.getConstructor(constructorParameters);

        System.out.println("Please enter fields:");
        Object constructorArguments[] = new Object[fields.length];
        i = 0;
        for (Field field : fields) {
            System.out.println("Enter " + field.getName());
            switch (field.getType().getName()) {
                case "int" : {
                    constructorArguments[i] = scanner.nextInt();
                } break;
                case "java.lang.String": {
                    constructorArguments[i] = scanner.nextLine();
                } break;
                case "double": {
                    constructorArguments[i] = scanner.nextDouble();
                } break;
                case "boolean": {
                    constructorArguments[i] = scanner.nextBoolean();
                } break;
            }
            i++;
        }

        Object object = constructor.newInstance(constructorArguments);
        System.out.println(object);
    }
}
