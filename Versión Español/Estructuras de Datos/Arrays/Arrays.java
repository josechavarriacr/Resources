package arrays;

/**
 * @author Jose Chavarría
 * @license MIT
 * @link https://chavarria.cr/post/arrays
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    static int[] num = new int[5];

    static void Insercion() {
        System.out.println("Inserción...");
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 10;
            System.out.println(num[i] = i + 10);
        }
    }

    static void Recorrido() {
        System.out.println("\nRecorrido...");
        for (int i = 0; i < num.length; i++) {
            System.out.println("índice: " + i + " elemento: " + num[i]);
        }
    }

    static void Buscar(int var) {
        System.out.println("\nBúsqueda: " + var);
        for (int i = 0; i < num.length; i++) {
            if (num[i] == var) {
                System.out.println("índice: " + i + " elemento: " + num[i]);
            }
        }
    }

    static void Actualizar(int pasado, int nuevo) {
        System.out.println("\nActualizar: " + pasado + " por " + nuevo);
        for (int i = 0; i < num.length; i++) {
            if (num[i] == pasado) {
                num[i] = nuevo;
                System.out.println("índice: " + i + " elemento: " + num[i]);
            }
        }
    }

    static void Eliminar(int var) {
        System.out.println("\nEliminación: " + var);
        int[] temp = new int[4];
        int contador = 0, aux = 0;

        while (contador < num.length) {
            if (num[contador] != var) {
                temp[aux] = num[contador];
                aux++;
            }
            contador++;
        }
        num = temp;
    }

    public static void main(String[] args) {
        Insercion();
        Recorrido();
        Buscar(10);
        Actualizar(10, 100);
        Eliminar(100);
        Recorrido();
    }
}
