package prgramas;

import java.util.Scanner;

public class DescuentoPrecio {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		float precioFinal;
		
		System.out.println("Introduce el precio del producto");
		Scanner sc= new Scanner(System.in);
		float precio = sc.nextFloat();
		System.out.println("Introduce el descuento a aplicar");
		int descuento= sc.nextInt();
		
		precioFinal = ((100-descuento)/100)*precio;
		
		System.out.println("El precio final es: " + precioFinal);
	}

}
