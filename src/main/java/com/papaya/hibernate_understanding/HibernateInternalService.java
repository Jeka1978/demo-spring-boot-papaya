package com.papaya.hibernate_understanding;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Evgeny Borisov
 */
public class HibernateInternalService {

    @SneakyThrows
    public void printInsertQuery(Object o) {
        Class<?> aClass = o.getClass();
        TableName annotation = aClass.getAnnotation(TableName.class);
        String tableName = annotation != null ? annotation.value() : aClass.getSimpleName();
        List<String> columnNames = Arrays.stream(aClass.getDeclaredFields())
                .map(Field::getName)
                .collect(Collectors.toList());
        var columnValues = new ArrayList<>();
        for (Field field : aClass.getDeclaredFields()) {
            field.setAccessible(true);
            columnValues.add(field.get(o));
        }

        System.out.println("INSERT INTO "+tableName+ " columns: "+columnNames+" values: "+columnValues);
    }

    public static void main(String[] args) {
        Person person = Person.builder().firstName("Tamir").lastName("winner").salary(50).build();
        new HibernateInternalService().printInsertQuery(person);
    }
}








