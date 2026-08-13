package practicePrograms;

import java.util.Scanner;

//#1 - Java Program to find Sum of two Numbers Entered by user
public class JavaTestClass {

	public static void main(String[] args) {
		int num1, num2;
		System.out.println("Enter first number: ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		System.out.println("sum of two numbers: " + (num1 + num2));
	}

}
