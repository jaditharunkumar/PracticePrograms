package practicePrograms;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		int count;
		System.out.println("Enter count of number: ");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		int number, sum = 0;
		for (int i = 0; i < count; i++) {
			number = sc.nextInt();
			sum = sum + number;
		}

		System.out.println("sum of all these numbers: " + sum);

	}

}
