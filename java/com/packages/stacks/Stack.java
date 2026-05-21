package com.packages.stacks;

// Clase que representa una pila LIFO simple usando un arreglo fijo
public class Stack {
    private final int T = 100; // Capacidad máxima de la pila
    private int top; // Índice de la cima de la pila
    private int stack[] = new int[T]; // Arreglo que contiene los elementos de la pila

    public Stack() {
        top = 0; // Inicializa la pila vacía
    }

    public int getT() {
        return T; // Devuelve la capacidad máxima de la pila
    }

    public int getTop() {
        return top; // Devuelve el número de elementos actuales en la pila
    }

    public void setTop(int top) {
        this.top = top; // Ajusta manualmente el índice superior
    }

    public int[] getStack() {
        return stack; // Devuelve el arreglo que contiene la pila
    }

    public void setStack(int[] stack) {
        this.stack = stack; // Reemplaza el arreglo interno de la pila
    }

    public void stacking(int datum) {
        stack[top] = datum; // Coloca el dato en la posición superior actual
        top++; // Avanza el índice superior
    }

    public int unStacking() {
        int datum = stack[top - 1]; // Guarda el dato de la cima
        top--; // Retrocede el índice superior
        return datum; // Retorna el elemento desapilado
    }

    public void showStack() {
        System.out.println("___"); // Separador visual antes de mostrar la pila
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]); // Muestra cada elemento desde la cima hacia abajo
            System.out.println("___"); // Línea separadora entre elementos
        }
    }
}
