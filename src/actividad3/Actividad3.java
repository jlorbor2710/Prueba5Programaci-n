package actividad3;

import java.util.*;

public class Actividad3 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int op;
		Productos[] productos = new Productos[100];
		
		
		
		do {
			System.out.println("1.Introdcuir datos nuevos en el inventario");
			System.out.println("2.Nuevo Producto");
			System.out.println("3.Buscar Producto y elminar información");
			System.out.println("4.Eliminar Productos");
			System.out.println("5.Mostrar valor total del inventario");
			System.out.println("6.Informe rotura de stock.");
			System.out.println("7.Salir");
			op = sc.nextInt();
			switch (op) {
			case 2 -> Productos.NuevoProducto();
			case 6 -> Productos.MostrarProductos();
			case 7 -> System.out.println("Saliendo...");
			
			
			
			default ->
			throw new IllegalArgumentException("Unexpected value: " + op);
			}
			
		} while(op != 7);
		sc.close();
		

	}

}
