package com.packages.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Maneja una lista de personas y operaciones básicas sobre registros.
 */
public class Persons {
    private final List<RecordPerson> people; // Lista que almacena los registros de personas

    public Persons() {
        this.people = new ArrayList<>(); // Inicializa la lista vacía
    }

    /**
     * Crea y agrega una persona nueva.
     *
     * @param name nombre de la persona.
     * @param age  edad de la persona.
     */
    public void createPerson(String name, byte age) {
        this.people.add(new RecordPerson(name, age)); // Añade un nuevo registro a la lista
    }

    /**
     * Muestra la lista de personas registradas.
     */
    public void showPerson() {
        if (people.isEmpty()) {
            System.out.println("No hay personas registradas"); // Mensaje cuando no hay registros
            return;
        }
        System.out.println("\nPersonas registradas:"); // Encabezado de la lista
        for (RecordPerson person : people) {
            System.out.println(person); // Imprime cada registro usando toString()
        }
    }

    /**
     * Calcula y muestra la persona más joven en la lista.
     */
    public void youngPerson() {
        if (people.isEmpty()) {
            System.out.println("No hay personas registradas");
            return; // Si no hay personas, no se puede calcular la más joven
        }
        RecordPerson youngest = people.stream()
                .min(Comparator.comparingInt(RecordPerson::age))
                .orElse(null); // Busca el menor por edad
        if (youngest != null) {
            System.out.println("\nPersona más joven: " + youngest); // Imprime el registro encontrado
        }
    }

    /**
     * Devuelve el número total de personas registradas.
     *
     * @return cantidad de personas.
     */
    public int countPeople() {
        return people.size(); // Retorna el tamaño actual de la lista
    }

    /**
     * Calcula el porcentaje de personas con edad >= 18 años.
     *
     * @return porcentaje (0-100). 0 si no hay personas.
     */
    public double percentageMax18() {
        if (people.isEmpty()) {
            return 0.0; // Retorna 0 si no hay registros
        }
        long adults = people.stream().filter(p -> p.age() >= 18).count(); // Cuenta mayores de 18
        return (double) adults * 100.0 / people.size(); // Devuelve el porcentaje correspondiente
    }
}
