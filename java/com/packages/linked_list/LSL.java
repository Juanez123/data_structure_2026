package com.packages.linked_list;

public class LSL {
    public Node head; // Primer nodo de la lista simplemente ligada

    public LSL() {
        this.head = null; // Inicializa la lista como vacía
    }

    public static class Node {
        int data; // Dato numérico del nodo
        Node next; // Enlace al siguiente nodo

        public Node(int data) {
            this.data = data; // Asigna el valor del nodo
            this.next = null; // Inicializa el enlace siguiente como null
        }
    }

    public void createBeginLSL(int datum) {
        Node newNode = new Node(datum); // Crea un nuevo nodo con el dato
        newNode.next = head; // Apunta el nuevo nodo al antiguo primer nodo
        head = newNode; // Actualiza la cabeza de la lista
    }

    public void showLSL() {
        if (head == null) {
            System.out.println("La lista está vacía"); // No hay nodos que mostrar
            return;
        }
        System.out.println("\nElementos de la lista:"); // Encabezado visual
        Node current = head; // Inicia el recorrido desde el primer nodo
        while (current != null) {
            System.out.print(current.data + " -> "); // Imprime el dato y la flecha
            current = current.next; // Avanza al siguiente nodo
        }
        System.out.println("null"); // Marca el final de la lista
    }

    public int sumNodesLSL() {
        int sum = 0; // Acumulador de la suma
        Node current = head; // Comienza desde el inicio de la lista
        while (current != null) {
            sum += current.data; // Suma el dato actual
            current = current.next; // Avanza al siguiente nodo
        }
        return sum; // Retorna la suma total
    }

    public void displayLSLRecursivity(Node p) {
        if (p != null) {
            System.out.println(p.data); // Imprime el dato actual
            displayLSLRecursivity(p.next); // Llama recursivamente con el siguiente nodo
        }
    }

    public int countNodesLSL() {
        int c = 0; // Contador de nodos
        Node p = head; // Inicia en la cabeza
        while (p != null) {
            c++; // Incrementa contador
            p = p.next; // Avanza al siguiente nodo
        }
        return c; // Retorna la cantidad de nodos
    }

    public Node findLSL(int datum) {
        Node p = head; // Inicia la búsqueda desde el primer nodo
        while (p != null) {
            if (p.data == datum) {
                return p; // Retorna el nodo cuando encuentra el dato
            }
            p = p.next; // Avanza al siguiente nodo
        }
        return null; // Retorna null si no encuentra el dato
    }

    public void updateNode(Node p, int datum) {
        if (p != null) {
            p.data = datum; // Actualiza el dato en el nodo encontrado
        }
    }

    public void deleteNodeLSL(int datum) {
        if (head == null) {
            return; // Nada que eliminar si la lista está vacía
        }
        if (head.data == datum) {
            head = head.next; // Elimina el primer nodo
            return;
        }
        Node prev = head; // Nodo anterior al actual
        Node current = head.next; // Nodo actual en el recorrido
        while (current != null && current.data != datum) {
            prev = current; // Avanza nodo anterior
            current = current.next; // Avanza nodo actual
        }
        if (current != null) {
            prev.next = current.next; // Salta el nodo encontrado
        }
    }

    public Node findReferenceLSL(int datum) {
        return findLSL(datum); // Reutiliza la búsqueda existente
    }

    public void insertBeforeLSL(Node ref, int datum) {
        if (ref == null) {
            return; // No hace nada si la referencia es nula
        }
        Node mem = new Node(datum); // Crea un nuevo nodo para insertar
        if (head == ref) {
            mem.next = head; // Inserta antes de la cabeza
            head = mem; // Actualiza la cabeza
            return;
        }
        Node p = head; // Recorre la lista para encontrar el nodo anterior a ref
        while (p != null && p.next != ref) {
            p = p.next; // Avanza en la lista
        }
        if (p != null) {
            mem.next = ref; // Apunta el nuevo nodo a la referencia
            p.next = mem; // Enlaza el nodo anterior con el nuevo nodo
        }
    }
}
