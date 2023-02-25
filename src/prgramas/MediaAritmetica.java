package prgramas;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc= new Scanner(System.in);
		int suma=0;
		int contador=0;
		int n;
		System.out.println("Introduce numeros hasta -1");
		
		do {
			n = sc.nextInt();
			suma = suma + n;
			contador++;
			System.out.println("la media aritmetica es: " + suma/contador);
		} while (n!=-1);
	}
}
