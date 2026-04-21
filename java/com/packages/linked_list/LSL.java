package com.packages.linked_list;

public class LSL {
    private Node head;

    public LSL() {
        this.head = null;
    }

    // Nodo interno de la lista simplemente ligada
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Agregar un dato al inicio de la lista
    public void createBeginLSL(int datum) {
        Node newNode = new Node(datum);
        newNode.next = head;
        head = newNode;
    }

    // Mostrar los elementos de la lista
    public void showLSL() {
        if (head == null) {
            System.out.println("La lista está vacía");
            return;
        }
        System.out.println("\nElementos de la lista:");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Calcular la suma de todos los nodos
    public int sumNodesLSL() {
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }
}
