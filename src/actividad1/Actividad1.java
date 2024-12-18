package actividad1;

import java.util.*;

public class Actividad1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int count = 0;
		String palabralarga = "";
		String palabracorta = "";
		System.out.println("Introduce una frase");
		String frase = sc.nextLine().trim();
		
		for (int  i = 0;i < frase.length();i++) {		
			if (Character.isWhitespace(frase.charAt(i))) {
				count++;
			}
		}
		
		
		int palabras = count + 1;
		
		System.out.println("La frase tiene " + palabras + " palabras ");
		System.out.println("La palabra mas larga es: " + palabralarga);
		System.out.println("La palabra mas corta es: " + palabracorta);
		
		sc.close(); 
		}
	}



