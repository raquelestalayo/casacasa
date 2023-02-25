package prgramas;

import java.util.Scanner;

public class Multiplos3 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc= new Scanner(System.in);
		int suma = 0;
		int i;
		
		System.out.println("Introduce un numero");
		int n = sc.nextInt();
		
		for (i=1; i<=n; i++) {
			suma= suma +(i*3);
		}
		System.out.println(suma);
	}

}
