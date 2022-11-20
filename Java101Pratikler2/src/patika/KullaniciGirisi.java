package patika;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {

		String userName, currentPass, oldPass = "java101", newPass;
		int selection;
		Scanner input = new Scanner(System.in);

		System.out.print("Kullanici Adinizi Giriniz : ");
		userName = input.nextLine();

		System.out.print("Sifrenizi Giriniz : ");
		currentPass = input.nextLine();

		if (userName.equals("patika") && currentPass.equals(oldPass)) {
			System.out.print("Giris Basarili");

		}

		else if (userName.equals("patika") && !currentPass.equals(oldPass)) {
			System.out.println("Sifreyi Hatali Girdiniz Degistirmek Ister misiniz ?\n1-Evet\n2-Hayir");
			selection = input.nextInt();
			if (selection == 1) {
				System.out.println("Lutfen Yeni Sifrenizi Yaziniz");
				newPass = input.next();

				if (!newPass.equals(currentPass) && !newPass.equals(oldPass)) {
					System.out.println("Sifre Olusturuldu");

				} else {
					System.out.println("Sifre Olusturulamadi");
					System.out.println("Hata : Yeni Sifreniz Hatali Girdiginiz Sifre ve Eski Sifre Ile Ayni Olamaz");

				}
			} else {
				System.out.println("Sifre Degistirilmedi");

			}

		} else
			System.out.println("Hatali Kullanici Adi veya Sifre");

	}
}
