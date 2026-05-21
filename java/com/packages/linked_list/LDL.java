package com.packages.linked_list;

public class LDL {
    public NodeLDL head; // Primer nodo de la lista doblemente ligada
    private int n; // Contador de nodos en la lista

    public LDL() {
        head = null; // Inicializa la cabeza como null
        n = 0; // Inicializa el contador en cero
    }

    public NodeLDL getHead() {
        return head; // Retorna el nodo inicial
    }

    public void setHead(NodeLDL head) {
        this.head = head; // Establece manualmente el nodo inicial
    }

    public int getN() {
        return n; // Retorna cuántos nodos hay
    }

    public void setN(int n) {
        this.n = n; // Ajusta el contador de nodos
    }

    public void createBeginLDL(int datum) {
        NodeLDL mem = new NodeLDL(); // Crea un nuevo nodo
        mem.info = datum; // Asigna el dato al nodo
        mem.right = head; // Apunta a la antigua cabeza como siguiente
        if (head != null) {
            head.left = mem; // Si existía cabeza, enlaza su izquierda al nuevo nodo
        }
        head = mem; // Actualiza la cabeza de la lista
        mem.left = null; // El nuevo primer nodo no tiene nodo izquierdo
        n++; // Incrementa el contador de nodos
    }

    public void showLDL() {
        NodeLDL p = head; // Comienza desde la cabeza
        while (p != null) {
            System.out.println("-------------"); // Delimitador visual antes del nodo
            System.out.println("Información: " + p.info); // Imprime el dato del nodo
            System.out.println("Liga izquierda: " + p.left); // Imprime el enlace izquierdo
            System.out.println("Liga derecha: " + p.right); // Imprime el enlace derecho
            System.out.println("Dirección nodo: " + p); // Imprime la referencia del nodo
            System.out.println("-------------"); // Delimitador visual después del nodo
            p = p.right; // Avanza al siguiente nodo hacia la derecha
        }
    }

    public NodeLDL findLDL(int datum) {
        NodeLDL p = head; // Nodo actual en la búsqueda
        NodeLDL q = null; // Nodo resultado
        while (p != null && q == null) {
            if (p.info == datum) {
                q = p; // Guarda el nodo cuando coincide el dato
            } else {
                p = p.right; // Avanza al siguiente nodo
            }
        }
        return q; // Retorna el nodo encontrado o null
    }

    public void updateNodeLDL(NodeLDL p, int datum) {
        if (p != null) {
            p.info = datum; // Actualiza el dato del nodo dado
        }
    }

    public void deleteNodeLDL(NodeLDL dir) {
        if (dir == null) {
            return; // No hace nada si la referencia es nula
        }
        if (head == dir) {
            if (head.right != null) {
                head.right.left = null; // Desconecta el nodo cabeza del siguiente
            }
            head = head.right; // Avanza la cabeza
        } else {
            if (dir.left != null) {
                dir.left.right = dir.right; // Salta el nodo eliminado desde la izquierda
            }
            if (dir.right != null) {
                dir.right.left = dir.left; // Salta el nodo eliminado desde la derecha
            }
        }
        n--; // Disminuye el contador de nodos
    }

    public void insertAfterLDL(NodeLDL ref, int datum) {
        if (ref == null) {
            return; // No inserta si la referencia es nula
        }
        NodeLDL mem = new NodeLDL(); // Crea un nuevo nodo
        mem.info = datum; // Asigna el dato
        mem.left = ref; // Enlaza al nodo de referencia como anterior
        mem.right = ref.right; // Enlaza al siguiente del nodo de referencia
        if (ref.right != null) {
            ref.right.left = mem; // Actualiza el enlace izquierdo del siguiente nodo
        }
        ref.right = mem; // Conecta el nodo de referencia al nuevo nodo
        n++; // Incrementa el contador de nodos
    }
}
