package com.packages.queues;

// Clase que representa una cola FIFO simple usando un arreglo estático
public class Queue {
    private final int T = 100; // Capacidad máxima de la cola
    private int end; // Índice del siguiente espacio disponible en la cola
    private int queue[] = new int[T]; // Arreglo que guarda los elementos de la cola

    public Queue() {
        end = 0; // Inicializa la cola vacía con tamaño 0
    }

    public int getEnd() {
        return end; // Devuelve el número de elementos actuales en la cola
    }

    public void setEnd(int end) {
        this.end = end; // Ajusta el tamaño de la cola manualmente
    }

    public int[] getQueue() {
        return queue; // Devuelve la referencia al arreglo interno
    }

    public void setQueue(int[] queue) {
        this.queue = queue; // Reemplaza el arreglo interno de la cola
    }

    public int getT() {
        return T; // Devuelve la capacidad máxima de la cola
    }

    public void addQueue(int datum) {
        queue[end] = datum; // Coloca el dato en la posición final actual
        end++; // Incrementa el tamaño de la cola
    }

    public int popQueue() {
        int saved = queue[0]; // Guarda el primer elemento para retornarlo
        for (int i = 0; i < end - 1; i++) {
            queue[i] = queue[i + 1]; // Desplaza todos los elementos hacia adelante
        }
        end--; // Reduce el tamaño de la cola
        return saved; // Retorna el elemento desencolado
    }

    public void displayQueue() {
        for (int i = 0; i < end; i++) {
            System.out.print(queue[i] + " <-- "); // Imprime cada elemento de la cola
        }
        System.out.println(); // Salto de línea al finalizar la impresión
    }
}
