package patika;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		double n1,n2;
		int select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ilk Sayiyi Giriniz : ");
		n1 = input.nextInt();
		
		System.out.print("Ikinci Sayiyi Giriniz : ");
		n2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-Cikartma\n3-Carpma\n4-Bolme");
		System.out.print("Seciminiz : ");
		select = input.nextInt();
		
		switch(select) {
			case 1 :
				System.out.print("Toplama Sonucu : "+(n1+n2));
				break;
			case 2 :
				System.out.print("Cikartma Sonucu : "+(n1-n2));
				break;
			case 3 :
				System.out.print("Carpma Sonucu : "+(n1*n2));
				break;
			case 4 :
				if(n2!=0) {
					System.out.print("Bolme Sonucu : "+(n1/n2));
				}
				else
					System.out.print("0'a Bolum Belirsizlik");
				break;
			default :
				System.out.print("Lutfen Belirtilen Aralikta Secim Yapiniz");
				break;
		}
		
	}
}
