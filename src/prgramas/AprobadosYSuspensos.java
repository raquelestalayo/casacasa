package prgramas;

import java.util.Scanner;

public class AprobadosYSuspensos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		
	
		
		int aprobados;
		int total;
		int suspensos;

		
		System.out.println("Introduce el número de alumnos que han aprobado");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("Introduce el número de alumnos que han suspendido");
		int s=sc.nextInt();
		
		total = a + s;
		
		aprobados = (a/total) *100;
		suspensos = (s/total) *100;
		
		System.out.println("Han aprobado un " + aprobados + "% de la clase");
		System.out.println("Han suspendido un " + suspensos + "% de la clase");
	
	}

}