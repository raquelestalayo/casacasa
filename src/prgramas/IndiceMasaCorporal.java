package prgramas;

import java.util.Scanner;

public class IndiceMasaCorporal {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc= new Scanner(System.in);
		float IMC;
		
		System.out.println("Introduce tu peso en kg");
		float peso =sc.nextFloat();
		System.out.println("Introcuce tu altura en m");
		float altura =sc.nextFloat();
		
		IMC=peso/(altura*altura);
		
		if (IMC<20) {
			System.out.println("Peso insuficente");
		}  else if ((IMC>=20) && (IMC<25)) {
			System.out.println("Peso normal");
		} 		 if ((IMC>= 25) && (IMC<30)) {
			System.out.println("Sobrepeso");
		}			 else if (IMC>30) {
			System.out.println("Obesidad");
		}
	}

}
