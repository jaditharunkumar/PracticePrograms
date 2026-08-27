package practicePrograms;

import java.util.Scanner;

public class LibraryBookDetails {

	int bookid;
	String bookName;
	String authorName;
	int availableCopies;

	static String libraryName;
	static String librarianName;

	static int count = 1;

	void displayBookDetails() {

		// System.out.println("*********BookDetails" + count + "**********");
		System.out.println("Book Id : " + bookid);
		System.out.println("BookName : " + bookName);
		System.out.println("AuthorName : " + authorName);
		System.out.println("AvailableCopies : " + availableCopies);
		count++;
	}

	//int numberOfBooks = 0;
	void issueBook(int numberOfBooks) {
		if ( numberOfBooks>0 && numberOfBooks <= availableCopies) {

			availableCopies = availableCopies - numberOfBooks;
		} else {
			System.out.println("Not enough books available!");

		}
	}

	// static int count = 1;
	void displayLibraryDetails() {
		System.out.println("*************LibraryDetails***************");
		System.out.println("LibraryName : " + libraryName);
		System.out.println("LibrarianName : " + librarianName);

	}

	void changeLibrarian(String newLibrariean) {
		librarianName = newLibrariean;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Book ID:");
		int bookid = sc.nextInt();
		// int userBookId = sc.nextInt();

		LibraryBookDetails b1 = new LibraryBookDetails();
		LibraryBookDetails b2 = new LibraryBookDetails();

		b1.bookid = 101;
		b1.bookName = "Java";
		b1.authorName = "Srikanth";
		b1.availableCopies = 10;

		b2.bookid = 102;
		b2.bookName = "SQL";
		b2.authorName = "Vishwa";
		b2.availableCopies = 10;

		libraryName = "V-cube";
		librarianName = "Srikanth";
		//while (true) {
			if (bookid == b1.bookid) {
				b1.displayBookDetails();
				b1.displayLibraryDetails();
			} else if (bookid == b2.bookid) {
				b2.displayBookDetails();
				b2.displayLibraryDetails();
			} else {
				System.out.println("Book ID Not Found!!");
				//break;
			System.exit(0);
			}

			System.out.println("Enter number of books:");

			int numberOfBooks = sc.nextInt();
			if (numberOfBooks <= b1.availableCopies) {
				b1.issueBook(numberOfBooks);
				b1.displayBookDetails();
			} else if (numberOfBooks <= b2.availableCopies) {
				b2.issueBook(numberOfBooks);
				b2.displayBookDetails();
			} else {
				System.out.println("Not enough books available!");
			}

			
			LibraryBookDetails.librarianName = "Vishwa";
			
			b1.displayLibraryDetails();

		}

	}

