package com.packages.recursivity;

// Clase con ejemplos de métodos recursivos y también métodos iterativos relacionados
public class Recursion {
    public Recursion() {
        // Constructor vacío; la clase expone métodos estáticos principalmente
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Caso base: 0! es 1
        } else {
            return n * factorial(n - 1); // Llamada recursiva con n-1
        }
    }

    public static int sumSquare(int n) {
        if (n == 1) {
            return 1; // Caso base: suma de cuadrados hasta 1
        } else {
            return n * n + sumSquare(n - 1); // Suma el cuadrado de n y recurre
        }
    }

    public static void displayNaturalNumbersDesc(int n) {
        if (n > 0) {
            System.out.println(n); // Imprime el número actual
            displayNaturalNumbersDesc(n - 1); // Llamada recursiva hacia el siguiente menor
        }
    }

    public static void displayNaturalNumbersAsc(int n, int i) {
        if (i <= n) {
            System.out.println(i); // Imprime el número actual ascendente
            displayNaturalNumbersAsc(n, i + 1); // Llamada recursiva incrementando el contador
        }
    }

    public static void FibonacciIterative(int n) {
        if (n <= 0) {
            return; // No hay secuencia para valores menores o iguales a 0
        }
        int t1 = 0; // Primer término de Fibonacci
        int t2 = 1; // Segundo término de Fibonacci
        if (n >= 1) {
            System.out.println(t1); // Imprime el primer término
        }
        if (n >= 2) {
            System.out.println(t2); // Imprime el segundo término
        }
        for (int i = 3; i <= n; i++) {
            int t3 = t1 + t2; // Calcula el siguiente término como suma de los dos anteriores
            System.out.println(t3); // Imprime el término actual
            t1 = t2; // Avanza el término anterior
            t2 = t3; // Avanza el término actual
        }
    }

    public static int FibonacciRecursive(int n) {
        if (n > 1) {
            return FibonacciRecursive(n - 1) + FibonacciRecursive(n - 2); // Suma recursiva de los dos términos previos
        } else {
            return n; // Caso base: retorna n cuando es 0 o 1
        }
    }
}
