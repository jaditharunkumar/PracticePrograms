package practicePrograms;

public class Movie {
	
	int movieId;
	String movieName;
	String heroName;
	int availableSeats;
	
	static String theaterName = "Arjun";
	static String managerName = "Sanjay-sai";
	
	void displayMovieDetails() {
		
		System.out.println("******MovieDetails********");
		System.out.println("MovieID: " +movieId);
		System.out.println("MovieName: " +movieName);
		System.out.println("HeroName: " +heroName);
		System.out.println("AvailableSeats: " +availableSeats);
		
	}
	
	void bookSeat(int numberOfSeats) {
		if(numberOfSeats <= availableSeats) {
			numberOfSeats = availableSeats-numberOfSeats;
		}else {
			System.out.println("Seats Not Available");
		}
			
	}
	void displaytheaterDetails() {
		System.out.println("TheaterName: "+theaterName);
		System.out.println("ManagerName: "+managerName);
	}
	
	void changeManager(String newmanagerName) {
		
		managerName = newmanagerName;
				
	}
	
	

	public static void main(String[] args) {
		
		Movie M1 = new Movie();
		
		M1.movieId = 101;
		M1.movieName = "Irumudi";
		M1.heroName = "Raviteja";
		M1.availableSeats= 100;
		M1.displayMovieDetails();
		M1.displaytheaterDetails();
		
		
		
		
		Movie M2 = new Movie();
		
		M2.movieId = 102;
		M2.movieName = "Varshyam";
		M2.heroName = "Prabhas";
		M2.availableSeats= 100;
		M2.displayMovieDetails();
		M2.displaytheaterDetails();
		
		M1.changeManager("Tharun");
		M1.movieId = 101;
		M1.movieName = "Irumudi";
		M1.heroName = "Raviteja";
		M1.availableSeats= 100;
		M1.displayMovieDetails();
		M1.displaytheaterDetails();
		
		
		// TODO Auto-generated method stub

	}

}
