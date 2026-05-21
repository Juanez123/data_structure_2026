package com.packages.arrays;

// Clase que representa un vector (arreglo dinámico sobre un arreglo fijo) y operaciones comunes
public class Vector {
    private final int T = 100; // Capacidad máxima del vector
    private int n; // Tamaño actual utilizado del vector
    private int vec[] = new int[T]; // Arreglo interno donde se guardan los elementos

    public Vector() {
        n = 0; // Inicializa el vector vacío
    }

    public int getT() {
        return T; // Retorna la capacidad máxima del vector
    }

    public int getN() {
        return n; // Retorna el número actual de elementos
    }

    public void setN(int n) {
        this.n = n; // Permite establecer manualmente el tamaño usado
    }

    public int[] getVec() {
        return vec; // Retorna el arreglo interno del vector
    }

    public void setVec(int[] vec) {
        this.vec = vec; // Reemplaza el arreglo interno del vector
    }

    public void addVector(int datum) {
        vec[n] = datum; // Inserta el dato en la posición final
        n++; // Aumenta el tamaño actual
    }

    public void showVector() {
        for (int i = 0; i < n; i++) {
            System.out.print(vec[i] + " | "); // Imprime cada elemento separado por barra
        }
    }

    public int searchSecuencial(int datum) {
        int i, pos;
        i = 0; // Índice inicial para la búsqueda
        pos = -1; // Posición de retorno si no se encuentra el dato
        while (i < n && pos == -1) { // Recorrido hasta encontrar o terminar el vector
            if (vec[i] == datum) {
                pos = i; // Guarda la posición cuando encuentra el dato
            } else {
                i++; // Avanza al siguiente elemento
            }
        }
        return pos; // Retorna la posición o -1 si no existe
    }

    public void updateVector(int datum, int pos) {
        vec[pos] = datum; // Actualiza el elemento en la posición indicada
    }

    public void deleteVector(int pos) {
        for (int i = pos; i < n - 1; i++) {
            vec[i] = vec[i + 1]; // Desplaza los elementos hacia la izquierda
        }
        n--; // Reduce el tamaño efectivo
    }

    public void insertVector(int pos, int datum) {
        for (int i = n; i > pos; i--) {
            vec[i] = vec[i - 1]; // Desplaza los elementos hacia la derecha
        }
        vec[pos] = datum; // Inserta el dato en la posición deseada
        n++; // Aumenta el tamaño efectivo
    }

    public void sortBubble() {
        int aux; // Variable temporal para intercambio
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (vec[i] > vec[j]) {
                    aux = vec[i];
                    vec[i] = vec[j];
                    vec[j] = aux; // Intercambia elementos fuera de orden
                }
            }
        }
    }

    public int sumVector() {
        int s = 0; // Acumulador de la suma
        for (int i = 0; i < n; i++) {
            s = s + vec[i]; // Suma elemento por elemento
        }
        return s; // Retorna la suma total
    }

    public int productVector() {
        int p = 1; // Acumulador del producto
        for (int i = 0; i < n; i++) {
            p = p * vec[i]; // Multiplica elemento por elemento
        }
        return p; // Retorna el producto total
    }

    public double avgVector() {
        return (double) sumVector() / n; // Calcula el promedio
    }

    public int maxVector() {
        int i, m;
        m = vec[0]; // Inicializa el mayor con el primer elemento
        for (i = 1; i < n; i++) {
            if (vec[i] > m) {
                m = vec[i]; // Actualiza el mayor si se encuentra uno más grande
            }
        }
        return m; // Retorna el mayor elemento
    }

    public int minVector() {
        int i, m;
        m = vec[0]; // Inicializa el menor con el primer elemento
        for (i = 1; i < n; i++) {
            if (vec[i] < m) {
                m = vec[i]; // Actualiza el menor si se encuentra uno más pequeño
            }
        }
        return m; // Retorna el menor elemento
    }

    public int totalOddPositionEven() {
        int i, c;
        c = 0; // Contador de elementos impares en posiciones pares
        for (i = 0; i < n; i += 2) {
            if (vec[i] % 2 == 1) {
                c++; // Incrementa el contador cuando el elemento es impar
            }
        }
        return c; // Retorna el total contado
    }

    public double variance() {
        double s = 0; // Acumulador de la suma de cuadrados de la diferencia
        double mean = avgVector(); // Promedio del vector
        for (int i = 0; i < n; i++) {
            s = s + Math.pow(vec[i] - mean, 2); // Agrega el cuadrado de la diferencia
        }
        return s / (n - 1); // Calcula la varianza muestral
    }

    public double desviation() {
        return Math.sqrt(variance()); // Retorna la raíz cuadrada de la varianza
    }

    public void interchange() {
        int aux; // Variable temporal para intercambio
        for (int i = 0; i < n / 2; i++) {
            aux = vec[i];
            vec[i] = vec[n - i - 1];
            vec[n - i - 1] = aux; // Intercambia el elemento actual con su opuesto
        }
    }

    public int productPoint(int[] v1, int[] v2, int size) {
        int product = 0; // Acumulador del producto punto
        for (int i = 0; i < size; i++) {
            product += v1[i] * v2[i]; // Suma producto de pares correspondientes
        }
        return product; // Retorna el resultado del producto punto
    }

    public void deleteOcurrencies() {
        if (n <= 1) {
            return; // Si el vector tiene 0 o 1 elemento, no hay duplicados a eliminar
        }
        int uniqueCount = 0; // Contador de valores únicos conservados
        for (int i = 0; i < n; i++) {
            boolean found = false; // Indica si el valor ya apareció antes
            for (int j = 0; j < uniqueCount; j++) {
                if (vec[i] == vec[j]) {
                    found = true; // Encuentra una ocurrencia previa
                    break;
                }
            }
            if (!found) {
                vec[uniqueCount++] = vec[i]; // Conserva el valor único
            }
        }
        n = uniqueCount; // Actualiza el tamaño a la cantidad de valores únicos
    }

    public boolean sortAsc() {
        for (int i = 0; i < n - 1; i++) {
            if (vec[i] > vec[i + 1]) {
                return false; // Encuentra un par fuera de orden
            }
        }
        return true; // El vector está ordenado ascendentemente
    }
}
