package patika;

import java.util.Scanner;

public class SinifiGecmeDurumu {
	public static void main(String[] args) {

		int math = 0, physics = 0, chemical = 0, turkish = 0, music = 0, sayac = 0;
		double averageGrade, totalGrade = 0;

		int[] grade = { math, physics, chemical, turkish, music };
		String[] lessons = { "Mathematics", "Physics", "Chemical", "Turkish", "Music" };

		Scanner input = new Scanner(System.in);

		while (sayac < 5) {

			System.out.print("Please Enter Your " + lessons[sayac] + " Grade :");
			grade[sayac] = input.nextInt();

			if (0 > grade[sayac] || grade[sayac] > 100) {
				System.out.println("Please Enter 0-100");

			} else {
				totalGrade += grade[sayac];
				sayac++;
			}

		}

		averageGrade = totalGrade / 5;
		System.out.println("Your Grade Average : " + averageGrade);
		if (averageGrade >= 55) {

			System.out.println("Congratulations You passed the class");
		} else
			System.out.println("You failed the class");

	}

}
