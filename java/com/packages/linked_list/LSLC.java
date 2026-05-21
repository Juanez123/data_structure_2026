package com.packages.linked_list;

public class LSLC {
    public Node head; // Primer nodo de la lista circular
    public Node tail; // Último nodo de la lista circular
    private int n; // Contador de nodos en la lista

    public LSLC() {
        head = null; // Inicializa la lista vacía
        tail = null; // No hay cola cuando la lista está vacía
        n = 0; // Contador de nodos en cero
    }

    public Node getHead() {
        return head; // Retorna el primer nodo
    }

    public void setHead(Node head) {
        this.head = head; // Establece la cabeza de la lista
    }

    public int getN() {
        return n; // Retorna el número de nodos
    }

    public void setN(int n) {
        this.n = n; // Establece manualmente el contador
    }

    public void createEndLSLC(int datum) {
        Node mem = new Node(); // Crea un nuevo nodo sin enlace inicial
        mem.info = datum; // Asigna el dato al nodo
        n++; // Aumenta el contador de nodos
        if (head == null) {
            head = mem; // Si la lista estaba vacía, el nuevo nodo es la cabeza
        } else {
            tail.link = mem; // Enlaza el antiguo tail con el nuevo nodo
        }
        tail = mem; // Actualiza el tail al nuevo nodo
        tail.link = head; // Hace la lista circular apuntando al inicio
    }

    public void showLSLC() {
        if (head == null) {
            System.out.println("La lista circular está vacía"); // Mensaje cuando no hay nodos
            return;
        }
        Node p = head; // Comienza desde la cabeza
        System.out.println(p.info); // Imprime la información del primer nodo
        p = p.link; // Avanza al siguiente nodo
        while (p != head) { // Recorre hasta regresar a la cabeza
            System.out.println(p.info); // Imprime cada nodo
            p = p.link; // Avanza en la lista circular
        }
    }
}
