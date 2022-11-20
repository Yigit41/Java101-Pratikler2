package patika;

import java.util.Scanner;

public class BurcBulma {

	public static void main(String[] args) {

		int month, day;
		String horoscope = "Error";
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please Enter The Month You Were Born : ");
		month = input.nextInt();
		System.out.println("Please Enter The Day You Were Born : ");
		day = input.nextInt();
		if (month <= 12 && month > 0) 
		{
			findHoroscope(month, day, horoscope);
		} 
		else
		{
			horoscopeError();
		}

	}

	public static void findHoroscope(int month, int day, String horoscope) {
	
		if (month == 1) {
			if (day > 0 && day <= 31) {
				if (day <= 21) {
					horoscope = "Capricorn";
				} else
					horoscope = "Aquaris";
			} else
				horoscopeError();
		} else if (month == 2) {
			if (day > 0 && day <= 28) {
				if (day <= 19) {
					horoscope = "Aquaris";
				} else
					horoscope = "Pisces";
			} else
				horoscopeError();
		} else if (month == 3) {
			if (day > 0 && day <= 31) {
				if (day <= 20) {
					horoscope = "Pisces";
				} else
					horoscope = "Aries";
			} else
				horoscopeError();

		} else if (month == 4) {
			if (day > 0 && day <= 30) {
				if (day <= 20) {
					horoscope = "Aries";
				} else
					horoscope = "Taurus";
			} else
				horoscopeError();
		} else if (month == 5) {
			if (day > 0 && day <= 31) {
				if (day <= 21) {
					horoscope = "Taurus";
				} else
					horoscope = "Gemini";
			} else
				horoscopeError();
		} else if (month == 6) {
			if (day > 0 && day <= 30) {
				if (day <= 22) {
					horoscope = "Gemini";
				} else
					horoscope = "Cancer";
			} else
				horoscopeError();
		} else if (month == 7) {
			if (day > 0 && day <= 31) {
				if (day <= 22) {
					horoscope = "Cancer";
				} else
					horoscope = "Leo";
			} else
				horoscopeError();
			;
		} else if (month == 8) {
			if (day > 0 && day <= 31) {
				if (day <= 22) {
					horoscope = "Leo";
				} else
					horoscope = "Virgo";
			} else
				horoscopeError();
		} else if (month == 9) {
			if (day > 0 && day <= 30) {
				if (day <= 22) {
					horoscope = "Virgo";
				} else
					horoscope = "Libra";
			} else
				horoscopeError();

		} else if (month == 10) {
			if (day > 0 && day <= 31) {
				if (day <= 20) {
					horoscope = "Libra";
				} else
					horoscope = "Scorpio";
			} else
				horoscopeError();
		} else if (month == 11) {
			if (day > 0 && day <= 30) {
				if (day <= 20) {
					horoscope = "Scorpio";
				} else
					horoscope = "Sagittarius";
			} else
				horoscopeError();
		} else if (month == 12) {
			if (day > 0 && day <= 31) {
				if (day <= 20) {
					horoscope = "Sagittarius";
				} else
					horoscope = "Capricorn";
			} else
				horoscopeError();
		}
		
           System.out.print("Your Zodiac Sign : " + horoscope);
		
		
	}

	public static String horoscopeError() {
		System.out.print("Incorrect Entry ");
		return "Hata";
	}
}
