package com.packages.records;

import java.util.ArrayList;
import java.util.List;

public class Persons {
    private List<Person> people;

    public Persons() {
        this.people = new ArrayList<>();
    }

    // Clase interna para representar una persona
    public static class Person {
        private String name;
        private byte age;

        public Person(String name, byte age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public byte getAge() {
            return age;
        }
    }

    // Crear y agregar una nueva persona
    public void createPerson(String name, byte age) {
        people.add(new Person(name, age));
    }

    // Mostrar todas las personas registradas
    public void showPerson() {
        if (people.isEmpty()) {
            System.out.println("No hay personas registradas");
            return;
        }
        System.out.println("\nPersonas registradas:");
        for (Person p : people) {
            System.out.println("Nombre: " + p.getName() + " | Edad: " + p.getAge());
        }
    }

    // Encontrar y mostrar la persona más joven
    public void youngPerson() {
        if (people.isEmpty()) {
            System.out.println("No hay personas registradas");
            return;
        }
        Person youngest = people.get(0);
        for (Person p : people) {
            if (p.getAge() < youngest.getAge()) {
                youngest = p;
            }
        }
        System.out.println("\nPersona más joven: " + youngest.getName() + " (" + youngest.getAge() + " años)");
    }
}
