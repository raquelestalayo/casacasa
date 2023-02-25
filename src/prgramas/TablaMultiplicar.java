package prgramas;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc= new Scanner(System.in);
		int n=0;
		
		while ((n<1) || (n>10)) {
		System.out.println("Introduce un  umero del 1 al 10");
		n =sc.nextInt();
	}
	
	for (int i=0; i<11; i++) {
		System.out.println(n + "x"+ i + "=" + n*i);
	}

}
}
