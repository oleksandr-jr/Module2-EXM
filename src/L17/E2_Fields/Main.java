package L17.E2_Fields;


import L17.Common.Car;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Field[] fields = Car.class.getDeclaredFields();
        List<Field> actualFields = List.of(fields);

        //actualFields.forEach(System.out::println);

        actualFields.forEach(field -> {
            System.out.println(field.getType());
            System.out.println(field.getName());
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getModifiers());

            System.out.println("-----");
        });


    }


    static void printFieldInfo(List<Field> fields){
        fields.forEach(e -> System.out.printf("Field type - %s\nField name - %s\nModifiers - %s\n\n", e.getType(), e.getName(), Modifier.toString(e.getModifiers())));
    }
}
