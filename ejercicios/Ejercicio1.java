package ChatGPTejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		System.out.println("Ingrese un número:");
		numero = sc.nextInt();
		if(numero == 0) {
			System.out.println("El número " + numero + " es par.");
		} else {
			System.out.println("El número " + numero + " es impar.");
		}

	}

}
