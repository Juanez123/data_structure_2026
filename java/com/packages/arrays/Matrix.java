package com.packages.arrays;

// Clase para operaciones básicas con matrices estáticas (tamaño máximo TR x TC)
public class Matrix {
    private final int TR = 50; // Capacidad máxima de filas
    private final int TC = 50; // Capacidad máxima de columnas

    private int m, n; // Dimensiones actuales efectivas de la matriz

    private int mat[][] = new int[TR][TC]; // Matriz principal para datos
    private int matSum[][] = new int[TR][TC]; // Matriz que almacena el resultado de sumas

    public Matrix() {
        m = 0; // Inicializa filas en 0
        n = 0; // Inicializa columnas en 0
    }

    public int getTR() {
        return TR; // Retorna la capacidad máxima de filas
    }

    public int getTC() {
        return TC; // Retorna la capacidad máxima de columnas
    }

    public int getM() {
        return m; // Retorna el número actual de filas utilizadas
    }

    public void setM(int m) {
        this.m = m; // Actualiza el número de filas efectivas
    }

    public int getN() {
        return n; // Retorna el número actual de columnas utilizadas
    }

    public void setN(int n) {
        this.n = n; // Actualiza el número de columnas efectivas
    }

    public int[][] getMat() {
        return mat; // Retorna la referencia a la matriz principal
    }

    public int[][] getMatSum() {
        return matSum; // Retorna la matriz de suma calculada
    }

    public void createMatrix() {
        for (int i = 0; i < m; i++) { // Recorre cada fila efectiva
            for (int j = 0; j < n; j++) { // Recorre cada columna efectiva
                mat[i][j] = (int) (Math.random() * 100); // Asigna un valor aleatorio
            }
        }
    }

    public void showMatrix(int[][] mat) {
        for (int i = 0; i < m; i++) { // Recorre filas efectivas
            for (int j = 0; j < n; j++) { // Recorre columnas efectivas
                System.out.print(mat[i][j] + "\t"); // Imprime cada elemento separado por tabulación
            }
            System.out.println(""); // Salto de línea al final de cada fila
        }
    }

    public void sumMatrix(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < m; i++) { // Recorre filas
            for (int j = 0; j < n; j++) { // Recorre columnas
                matSum[i][j] = mat1[i][j] + mat2[i][j]; // Suma elemento a elemento
            }
        }
    }

    public void mainDiagonal() {
        for (int i = 0; i < n; i++) { // Recorre los índices de la diagonal principal
            System.out.print(mat[i][i] + "\t"); // Imprime elemento [i][i]
        }
        System.out.println(); // Salto de línea final
    }

    public void secondaryDiagonal() {
        for (int i = 0; i < n; i++) { // Recorre índices de la diagonal secundaria
            System.out.print(mat[i][n - i - 1] + "\t"); // Imprime elemento de la diagonal secundaria
        }
        System.out.println(); // Salto de línea final
    }

    public void upTriangle() {
        for (int i = 0; i < m; i++) { // Recorre filas
            for (int j = 0; j < n; j++) { // Recorre columnas
                if (j >= i) { // Si la columna está en o sobre la diagonal principal
                    System.out.print(mat[i][j] + "\t");
                } else {
                    System.out.print("\t"); // Espacio vacío para mantener la forma matricial
                }
            }
            System.out.println(); // Salto de línea al final de la fila
        }
    }

    public void rightTriangle() {
        for (int i = 0; i < m; i++) { // Recorre filas
            for (int j = 0; j < n; j++) { // Recorre columnas
                if (j >= (n - 1 - i)) { // Si el elemento pertenece a la parte derecha
                    System.out.print(mat[i][j] + "\t");
                } else {
                    System.out.print("\t"); // Espacio vacío fuera del triángulo derecho
                }
            }
            System.out.println();
        }
    }

    public void leftTriangle() {
        for (int i = 0; i < m; i++) { // Recorre filas
            for (int j = 0; j < n; j++) { // Recorre columnas
                if (j <= i) { // Si el elemento pertenece a la parte izquierda
                    System.out.print(mat[i][j] + "\t");
                } else {
                    System.out.print("\t"); // Espacio vacío fuera del triángulo izquierdo
                }
            }
            System.out.println();
        }
    }
}
