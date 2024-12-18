package actividad2;

import java.util.*;

public class GestorEntradas {
    private int entradasPrincipal = 1000;
    private int entradasPlatea = 200;
    private int entradasVIP = 25;

    public void mostrarEntradasLibres() {
        System.out.println("Entradas disponibles:");
        System.out.println("Zona Principal: " + entradasPrincipal);
        System.out.println("Zona Platea: " + entradasPlatea);
        System.out.println("Zona VIP: " + entradasVIP);
    }

    public void venderEntradas(Scanner sc) {
        System.out.println("¿Para qué zona desea comprar entradas?");
        System.out.println("1. Zona Principal");
        System.out.println("2. Zona Platea");
        System.out.println("3. Zona VIP");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        System.out.print("¿Cuántas entradas desea comprar? ");
        int cantidad = sc.nextInt();

        switch (opcion) {
            case 1:
                if (cantidad <= entradasPrincipal) {
                    entradasPrincipal -= cantidad;
                    System.out.println("Compra realizada. Entradas restantes en Zona Principal: " + entradasPrincipal);
                } else {
                    System.out.println("No hay suficientes entradas disponibles en la Zona Principal.");
                }
                break;
            case 2:
                if (cantidad <= entradasPlatea) {
                    entradasPlatea -= cantidad;
                    System.out.println("Compra realizada. Entradas restantes en Zona Platea: " + entradasPlatea);
                } else {
                    System.out.println("No hay suficientes entradas disponibles en la Zona Platea.");
                }
                break;
            case 3:
                if (cantidad <= entradasVIP) {
                    entradasVIP -= cantidad;
                    System.out.println("Compra realizada. Entradas restantes en Zona VIP: " + entradasVIP);
                } else {
                    System.out.println("No hay suficientes entradas disponibles en la Zona VIP.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
