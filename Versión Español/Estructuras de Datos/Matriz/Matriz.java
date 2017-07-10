package arrays;

/**
 * @author Jose Chavarría
 * @license MIT
 * @link https://chavarria.cr/post/array-bidimensional
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    static Integer[][] num = new Integer[6][6];

    static void Insercion() {
        System.out.println("Insercion...");
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.println(num[i][j] = count++);
            }
        }
    }

    static void Recorrido() {
        System.out.println("\nRecorrido...");
        for (Integer[] aux : num) {
            for (Integer i : aux) {
                System.out.print(i + "\t");
            }
            System.out.println("\n");
        }
    }

    static void Busqueda(int var) {
        System.out.println("\nBusqueda: " + var);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i][j] == var) {
                    System.out.println("fila: " + i + " columna: " + j);
                }
            }
        }
    }

    static void Actualizar(int past, int var) {
        System.out.println("\nActualizar: " + past + " a " + var);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i][j] == past) {
                    num[i][j] = var;
                    System.out.println("fila: " + i + " columna: " + j);
                }
            }
        }
    }

    static void Eliminar(int var) {
        System.out.println("\nEliminar: " + var);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i][j] == var) {
                    num[i][j] = null;
                    System.out.println("fila: " + i + " columna: " + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Insercion();
        Recorrido();
        Busqueda(10);
        Actualizar(10, 100);
        Recorrido();
        Eliminar(100);
        Recorrido();
    }
}
