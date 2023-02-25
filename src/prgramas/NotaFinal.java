package prgramas;

import java.util.Scanner;

public class NotaFinal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc = new Scanner(System.in);
		int media;
		
		System.out.println("Introducce la nota de la primera ev.");
		float nota1 =sc.nextFloat();
		System.out.println("Introducce la nota de la segunda ev.");
		float nota2 =sc.nextFloat();
		System.out.println("Introducce la nota de la tercera ev.");
		float nota3 =sc.nextFloat();
		
		media=(int) ((nota1 + nota2 + nota3) /3);
		
		if (media<5) {
			System.out.println("suspenso");
		} else if (media==5) {
			System.out.println("aprobado");
		} if (media==6) {
			System.out.println("bien");
		} else if ((media==7) || (media==8) ) {
			System.out.println("notable");
			if ((media==9) || (media ==10 )) {
				System.out.println("sobresaliente");
			} else {
				System.out.println("error");
			}
		}
	}

}
