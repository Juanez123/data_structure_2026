import com.packages.arrays.*; // Importa todas las clases de arrays: Matrix, Vector, Persons, RecordPerson
import com.packages.linked_list.*; // Importa todas las clases de listas enlazadas
import com.packages.queues.*; // Importa la clase Queue
import com.packages.recursivity.*; // Importa la clase Recursion
import com.packages.stacks.*; // Importa la clase Stack
import com.packages.strings.*; // Importa StringChar y ExampleStrings
import java.util.Scanner; // Importa Scanner para lectura de entrada de usuario

public class Main {
    // Scanner global reutilizado en todos los menús para leer entradas desde consola
    public static Scanner input = new Scanner(System.in);

    // Constantes ANSI para dar estilo de color al texto en la terminal
    public static final String CYAN = "\u001B[36m"; // Color cian para títulos principales
    public static final String PURPLE = "\u001B[35m"; // Color púrpura para opciones y solicitudes
    public static final String YELLOW = "\u001B[33m"; // Color amarillo para alertas, errores y salidas
    public static final String RESET = "\u001B[0m"; // Resetea el color al valor por defecto
    public static final String BOLD = "\u001B[1m"; // Texto en negrita
    public static final String WHITE = "\u001B[37m"; // Color blanco para separadores
    public static final String SEPARATOR = WHITE + "--------------------------------------------------" + RESET; // Separador consistente

    // Punto de entrada principal del programa
    public static void main(String[] args) {
        String resp; // Variable para guardar la opción seleccionada por el usuario

        do {
            // Mostrar menú principal con bordes dobles y colores ANSI
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║               MENÚ PRINCIPAL                   ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Salir" + RESET);
            System.out.println(PURPLE + "1. Cadenas de caracteres" + RESET);
            System.out.println(PURPLE + "2. Vectores" + RESET);
            System.out.println(PURPLE + "3. Matrices" + RESET);
            System.out.println(PURPLE + "4. Registros" + RESET);
            System.out.println(PURPLE + "5. Lista Simplemente Ligada" + RESET);
            System.out.println(PURPLE + "6. Lista Simplemente Ligada Circular" + RESET);
            System.out.println(PURPLE + "7. Lista Doblemente Ligada" + RESET);
            System.out.println(PURPLE + "8. Pilas" + RESET);
            System.out.println(PURPLE + "9. Colas" + RESET);
            System.out.println(PURPLE + "10. Recursividad" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del usuario

            switch (resp) {
                case "0":
                    System.out.println(BOLD + YELLOW + "Hasta pronto" + RESET);
                    break;
                case "1":
                    menuString(); // Llama al menú de cadenas de texto
                    break;
                case "2":
                    menuVector(); // Llama al menú de vectores
                    break;
                case "3":
                    menuMatrix(); // Llama al menú de matrices
                    break;
                case "4":
                    menuRecords(); // Llama al menú de registros
                    break;
                case "5":
                    menuLSL(); // Llama al menú de lista simplemente ligada
                    break;
                case "6":
                    menuLSLC(); // Llama al menú de lista simplemente ligada circular
                    break;
                case "7":
                    menuLDL(); // Llama al menú de lista doblemente ligada
                    break;
                case "8":
                    menuStacks(); // Llama al menú de pilas
                    break;
                case "9":
                    menuQueues(); // Llama al menú de colas
                    break;
                case "10":
                    menuRecursivity(); // Llama al menú de recursividad
                    break;
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Repite hasta que el usuario elija salir
    }

    // Menú para operaciones con cadenas de texto
    public static void menuString() {
        String resp; // Opción elegida dentro del submenú de cadenas
        StringChar str = new StringChar(); // Instancia de la clase de operaciones con cadenas

        do {
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║            MENÚ CADENAS DE CARACTERES          ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Regresar" + RESET);
            System.out.println(PURPLE + "1. Ingresar texto" + RESET);
            System.out.println(PURPLE + "2. Mostrar texto" + RESET);
            System.out.println(PURPLE + "3. Longitud texto" + RESET);
            System.out.println(PURPLE + "4. Texto mayúscula" + RESET);
            System.out.println(PURPLE + "5. Texto minúscula" + RESET);
            System.out.println(PURPLE + "6. Palíndromo" + RESET);
            System.out.println(PURPLE + "7. Ejemplos cadenas" + RESET);
            System.out.println(PURPLE + "8. Contar carácter del usuario" + RESET);
            System.out.println(PURPLE + "9. Convertir cadena a ASCII" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del usuario para el submenú

            switch (resp) {
                case "0":
                    break; // Regresa al menú principal
                case "1":
                    System.out.print(PURPLE + "Ingrese un texto: " + RESET);
                    str.setText(input.nextLine()); // Actualiza el texto en la instancia
                    break;
                case "2":
                    System.out.println(WHITE + "Texto ingresado: " + RESET + str.getText());
                    break; // Muestra el texto almacenado
                case "3":
                    System.out.println(WHITE + "Longitud texto: " + RESET + str.lengthString());
                    break; // Muestra la longitud de la cadena
                case "4":
                    System.out.println(WHITE + "Texto en mayúscula: " + RESET + str.upperString());
                    break; // Muestra la cadena en mayúsculas
                case "5":
                    System.out.println(WHITE + "Texto en minúscula: " + RESET + str.lowerString());
                    break; // Muestra la cadena en minúsculas
                case "6":
                    str.palindrome(); // Ejecuta la verificación de palíndromo
                    break;
                case "7":
                    ExampleStrings es = new ExampleStrings(); // Crea instancia que muestra ejemplos
                    break;
                case "8":
                    char charUser; // Carácter que el usuario desea contar
                    System.out.print(PURPLE + "Carácter a contar: " + RESET);
                    charUser = input.next().charAt(0); // Lee el primer carácter ingresado
                    input.nextLine(); // Limpia el salto de línea pendiente
                    System.out.println(WHITE + "El carácter " + RESET + charUser + WHITE + " se encuentra " + RESET + str.countChar(charUser));
                    break;
                case "9":
                    System.out.println(WHITE + "Cadena ASCII: " + RESET + str.stringASCII());
                    break; // Muestra la representación ASCII de la cadena
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Mantiene el submenú hasta que el usuario regresa
    }

    // Menú para operaciones con vectores
    public static void menuVector() {
        String resp; // Opción seleccionada en el submenú de vectores
        int datum, pos; // Variables temporales para datos y posiciones
        Vector v = new Vector(); // Instancia de vector para realizar operaciones

        do {
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║                 MENÚ VECTORES                  ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Regresar" + RESET);
            System.out.println(PURPLE + "1. Agregar dato" + RESET);
            System.out.println(PURPLE + "2. Tamaño" + RESET);
            System.out.println(PURPLE + "3. Mostrar" + RESET);
            System.out.println(PURPLE + "4. Buscar (secuencial)" + RESET);
            System.out.println(PURPLE + "5. Modificar" + RESET);
            System.out.println(PURPLE + "6. Eliminar" + RESET);
            System.out.println(PURPLE + "7. Insertar" + RESET);
            System.out.println(PURPLE + "8. Ordenar (burbuja)" + RESET);
            System.out.println(PURPLE + "9. Suma datos" + RESET);
            System.out.println(PURPLE + "10. Promedio datos" + RESET);
            System.out.println(PURPLE + "11. Mayor dato" + RESET);
            System.out.println(PURPLE + "12. Menor dato" + RESET);
            System.out.println(PURPLE + "13. Varianza" + RESET);
            System.out.println(PURPLE + "14. Desviación" + RESET);
            System.out.println(PURPLE + "15. Intercambio" + RESET);
            System.out.println(PURPLE + "16. Producto punto" + RESET);
            System.out.println(PURPLE + "17. Eliminar ocurrencias" + RESET);
            System.out.println(PURPLE + "18. Verificar orden ascendente" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del submenú de vectores

            switch (resp) {
                case "0":
                    break; // Regresa al menú principal
                case "1":
                    System.out.print(PURPLE + "Dato vector: " + RESET);
                    datum = input.nextInt(); // Lee el dato a agregar
                    input.nextLine(); // Limpia el buffer de entrada
                    if (v.getN() < v.getT()) {
                        v.addVector(datum); // Agrega el dato al vector
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector lleno" + RESET);
                    }
                    break;
                case "2":
                    System.out.println(WHITE + "Tamaño vector: " + RESET + v.getN());
                    break; // Muestra el tamaño actual del vector
                case "3":
                    v.showVector(); // Muestra los datos del vector
                    break;
                case "4":
                    if (v.getN() > 0) {
                        System.out.print(PURPLE + "Dato a buscar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum); // Busca el dato secuencialmente
                        if (pos == -1) {
                            System.out.println(BOLD + YELLOW + datum + " no se encuentra en el vector" + RESET);
                        } else {
                            System.out.println(WHITE + datum + " encontrado en posición " + RESET + pos);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector vacío" + RESET);
                    }
                    break;
                case "5":
                    if (v.getN() > 0) {
                        System.out.print(PURPLE + "Dato a modificar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum); // Localiza el dato a modificar
                        if (pos == -1) {
                            System.out.println(BOLD + YELLOW + datum + " no se encuentra en el vector" + RESET);
                        } else {
                            System.out.print(PURPLE + "Nuevo dato: " + RESET);
                            datum = input.nextInt();
                            input.nextLine();
                            v.updateVector(datum, pos); // Actualiza el valor en la posición encontrada
                            System.out.println(WHITE + "Dato actualizado correctamente" + RESET);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector vacío" + RESET);
                    }
                    break;
                case "6":
                    if (v.getN() > 0) {
                        System.out.print(PURPLE + "Dato a eliminar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum);
                        if (pos == -1) {
                            System.out.println(BOLD + YELLOW + datum + " no se encuentra en el vector" + RESET);
                        } else {
                            v.deleteVector(pos); // Elimina el dato en la posición indicada
                            System.out.println(WHITE + "Dato eliminado correctamente" + RESET);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector vacío" + RESET);
                    }
                    break;
                case "7":
                    if (v.getN() < v.getT()) {
                        System.out.print(PURPLE + "Dato referencia: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        pos = v.searchSecuencial(datum);
                        if (pos == -1) {
                            System.out.println(BOLD + YELLOW + datum + " no se encuentra en el vector" + RESET);
                        } else {
                            System.out.print(PURPLE + "Dato a insertar: " + RESET);
                            datum = input.nextInt();
                            input.nextLine();
                            v.insertVector(pos, datum); // Inserta el dato antes de la posición encontrada
                            System.out.println(WHITE + "Dato insertado correctamente" + RESET);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector lleno" + RESET);
                    }
                    break;
                case "8":
                    if (v.getN() > 0) {
                        v.sortBubble(); // Ordena el vector con burbuja
                        System.out.println(WHITE + "Vector ordenado correctamente" + RESET);
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector vacío" + RESET);
                    }
                    break;
                case "9":
                    if (v.getN() > 0) {
                        System.out.println(WHITE + "Suma datos vector: " + RESET + v.sumVector());
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector vacío" + RESET);
                    }
                    break;
                case "10":
                    if (v.getN() > 0) {
                        System.out.println(WHITE + "Promedio datos vector: " + RESET + v.avgVector());
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector vacío" + RESET);
                    }
                    break;
                case "11":
                    if (v.getN() > 0) {
                        System.out.println(WHITE + "Mayor dato vector: " + RESET + v.maxVector());
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector vacío" + RESET);
                    }
                    break;
                case "12":
                    if (v.getN() > 0) {
                        System.out.println(WHITE + "Menor dato vector: " + RESET + v.minVector());
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector vacío" + RESET);
                    }
                    break;
                case "13":
                    if (v.getN() > 1) {
                        System.out.println(WHITE + "Varianza: " + RESET + v.variance());
                    } else {
                        System.out.println(BOLD + YELLOW + "No hay datos suficientes" + RESET);
                    }
                    break;
                case "14":
                    if (v.getN() > 1) {
                        System.out.println(WHITE + "Desviación estándar: " + RESET + v.desviation());
                    } else {
                        System.out.println(BOLD + YELLOW + "No hay datos suficientes" + RESET);
                    }
                    break;
                case "15":
                    if (v.getN() > 0) {
                        v.interchange(); // Intercambia los elementos extremos del vector
                        System.out.println(WHITE + "Se intercambiaron los datos del vector" + RESET);
                    } else {
                        System.out.println(BOLD + YELLOW + "No hay datos" + RESET);
                    }
                    break;
                case "16":
                    int[] v1 = {2, 5, -6}; // Vector temporal de prueba
                    int[] v2 = {1, 8, 4}; // Segundo vector temporal
                    System.out.println(WHITE + "Producto punto: " + RESET + v.productPoint(v1, v2, 3));
                    break;
                case "17":
                    if (v.getN() > 0) {
                        v.deleteOcurrencies(); // Elimina ocurrencias duplicadas
                        v.showVector();
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector vacío" + RESET);
                    }
                    break;
                case "18":
                    if (v.getN() > 0) {
                        if (v.sortAsc()) {
                            System.out.println(WHITE + "Vector ordenado ascendentemente" + RESET);
                        } else {
                            System.out.println(BOLD + YELLOW + "El vector no está ordenado ascendentemente" + RESET);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "Vector vacío" + RESET);
                    }
                    break;
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Repite el submenú de vectores
    }

    // Menú para operaciones con matrices
    public static void menuMatrix() {
        String resp; // Opción seleccionada por el usuario
        int rows, cols; // Dimensiones de la matriz
        Matrix matrix = new Matrix(); // Matriz principal
        Matrix matrix2 = new Matrix(); // Matriz secundaria usada en la suma
        rows = 0; // Inicializa filas en cero
        cols = 0; // Inicializa columnas en cero

        do {
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║                 MENÚ MATRICES                  ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Regresar" + RESET);
            System.out.println(PURPLE + "1. Crear matriz" + RESET);
            System.out.println(PURPLE + "2. Tamaño (orden)" + RESET);
            System.out.println(PURPLE + "3. Mostrar" + RESET);
            System.out.println(PURPLE + "4. Suma matrices" + RESET);
            System.out.println(PURPLE + "5. Diagonal principal" + RESET);
            System.out.println(PURPLE + "6. Diagonal secundaria" + RESET);
            System.out.println(PURPLE + "7. Triángulo arriba" + RESET);
            System.out.println(PURPLE + "8. Triángulo izquierdo" + RESET);
            System.out.println(PURPLE + "9. Triángulo derecho" + RESET);
            System.out.println(PURPLE + "10. Triangular inferior" + RESET);
            System.out.println(PURPLE + "11. Triangular inferior secundaria" + RESET);
            System.out.println(PURPLE + "12. Mayor dato por fila" + RESET);
            System.out.println(PURPLE + "13. Promedio por columna" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del submenú de matrices

            switch (resp) {
                case "0":
                    break; // Regresa al menú principal
                case "1":
                    System.out.print(PURPLE + "Número filas: " + RESET);
                    rows = input.nextInt();
                    input.nextLine();
                    System.out.print(PURPLE + "Número columnas: " + RESET);
                    cols = input.nextInt();
                    input.nextLine();
                    if (rows > 0 && rows <= 50 && cols > 0 && cols <= 50) {
                        matrix.setM(rows); // Configura filas en la matriz
                        matrix.setN(cols); // Configura columnas en la matriz
                        matrix.createMatrix(); // Rellena la matriz con valores aleatorios
                        System.out.println(WHITE + "Matriz creada correctamente" + RESET);
                    } else {
                        System.out.println(BOLD + YELLOW + "Tamaño no válido para la matriz" + RESET);
                    }
                    break;
                case "2":
                    System.out.println(WHITE + "Tamaño matriz: " + RESET + matrix.getM() + " x " + matrix.getN());
                    break; // Muestra el orden de la matriz
                case "3":
                    matrix.showMatrix(matrix.getMat()); // Imprime la matriz actual
                    break;
                case "4":
                    matrix2.setM(rows); // Configura segunda matriz con las mismas dimensiones
                    matrix2.setN(cols);
                    matrix2.createMatrix(); // Rellena segunda matriz
                    matrix.sumMatrix(matrix.getMat(), matrix2.getMat()); // Realiza la suma de matrices
                    matrix.showMatrix(matrix.getMat()); // Muestra primera matriz
                    System.out.println();
                    matrix2.showMatrix(matrix2.getMat()); // Muestra segunda matriz
                    System.out.println();
                    matrix.showMatrix(matrix.getMatSum()); // Muestra la matriz resultante
                    break;
                case "5":
                    if (matrix.getM() == matrix.getN() && matrix.getM() > 1) {
                        matrix.mainDiagonal(); // Muestra diagonal principal
                    } else {
                        System.out.println(BOLD + YELLOW + "La matriz debe ser cuadrada" + RESET);
                    }
                    break;
                case "6":
                    if (matrix.getM() == matrix.getN() && matrix.getM() > 1) {
                        matrix.secondaryDiagonal(); // Muestra diagonal secundaria
                    } else {
                        System.out.println(BOLD + YELLOW + "La matriz debe ser cuadrada" + RESET);
                    }
                    break;
                case "7":
                    if (matrix.getM() > 1 && matrix.getN() > 1) {
                        matrix.upTriangle(); // Muestra la parte superior triangular
                    } else {
                        System.out.println(BOLD + YELLOW + "La matriz debe ser cuadrada" + RESET);
                    }
                    break;
                case "8":
                    if (matrix.getM() > 1 && matrix.getN() > 1) {
                        matrix.leftTriangle(); // Muestra la parte izquierda triangular
                    } else {
                        System.out.println(BOLD + YELLOW + "La matriz debe ser cuadrada" + RESET);
                    }
                    break;
                case "9":
                    if (matrix.getM() > 1 && matrix.getN() > 1) {
                        matrix.rightTriangle(); // Muestra la parte derecha triangular
                    } else {
                        System.out.println(BOLD + YELLOW + "La matriz debe ser cuadrada" + RESET);
                    }
                    break;
                case "10":
                    System.out.println(BOLD + YELLOW + "Opción no implementada: triangular inferior" + RESET);
                    break;
                case "11":
                    System.out.println(BOLD + YELLOW + "Opción no implementada: triangular inferior secundaria" + RESET);
                    break;
                case "12":
                    System.out.println(BOLD + YELLOW + "Opción no implementada: mayor por fila" + RESET);
                    break;
                case "13":
                    System.out.println(BOLD + YELLOW + "Opción no implementada: promedio por columna" + RESET);
                    break;
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Mantiene el menú de matrices activo
    }

    // Menú para operaciones con registros de personas
    public static void menuRecords() {
        String name, resp; // Nombre y opción seleccionada
        byte age; // Edad registrada
        Persons per = new Persons(); // Instancia de la clase de personas

        do {
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║                  MENÚ REGISTROS                 ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Regresar" + RESET);
            System.out.println(PURPLE + "1. Agregar dato" + RESET);
            System.out.println(PURPLE + "2. Tamaño" + RESET);
            System.out.println(PURPLE + "3. Mostrar" + RESET);
            System.out.println(PURPLE + "4. Persona joven" + RESET);
            System.out.println(PURPLE + "5. Porcentaje mayores" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del menú de registros

            switch (resp) {
                case "0":
                    break; // Regresa al menú principal
                case "1":
                    System.out.print(PURPLE + "Nombre: " + RESET);
                    name = input.nextLine(); // Lee nombre
                    System.out.print(PURPLE + "Edad: " + RESET);
                    age = input.nextByte(); // Lee edad como byte
                    input.nextLine(); // Limpia salto de línea
                    per.createPerson(name, age); // Agrega persona al registro
                    break;
                case "2":
                    System.out.println(WHITE + "Tamaño lista: " + RESET + per.countPeople());
                    break; // Muestra cantidad de personas
                case "3":
                    per.showPerson(); // Imprime todas las personas
                    break;
                case "4":
                    per.youngPerson(); // Muestra la persona más joven
                    break;
                case "5":
                    System.out.println(WHITE + "Porcentaje mayores de edad: " + RESET + per.percentageMax18());
                    break; // Muestra el porcentaje de mayores de edad
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Repite el menú de registros
    }

    // Menú para lista simplemente ligada (LSL)
    public static void menuLSL() {
        int datum; // Dato numérico para operaciones en la lista
        String resp; // Opción elegida en el menú
        LSL list = new LSL(); // Instancia de lista simplemente ligada
        LSL.Node r; // Nodo utilizado para buscar y modificar

        do {
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║                    MENÚ LSL                    ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Regresar" + RESET);
            System.out.println(PURPLE + "1. Agregar dato" + RESET);
            System.out.println(PURPLE + "2. Tamaño" + RESET);
            System.out.println(PURPLE + "3. Mostrar" + RESET);
            System.out.println(PURPLE + "4. Suma" + RESET);
            System.out.println(PURPLE + "5. Promedio" + RESET);
            System.out.println(PURPLE + "6. Buscar" + RESET);
            System.out.println(PURPLE + "7. Modificar" + RESET);
            System.out.println(PURPLE + "8. Eliminar" + RESET);
            System.out.println(PURPLE + "9. Insertar (antes de referencia)" + RESET);
            System.out.println(PURPLE + "10. Mostrar LSL recursiva" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del menú LSL

            switch (resp) {
                case "0":
                    break; // Regresa al menú principal
                case "1":
                    System.out.print(PURPLE + "Nuevo dato: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    list.createBeginLSL(datum); // Inserta dato al inicio
                    System.out.println(WHITE + "Dato agregado en la LSL" + RESET);
                    break;
                case "2":
                    System.out.println(WHITE + "Tamaño lista: " + RESET + list.countNodesLSL() + " nodos");
                    break; // Muestra cantidad de nodos
                case "3":
                    list.showLSL(); // Muestra la lista completa
                    break;
                case "4":
                    System.out.println(WHITE + "Suma lista: " + RESET + list.sumNodesLSL());
                    break; // Muestra la suma de los nodos
                case "5":
                    if (list.head != null) {
                        System.out.println(WHITE + "Promedio lista: " + RESET + list.sumNodesLSL() / list.countNodesLSL());
                    } else {
                        System.out.println(BOLD + YELLOW + "Lista vacía" + RESET);
                    }
                    break;
                case "6":
                    if (list.head != null) {
                        System.out.print(PURPLE + "Dato a buscar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        r = list.findLSL(datum); // Busca el nodo con el dato indicado
                        if (r == null) {
                            System.out.println(BOLD + YELLOW + datum + " no se encuentra en la LSL" + RESET);
                        } else {
                            System.out.println(WHITE + datum + " encontrado en dirección " + RESET + r);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la LSL" + RESET);
                    }
                    break;
                case "7":
                    if (list.head != null) {
                        System.out.print(PURPLE + "Dato a modificar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        r = list.findLSL(datum);
                        if (r == null) {
                            System.out.println(BOLD + YELLOW + datum + " no se encuentra en la LSL" + RESET);
                        } else {
                            System.out.print(PURPLE + "Nuevo dato: " + RESET);
                            datum = input.nextInt();
                            input.nextLine();
                            list.updateNode(r, datum); // Actualiza el nodo en la posición encontrada
                            System.out.println(WHITE + "Se actualizó el dato correctamente" + RESET);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la LSL" + RESET);
                    }
                    break;
                case "8":
                    if (list.head != null) {
                        System.out.print(PURPLE + "Dato a eliminar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        list.deleteNodeLSL(datum); // Elimina el nodo con el dato indicado
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la LSL" + RESET);
                    }
                    break;
                case "9":
                    if (list.head != null) {
                        System.out.print(PURPLE + "Dato de referencia: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        LSL.Node dirRef = list.findReferenceLSL(datum); // Busca el nodo de referencia
                        if (dirRef != null) {
                            System.out.print(PURPLE + "Dato a insertar: " + RESET);
                            datum = input.nextInt();
                            input.nextLine();
                            list.insertBeforeLSL(dirRef, datum); // Inserta antes del nodo de referencia
                            System.out.println(WHITE + datum + " se insertó correctamente" + RESET);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la LSL" + RESET);
                    }
                    break;
                case "10":
                    list.displayLSLRecursivity(list.head); // Muestra la lista usando recursividad
                    break;
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Repite el menú LSL hasta regresar
    }

    // Menú para la lista simplemente ligada circular (LSLC)
    public static void menuLSLC() {
        int datum; // Dato numérico ingresado por el usuario
        String resp; // Opción del submenú
        LSLC list = new LSLC(); // Instancia de LSLC circular
        Node r; // Nodo general usado en el menú

        do {
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║                   MENÚ LSLC                    ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Regresar" + RESET);
            System.out.println(PURPLE + "1. Agregar dato" + RESET);
            System.out.println(PURPLE + "2. Tamaño" + RESET);
            System.out.println(PURPLE + "3. Mostrar" + RESET);
            System.out.println(PURPLE + "4. Buscar" + RESET);
            System.out.println(PURPLE + "5. Modificar" + RESET);
            System.out.println(PURPLE + "6. Eliminar" + RESET);
            System.out.println(PURPLE + "7. Insertar (antes de referencia)" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del menú LSLC

            switch (resp) {
                case "0":
                    break;
                case "1":
                    System.out.print(PURPLE + "Nuevo dato: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    list.createEndLSLC(datum); // Agrega dato al final de la cola circular
                    System.out.println(WHITE + "Dato agregado en la LSLC" + RESET);
                    break;
                case "3":
                    list.showLSLC(); // Muestra la lista circular
                    break;
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Continúa hasta regresar
    }

    // Menú para lista doblemente ligada (LDL)
    public static void menuLDL() {
        int datum; // Dato ingresado por el usuario
        String resp; // Opción del submenú
        LDL ldl = new LDL(); // Instancia de la lista doblemente ligada
        NodeLDL dir; // Nodo para búsquedas y operaciones

        do {
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║                   MENÚ LDL                     ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Regresar" + RESET);
            System.out.println(PURPLE + "1. Agregar dato" + RESET);
            System.out.println(PURPLE + "2. Tamaño" + RESET);
            System.out.println(PURPLE + "3. Mostrar" + RESET);
            System.out.println(PURPLE + "4. Buscar" + RESET);
            System.out.println(PURPLE + "5. Modificar" + RESET);
            System.out.println(PURPLE + "6. Eliminar" + RESET);
            System.out.println(PURPLE + "7. Insertar (después de referencia)" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del menú LDL

            switch (resp) {
                case "0":
                    break;
                case "1":
                    System.out.print(PURPLE + "Nuevo dato: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    ldl.createBeginLDL(datum); // Inserta dato al inicio de la LDL
                    System.out.println(WHITE + "Dato agregado en la LDL" + RESET);
                    break;
                case "2":
                    System.out.println(WHITE + "Tamaño lista: " + RESET + ldl.getN() + " nodos");
                    break; // Muestra cantidad de nodos en la LDL
                case "3":
                    ldl.showLDL(); // Muestra la lista doblemente ligada
                    break;
                case "4":
                    if (ldl.head != null) {
                        System.out.print(PURPLE + "Dato a buscar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        dir = ldl.findLDL(datum); // Busca el nodo con el dato ingresado
                        if (dir == null) {
                            System.out.println(BOLD + YELLOW + datum + " no se encuentra en la LDL" + RESET);
                        } else {
                            System.out.println(WHITE + datum + " encontrado en dirección " + RESET + dir);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la LDL" + RESET);
                    }
                    break;
                case "5":
                    if (ldl.head != null) {
                        System.out.print(PURPLE + "Dato a modificar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        dir = ldl.findLDL(datum);
                        if (dir != null) {
                            System.out.print(PURPLE + "Nuevo dato: " + RESET);
                            datum = input.nextInt();
                            input.nextLine();
                            ldl.updateNodeLDL(dir, datum); // Actualiza el nodo encontrado
                            System.out.println(WHITE + "Dato actualizado correctamente" + RESET);
                        } else {
                            System.out.println(BOLD + YELLOW + datum + " no se encuentra en la LDL" + RESET);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la LDL" + RESET);
                    }
                    break;
                case "6":
                    if (ldl.head != null) {
                        System.out.print(PURPLE + "Dato a eliminar: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        dir = ldl.findLDL(datum);
                        if (dir != null) {
                            ldl.deleteNodeLDL(dir); // Elimina el nodo encontrado
                            System.out.println(WHITE + "Dato eliminado correctamente" + RESET);
                        } else {
                            System.out.println(BOLD + YELLOW + datum + " no se encuentra en la LDL" + RESET);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la LDL" + RESET);
                    }
                    break;
                case "7":
                    if (ldl.head != null) {
                        System.out.print(PURPLE + "Dato referencia: " + RESET);
                        datum = input.nextInt();
                        input.nextLine();
                        dir = ldl.findLDL(datum);
                        if (dir != null) {
                            System.out.print(PURPLE + "Dato a insertar: " + RESET);
                            datum = input.nextInt();
                            input.nextLine();
                            ldl.insertAfterLDL(dir, datum); // Inserta después del nodo de referencia
                            System.out.println(WHITE + "Dato insertado correctamente" + RESET);
                        } else {
                            System.out.println(BOLD + YELLOW + "El dato de referencia " + datum + " no se encuentra en la LDL" + RESET);
                        }
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la LDL" + RESET);
                    }
                    break;
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Mantiene el menú LDL hasta regresar
    }

    // Menú para operaciones con pilas
    public static void menuStacks() {
        int datum; // Dato a apilar o desapilar
        String resp; // Opción del menú
        Stack objStack = new Stack(); // Instancia de pila

        do {
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║                   MENÚ PILAS                   ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Regresar" + RESET);
            System.out.println(PURPLE + "1. Apilar" + RESET);
            System.out.println(PURPLE + "2. Tamaño" + RESET);
            System.out.println(PURPLE + "3. Mostrar" + RESET);
            System.out.println(PURPLE + "4. Desapilar" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del menú de pilas

            switch (resp) {
                case "0":
                    break;
                case "1":
                    System.out.print(PURPLE + "Dato a apilar: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    objStack.stacking(datum); // Agrega dato a la pila
                    System.out.println(WHITE + "Dato almacenado en la Pila" + RESET);
                    break;
                case "2":
                    System.out.println(WHITE + "Tamaño pila: " + RESET + objStack.getTop());
                    break;
                case "3":
                    if (objStack.getTop() > 0) {
                        objStack.showStack(); // Muestra el contenido de la pila
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la Pila" + RESET);
                    }
                    break;
                case "4":
                    if (objStack.getTop() > 0) {
                        System.out.println(WHITE + objStack.unStacking() + " se desapiló correctamente" + RESET);
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la Pila" + RESET);
                    }
                    break;
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Permite repetir el menú de pilas
    }

    // Menú para operaciones con colas
    public static void menuQueues() {
        int datum; // Dato a encolar o desencolar
        String resp; // Opción del usuario
        Queue objQueue = new Queue(); // Instancia de cola

        do {
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║                   MENÚ COLAS                   ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Regresar" + RESET);
            System.out.println(PURPLE + "1. Encolar" + RESET);
            System.out.println(PURPLE + "2. Tamaño" + RESET);
            System.out.println(PURPLE + "3. Mostrar" + RESET);
            System.out.println(PURPLE + "4. Desencolar" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del menú de colas

            switch (resp) {
                case "0":
                    break;
                case "1":
                    System.out.print(PURPLE + "Dato a encolar: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    objQueue.addQueue(datum); // Agrega dato a la cola
                    System.out.println(WHITE + "Dato almacenado en la Cola" + RESET);
                    break;
                case "2":
                    System.out.println(WHITE + "Tamaño Cola: " + RESET + objQueue.getEnd());
                    break;
                case "3":
                    if (objQueue.getEnd() > 0) {
                        objQueue.displayQueue(); // Muestra contenido de la cola
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la Cola" + RESET);
                    }
                    break;
                case "4":
                    if (objQueue.getEnd() > 0) {
                        System.out.println(WHITE + objQueue.popQueue() + " se desencoló correctamente" + RESET);
                    } else {
                        System.out.println(BOLD + YELLOW + "No ha creado la Cola" + RESET);
                    }
                    break;
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Repite el menú de colas
    }

    // Menú para opciones de recursividad
    public static void menuRecursivity() {
        int datum; // Número utilizado en operaciones recursivas
        String resp; // Opción seleccionada

        do {
            System.out.println(BOLD + CYAN + "╔════════════════════════════════════════════════╗" + RESET);
            System.out.println(BOLD + CYAN + "║                MENÚ RECURSIVIDAD               ║" + RESET);
            System.out.println(BOLD + CYAN + "╚════════════════════════════════════════════════╝" + RESET);
            System.out.println(PURPLE + "0. Regresar" + RESET);
            System.out.println(PURPLE + "1. Factorial" + RESET);
            System.out.println(PURPLE + "2. Imprimir primeros números naturales Desc" + RESET);
            System.out.println(PURPLE + "3. Imprimir primeros números naturales Asc" + RESET);
            System.out.println(PURPLE + "4. Fibonacci Iterativo" + RESET);
            System.out.println(PURPLE + "5. Fibonacci Recursivo" + RESET);
            System.out.println(PURPLE + "6. Suma cuadrados" + RESET);
            System.out.print(PURPLE + "Ingrese su opción: " + RESET);
            resp = input.nextLine(); // Lee la opción del menú de recursividad

            switch (resp) {
                case "0":
                    break;
                case "1":
                    System.out.print(PURPLE + "Ingrese n: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    System.out.println(WHITE + datum + "! = " + RESET + Recursion.factorial(datum));
                    break;
                case "2":
                    System.out.print(PURPLE + "Ingrese n: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    Recursion.displayNaturalNumbersDesc(datum); // Muestra números descendentes
                    break;
                case "3":
                    System.out.print(PURPLE + "Ingrese n: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    Recursion.displayNaturalNumbersAsc(datum, 1); // Muestra números ascendentes
                    break;
                case "4":
                    System.out.print(PURPLE + "Ingrese n: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    Recursion.FibonacciIterative(datum); // Muestra Fibonacci iterativo
                    break;
                case "5":
                    System.out.print(PURPLE + "Ingrese n: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    for (int j = 1; j <= datum; j++) {
                        System.out.println(Recursion.FibonacciRecursive(j)); // Calcula Fibonacci recursivo
                    }
                    break;
                case "6":
                    System.out.print(PURPLE + "Ingrese n: " + RESET);
                    datum = input.nextInt();
                    input.nextLine();
                    System.out.println(WHITE + "Suma cuadrados: " + RESET + Recursion.sumSquare(datum));
                    break;
                default:
                    System.out.println(BOLD + YELLOW + "Opción no válida" + RESET);
                    break;
            }
        } while (!resp.equals("0")); // Repite el menú de recursividad
    }
}
