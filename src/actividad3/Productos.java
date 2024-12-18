package actividad3;

import java.util.*;
public class Productos {

		static String nombreProducto;
		static int stockProducto;
		static int precioProducto;
	
	public Productos(String nombreProducto, int stockProducto, int precioProducto) {
		this.nombreProducto = nombreProducto;
		this.stockProducto = stockProducto;
		this.precioProducto = precioProducto;
	}
	
	public Productos(String nombreProducto, int precioProducto) {
		this.nombreProducto = nombreProducto;
		this.stockProducto = 50;
		this.precioProducto = precioProducto;
	}
	
	public static void MostrarProductos() {
		if (stockProducto < 50) {
			System.out.println(nombreProducto + " " + stockProducto);
		}
	}
	public static void NuevoProducto() {
		var sc = new Scanner(System.in);
		System.out.println("Introduce el nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduce el stock");
		int stock = sc.nextInt();
		System.out.println("Introduce el precio por unidad");
		int precio = sc.nextInt();
		sc.close();
		
	}
	
	
}
