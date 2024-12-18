package actividad2;

import java.util.*;

public class Actividad2 {
	
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int entradaZonaPrincipal = 1000;
		int entradaZonaPlatea = 200;
		int entradaZonaVip = 25;
		int entradaTotal = entradaZonaPrincipal + entradaZonaPlatea + entradaZonaVip;
		int op;
		
	
		do {
			System.out.println("1:Mostrar el numero de entradas libres");
			System.out.println("2:Vender entradas");
			System.out.println("3:Salir");
			op = sc.nextInt();
			switch (op) {
			case 1:
				entradaTotal = entradaZonaPrincipal + entradaZonaPlatea + entradaZonaVip;
				System.out.println("El numero de entradas totales es: " + entradaTotal);
				System.out.println("El numero de entradas de la zona principal es: " + entradaZonaPrincipal);
				System.out.println("El numero de entradas de la zona platea es: " + entradaZonaPlatea);
				System.out.println("El numero de entradas de la zona vip es: " + entradaZonaVip);
				break;
			case 2:
				System.out.println("En que zona quieres comprar las entradas");
				System.out.println("1.Zona Principal");
				System.out.println("2.Zona Platea");
				System.out.println("3.Zona Vip");
				int op2 = sc.nextInt();
				switch (op2) {
				case 1:
					if (entradaZonaPrincipal <= 0) {
						System.out.println("Entradas no disponible");
					}
					else {
						System.out.println("Elige el nuemro de entradas que quieres comprar");
						int entradaComprar = sc.nextInt();
						if (entradaComprar > entradaZonaPrincipal) {
							System.out.println("Entradas no disponibles");
						}
						else {
							entradaZonaPrincipal = entradaZonaPrincipal - entradaComprar;
						}
					}
					break;
				case 2:
					if (entradaZonaPlatea <= 0) {
						System.out.println("Entradas no disponible");
					}
					else {
						System.out.println("Elige el nuemro de entradas que quieres comprar");
						int entradaComprar = sc.nextInt();
						if (entradaComprar > entradaZonaPlatea) {
							System.out.println("Entradas no disponibles");
						}
						else {
							entradaZonaPlatea = entradaZonaPlatea - entradaComprar;
						}
						
					}
					break;
				case 3:
					if (entradaZonaVip <= 0) {
						System.out.println("Entradas no disponible");
					}
					else {
						System.out.println("Elige el nuemro de entradas que quieres comprar");
						int entradaComprar = sc.nextInt();
						if (entradaComprar > entradaZonaVip) {
							System.out.println("Entradas no disponibles");
						}
						else {
							entradaZonaVip = entradaZonaVip - entradaComprar;
						}

					}
					break;

				default:
					break;
				}
			case 3:
				System.out.println("Saliendo...");
				
			default:
				break;
			}
		} while (op != 3);
		
		sc.close();
	}

}
