package actividad3;

import java.util.*;

public class Actividad3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Productos gestor = new Productos();
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    gestor.inicializarInventario(sc);
                    break;
                case 2:
                    gestor.agregarProducto(sc);
                    break;
                case 3:
                    gestor.modificarProducto(sc);
                    break;
                case 4:
                    gestor.eliminarProducto(sc);
                    break;
                case 5:
                    gestor.mostrarValorTotalInventario();
                    break;
                case 6:
                    gestor.informeRoturaStock();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n--Menú Inventario--");
        System.out.println("1. Introducir datos nuevo inventario.");
        System.out.println("2. Nuevo producto.");
        System.out.println("3. Buscar producto y modificar información.");
        System.out.println("4. Eliminar producto.");
        System.out.println("5. Mostrar valor total del inventario.");
        System.out.println("6. Informe rotura de stock.");
        System.out.println("7. Salir.");
        System.out.print("Seleccione una opción: ");
    }

}
