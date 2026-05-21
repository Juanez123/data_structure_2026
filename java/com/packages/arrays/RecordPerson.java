package com.packages.arrays;

/**
 * Registro inmutable de una persona usado por la funcionalidad de registros.
 */
public record RecordPerson(String name, byte age) {
    @Override
    public String toString() {
        return "Nombre: " + name + " | Edad: " + age; // Construye la representación de texto de la persona
    }
}
