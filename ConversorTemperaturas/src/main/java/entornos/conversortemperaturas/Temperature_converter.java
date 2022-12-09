package entornos.conversortemperaturas;

import java.util.Scanner;
public class Temperature_converter {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\nBienvenido al conversor de temperaturas\n");
	System.out.print("Introduce el valor que quieres introducir : ");
	float value = scan.nextFloat();
	System.out.println("  Introduce 1 para convertir Celsius a Fahrenheit....");
	System.out.println("  Introduce 2 para convertir Fahrenheit a Celsius....");
	System.out.print("\nEnter your value here...   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.print("La conversion es.. "+value1+"�F");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("La conversion es.. "+value3+"�C");
		}
	System.out.println("\n\tGracias!!..");
	}
}
