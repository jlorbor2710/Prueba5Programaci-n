package actividad3;

import java.util.*;
public class Productos {

	private static final int MAX_PRODUCTOS = 100;
    private static final int STOCK_SEGURIDAD = 50;

    private String[] nombres = new String[MAX_PRODUCTOS];
    private int[] stocks = new int[MAX_PRODUCTOS];
    private double[] precios = new double[MAX_PRODUCTOS];
    private int numProductos = 0;

    public void inicializarInventario(Scanner sc) {
        System.out.print("¿Cuántos productos desea registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        if (cantidad > MAX_PRODUCTOS || cantidad <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }

        for (int i = 0; i < cantidad; i++) {
            if (numProductos >= MAX_PRODUCTOS) {
                System.out.println("Inventario lleno. No se pueden agregar más productos.");
                break;
            }
            System.out.print("Nombre del producto: ");
            nombres[numProductos] = sc.nextLine();
            System.out.print("Stock del producto: ");
            stocks[numProductos] = sc.nextInt();
            System.out.print("Precio del producto: ");
            precios[numProductos] = sc.nextDouble();
            sc.nextLine();
            numProductos++;
        }
    }

    public void agregarProducto(Scanner sc) {
        if (numProductos >= MAX_PRODUCTOS) {
            System.out.println("Inventario lleno. No se pueden agregar más productos.");
            return;
        }

        System.out.print("Nombre del producto: ");
        nombres[numProductos] = sc.nextLine();
        System.out.print("Stock del producto: ");
        stocks[numProductos] = sc.nextInt();
        System.out.print("Precio del producto: ");
        precios[numProductos] = sc.nextDouble();
        sc.nextLine();
        numProductos++;
        System.out.println("Producto agregado correctamente.");
    }

    public void modificarProducto(Scanner sc) {
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < numProductos; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                System.out.print("Nuevo stock: ");
                stocks[i] = sc.nextInt();
                System.out.print("Nuevo precio: ");
                precios[i] = sc.nextDouble();
                sc.nextLine();
                System.out.println("Producto modificado correctamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void eliminarProducto(Scanner sc) {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = sc.nextLine();

        for (int i = 0; i < numProductos; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                for (int j = i; j < numProductos - 1; j++) {
                    nombres[j] = nombres[j + 1];
                    stocks[j] = stocks[j + 1];
                    precios[j] = precios[j + 1];
                }
                nombres[numProductos - 1] = null;
                stocks[numProductos - 1] = 0;
                precios[numProductos - 1] = 0.0;
                numProductos--;
                System.out.println("Producto eliminado correctamente.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public void mostrarValorTotalInventario() {
        double valorTotal = 0.0;

        for (int i = 0; i < numProductos; i++) {
            valorTotal += stocks[i] * precios[i];
        }

        System.out.println("El valor total del inventario es: " + valorTotal);
    }

    public void informeRoturaStock() {
        System.out.println("Productos con stock por debajo del nivel de seguridad:");

        for (int i = 0; i < numProductos; i++) {
            if (stocks[i] < STOCK_SEGURIDAD) {
                System.out.println("- " + nombres[i] + " (Stock: " + stocks[i] + ")");
            }
        }
    }
		
	}
	
	

