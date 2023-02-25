package prgramas;

import java.util.Scanner;

public class IntercambiarVariables {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		System.out.println("Introdcuce dos números");
		Scanner sc= new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2 = sc.nextInt();
		
		int aux;
		aux= n1;
		n1= n2;
		n2= aux;
	
		System.out.println("El valor del primer número es: " + n1 + " y el valor del es: " + n2);
	
		
	}

}
