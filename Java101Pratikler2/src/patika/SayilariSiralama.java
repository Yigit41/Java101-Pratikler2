package patika;

import java.util.Scanner;

public class SayilariSiralama {

	public static void main(String[] args) {

		// sorting numbers without using array sort

		int firstNum, secondNum, thirdNum;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter The First Number : ");
		firstNum = input.nextInt();
		System.out.print("Enter The Second Number : ");
		secondNum = input.nextInt();
		System.out.print("Enter The Third Number : ");
		thirdNum = input.nextInt();

		if (firstNum > secondNum && firstNum > thirdNum) 
		{

			if (secondNum > thirdNum)
			{
				System.out.print(thirdNum + " < " + secondNum + " < " + firstNum);
			} else
				System.out.print(secondNum + " < " + thirdNum + " < " + firstNum);
		}
		else if (secondNum > firstNum && secondNum > thirdNum) 
		{

			if (firstNum > thirdNum) 
			{
				System.out.print(thirdNum + " < " + firstNum + " < " + secondNum);
			} else
				System.out.print(firstNum + " < " + thirdNum + " < " + secondNum);
		} 
		else if (thirdNum > firstNum && thirdNum > secondNum) 
		{

			if (firstNum > secondNum)
			{
				System.out.print(secondNum + " < " + firstNum + " < " + thirdNum);
			} else
				System.out.print(firstNum + " < " + secondNum + " < " + thirdNum);
		}
	}

}
