package practicePrograms;

import java.util.Scanner;

public class Cricketer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cricketer C1 = new Cricketer();
		
		System.out.println("Enter Name: ");
		System.out.println("Enter JerseyNumber: ");
		System.out.println("Enter Gender: ");
		System.out.println("Enter Age: ");
		System.out.println("Enter Height: ");
		System.out.println("Enter Number Of Matches: ");
		System.out.println("Enter Batting Style: ");
		System.out.println("Enter Batting Average: ");
		System.out.println("Enter Captain Status: ");
		System.out.println("Enter Earning Amount: ");
		
		
		
		String name =sc.next();	
		byte num =sc.nextByte();
		char num1 = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		short matches = sc.nextShort();
		sc.nextLine();
		String style = sc.nextLine();
		float avg = sc.nextFloat();
		boolean status = sc.nextBoolean();
		long amount = sc.nextLong();
		C1.cricketerName(name);
		C1.jerseyNumber(num);
		C1.gender(num1);
		C1.age(age);
		C1.height(height);
		C1.numberOfMatches(num);
		C1.battingStyle(style);
		C1.battingAvg(avg);
		C1.captain(status);
		C1.earningAmount(amount);
		
		
		
		

	}
	
	void cricketerName(String name) {
		System.out.println("Cricketer Name: "+name);
	}
	void jerseyNumber(byte num) {
		System.out.println("Jersey No: "+num);
	}
	void gender(char num) {
		System.out.println("Gender: "+num);
	}
	
	void age(int age) {
		System.out.println("Age: "+age);
	}
	void height(double height){
		System.out.println("Heigt: "+height);
	}
	void numberOfMatches(short num) {
		System.out.println("Matches: "+num);
	}
	void battingStyle(String Style) {
		System.out.println("Batting Style: "+Style);	
	}
	void battingAvg(float avg) {
		System.out.println("Batting Average: "+avg);
	}
	void captain(boolean captain) {
		if (captain) {
			System.out.println("Captain Status: Yes");
		} else {
			System.out.println("Captain Status: No");
		}
		
	}
	void earningAmount(long amount) {
		System.out.println("Career Total Earning Amount: "+amount);
	}

}
