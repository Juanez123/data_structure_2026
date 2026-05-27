package com.packages.trees;

import java.util.Scanner;

// Clase que implementa un árbol binario con recorridos y construcción desde consola
public class Trees 
{
    private NodeTree root; // Raíz del árbol
    public static Scanner input = new Scanner(System.in); // Scanner para lectura desde consola

    public Trees()
    {
        root = null; // Inicializa árbol vacío
    }

    public NodeTree getRoot() 
    {
        return root; // Retorna la raíz
    }

    public void setRoot(NodeTree root) 
    {
        this.root = root; // Asigna la raíz del árbol
    }
    
    // Recorrido preorden (raíz - izquierda - derecha)
    public void preorder(NodeTree r)
    {
        if (r != null) {
            System.out.println(r.info);
            preorder(r.left);
            preorder(r.right);
        }
    }

    // Recorrido inorden (izquierda - raíz - derecha)
    public void inorder(NodeTree r)
    {
        if (r != null) {
            inorder(r.left);
            System.out.println(r.info);
            inorder(r.right);
        }
    }

    // Recorrido postorden (izquierda - derecha - raíz)
    public void postorder(NodeTree r)
    {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.println(r.info);
        }
    }

    // Construye el árbol preguntando al usuario por cada nodo (recursivo)
    public void addNode(NodeTree node)
    {
        // node es distinto de null
        String resp;
        NodeTree mem;
        System.out.print("Ingrese un dato para el árbol: ");
        node.info = input.nextInt();
        input.nextLine();
        System.out.print("¿Agregar nodos por la izquierda de " + node.info + ": ");
        resp = input.nextLine().toLowerCase();
        if (resp.equals("s")) {
             mem = new NodeTree();
             node.left = mem; // Crea e enlaza hijo izquierdo
             addNode(node.left); // Continúa construcción en subárbol izquierdo
        } else {
            node.left = null; // No habrá hijo izquierdo
        }

        System.out.print("¿Agregar nodos por la derecha de " + node.info + ": ");
        resp = input.nextLine().toLowerCase();
        if (resp.equals("s")) {
             mem = new NodeTree();
             node.right = mem; // Crea e enlaza hijo derecho
             addNode(node.right); // Continúa construcción en subárbol derecho
        } else {
            node.right = null; // No habrá hijo derecho
        }

    }

}