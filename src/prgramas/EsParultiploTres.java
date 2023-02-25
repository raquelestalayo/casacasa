package prgramas;

import java.util.Scanner;

public class EsParultiploTres {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Dime un numero");
		int n=sc.nextInt();
		
		if (esParMultiploTres(n)) {
			System.out.println("es par y multiplo de tres");
		} else {
			System.out.println("no es par ni multiplo de tres");
		}
		
		
	}

	private static boolean esParMultiploTres(int n) {
		if ((n%2==0) && (n%3==0)) {
			return true;
	} else {
		return false;
	}


}
}