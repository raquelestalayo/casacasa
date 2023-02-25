package prgramas;

import java.util.Scanner;

public class MayorYMenor {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc= new Scanner(System.in);

		System.out.println("dime numeros, cuando quieras parar pon el 0");
	int n= sc.nextInt();
	int numerMenor=n;
	int numerMayor=n;
	
	while(n!=0) {
	n =sc.nextInt();	
		
		if (n<numerMenor) {
			numerMenor=n;
		} else if (n>numerMayor) {
			numerMayor=n;
		}
	}
	System.out.println("el mayor es: " + numerMayor  );
	System.out.println("el menor es: " + numerMenor);
	}

}
