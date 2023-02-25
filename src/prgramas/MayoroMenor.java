package prgramas;

import java.util.Scanner;

public class MayoroMenor {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		
		System.out.println("Introducce un número");
		Scanner cs= new Scanner(System.in);
		int a = cs.nextInt();
		System.out.println("Introdcuce otro número para comprobar cual es mayor");
		int b =cs.nextInt();
		
		if (a<b) {
			System.out.println(b+ " es mayor que " + a);
		} if (b<a) {
			System.out.println(a+ " es mayor que " + b);
		} else {
			System.out.println(a + " es igual que " + b);
		}
		
		
		
	}

}
