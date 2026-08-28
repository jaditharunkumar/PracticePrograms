package practicePrograms;

public class NoReturntypeNoParameters {

	void CalculateSimpleInterest() {
		int Priniciple = 10000;
		int Rate = 5;
		int Time = 2;

		int Simple_intrest = Priniciple * Rate * Time;
		System.out.println("Simple intrest " + Simple_intrest);

	}

	void DisplayStudentDetails() {
		String name = "Tharun";
		int age = 23;
		String course = "JavaFullStack";

		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Student  Course: " + course);
	}

	void CheckEvenOrOdd() {
		int a = 10;
		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

	void CheckPositiveOrNegative() {
		int a = 50;
		if (a > 0) {
			System.out.println("Positive");
		} else if (a < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}

	}

	void displayWelcomeMessage() {
		System.out.println("Main Method Started!!");
	}

	void showMenu() {
		int Idly = 50;
		int Dosa = 55;
		int Biryani = 500;
		int FriedRice = 90;
		int Parotta = 100;
		int Meals = 90;

		System.out
				.println("1. Idly\n" + "2. Dosa\n" + "3. Biryani\n" + "4. Fried Rice\n" + "5. Parotta\n" + "6. Meals");

		System.out.println("Total Bill= " + (Idly + Dosa));
	}

	void displayMobileDetails() {
		System.out.println("Print brand = Lava\n" + "Model = Agni 2 5G\n" + "Storage = 256GB\n" + "RAM = 8GB");
	}

	void showAvailableVehicles() {
		String v1 = "Car";
		String v2 = "Bike";
		String v3 = "Auto";
		System.out.println("Available Vehicles: \n" + v1 + "\n" + v2 + "\n" + v3);

	}

	void displayCollegeName() {
		String collegename = "Vcube";
		System.out.println("Collage Name: " + collegename);
	}

	void displayDepartment() {
		String department = "Cse";
		System.out.println("Department Name: " + department);
	}

	void displayCollegelocation() {
		String location = "KBHP";
		System.out.println("College Location: " + location);

	}

	void showLoginMessage() {

		System.out.println("Login: Login successfu");
	}

	void showOrderStatus() {
		System.out.println("Status: Your order has been confirmed");
	}

	void showRideStatus() {
		System.out.println("Status: Driver is on the way");
	}

	void displayMovieDetails() {
		System.out.println("*******DisplaycMoviecDetails*******");

	}
	
	void MovieName() {
		System.out.println("Movie Name: Vishwanath & sons");
	}
	
	void MovieHeroName() {
		System.out.println("Movie Hero_Name: Suriya");
	}
	
	void MovieHeroinName() {
		System.out.println("Movie Heroin_Name: Mamitha");
	}
	void MovieDirectorName() {
		System.out.println("Movie Director_Name: Venky Atluri");
	}
	
	void MovieRating() {
		System.out.println("Movie Rating: 2.7/5");
	}




	void main(String[] args) {
		displayWelcomeMessage();
		CalculateSimpleInterest();
		DisplayStudentDetails();
		CheckEvenOrOdd();
		CheckPositiveOrNegative();
		showMenu();
		displayMobileDetails();
		showAvailableVehicles();
		displayCollegeName();
		displayDepartment();
		displayCollegelocation();
		showLoginMessage();
		showOrderStatus();
		showRideStatus();
		displayMovieDetails();
		MovieName();
		MovieHeroName();
		MovieHeroinName();
		MovieDirectorName();
		MovieRating();

	}

}
