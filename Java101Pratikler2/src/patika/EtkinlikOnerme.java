package patika;

import java.util.Scanner;

public class EtkinlikOnerme {

	public static void main(String[] args) {

		int heat;
		Scanner input = new Scanner(System.in);

		System.out.print("Please Enter The Temperature :");
		heat = input.nextInt();
		System.out.println("Temperature : " + heat);
		if (heat <= 5) {
			System.out.print("You can go skiing");
		} else if (heat > 5 && heat <= 15) {
			System.out.print("You can have a picnic");
		} else if (heat > 15 && heat <= 25) {
			System.out.print("You can go to the cinema");
		} else if (heat > 25) {
			System.out.print("You can go swimming");
		}
	}

}
