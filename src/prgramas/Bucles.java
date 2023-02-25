package prgramas;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.BUCLE FOR");
		System.out.println("2.BUCLE WHILE");
		System.out.println("3.BUCLE DO_WHILE");
		System.out.println("4.SALIR");
		
		System.out.println("Elige una opción");
		int respuesta =sc.nextInt();
		
		while (respuesta!=4) {
			switch (respuesta) {
				case(1):
					buclefor();
				case(2):
					buclewhile();
				case(3):
					bucledowhile();
				default:
					System.out.println("Error"); 
			}
		}
	
		
	}


	private static void bucledowhile() {
		Scanner sc= new Scanner(System.in);
		int n;
		do {
		System.out.println("Introduce números para hacer la media aritmetica, cuando quieras parar pon -1");
		n =sc.nextInt();
		} while (n!=-1); 
			int a=0;a++;
			int media;
			media=n/a;
		System.out.println(media);
	}


	public static void buclewhile() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre= sc.next();
		System.out.println("Introduce tu apellido");
		String apellido= sc.next();
		System.out.println(apellido.toUpperCase());
		
	}

	public static void buclefor() {
		Scanner sc= new Scanner(System.in);
		for(int i=0; i==10; i++) {
		System.out.println("Introduce diez números");
		int n = sc.nextInt();
			if (n <0 ) {
				int ng=0;ng++;
				System.out.println("negativos: "+  ng);
			} else if (n>0) {
				int p=0;p++;
				System.out.println("positivos: " + p);
			} else {
				int c=0;c++;
				System.out.println("ceros: " + c);
			}
	}
}
		}
