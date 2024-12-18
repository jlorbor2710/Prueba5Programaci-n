package actividad1;

import java.util.*;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        int numPalabras = palabras.length;
        
        int maxLong = 0;
        int minLong = Integer.MAX_VALUE;
        String maxPalabra = "";
        String minPalabra = "";
        
        for (String p : palabras) {
            int longPalabra = p.length();
            if (longPalabra > maxLong) {
                maxLong = longPalabra;
                maxPalabra = p;
            }
            if (longPalabra < minLong) {
                minLong = longPalabra;
                minPalabra = p;
            }
        }
        
        System.out.println("La frase contiene " + numPalabras + " palabras.");
        System.out.println("Palabra de mayor longitud: " + maxPalabra + " con " + maxLong + " caracteres.");
        System.out.println("Palabra de menor longitud: " + minPalabra + " con " + minLong + " caracteres.");
        
        sc.close();
		}
	}



