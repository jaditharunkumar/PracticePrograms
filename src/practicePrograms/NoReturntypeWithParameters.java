package practicePrograms;

public class NoReturntypeWithParameters {

	void main(String[] args) {
		display1();
		displayName("king");
		displayCity("KBHP");
		displayCourse("Cse");
		displayEmployee("King", "Cse");
		displayProduct("Laptop", "Dell");
		showVehicle("Bike");
		displayMovie("Lion", "Telugu");
		displayCricketer("Virat", "Right-Hand Batsman");
		displayBankAccount("Suriya","Savings");
		display2();
	}

	void displayName(String name) {
		System.out.println("Movie Name: " + name);
	}

	void displayCity(String city) {
		System.out.println("displayCity: " + city);
	}

	void displayCourse(String course) {
		System.out.println("display Course: " + course);
	}

	void displayEmployee(String name, String department) {
		System.out.println("display Name: " + name);
		System.out.println("display department: " + name);

	}

	void displayProduct(String productName, String brand) {

		System.out.println("Product Name: " + productName);
		System.out.println("brand Name: " + brand);

	}

	void showVehicle(String vehicle) {
		System.out.println("Vehicle Name: " + vehicle);
	}

	void  displayMovie(String movieName, String language){
		 System.out.println("Movie Name"+movieName);
		 System.out.println("Language: "+language);
	 }

	void displayCricketer(String name, String battingStyle) {
		System.out.println("Cricketer Name: "+name);
		System.out.println("Batting Style: "+battingStyle);
	}
	
	void displayBankAccount(String name, String accountType) {
		System.out.println("Account HolderName: "+name);
		System.out.println("Account Type: "+accountType);
	}
	
	void display1() {
		System.out.println("Main Method Started!!");
	}
	void display2() {
		System.out.println("Main Method Ended!!");
	}



}
