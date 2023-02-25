package prgramas;

import java.util.Scanner;

public class CambioMoneda {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cantidad que quieres convertir");
		float cantidad = sc.nextFloat();
		System.out.println("A que moneda");
		String moneda =sc.next();
		
		
		cambioMoneda(moneda, cantidad);
		
		System.out.println("su cambio es " + cambioMoneda(moneda, cantidad));
	}

	private static float cambioMoneda(String moneda, float cantidad) {
		float cambio=0;
		
		switch (moneda) {
		case "dolar":
			cambio= (float) (cantidad *1.18);
			break;
		case "libra":
			cambio = (float) (cantidad*0.91);
			break;
		case "yuan":
			cambio = (float) (cantidad *7.89);
			break;
		default:
			System.out.println("compruebe");
			break;
		}
	return cambio;
	}
	

}
