package JavaBasics;

import java.util.Scanner;

public class celius_to_fahrenhiet {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner celcius = new Scanner(System.in);
		System.out.println("Enter the temperature = ");
		double c = celcius.nextInt();
		double f;
		f=(c*1.8)+32;System.out.println("The temperature in fahrenheit = "+f);
	
		
	}
}
