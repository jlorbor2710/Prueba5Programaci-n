package actividad2;

import java.util.*;

public class Actividad2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        GestorEntradas gestor = new GestorEntradas();
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    gestor.mostrarEntradasLibres();
                    break;
                case 2:
                    gestor.venderEntradas(sc);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n--Menú de entradas--");
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }
	}


