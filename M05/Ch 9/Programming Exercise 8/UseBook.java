/* Chapter 9 pg 387
 * Programming Exercise 8 C
 * 
 * Written by: Jei
 * Date: 10/13/2025
 */

import java.util.*;

public class UseBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String bookTitle;

		// Sets bookTitle value for Fiction
		System.out.print("Please enter the title of a Fiction book >> ");
		bookTitle = input.nextLine();
		Fiction fBook = new Fiction(bookTitle);

		// Sets bookTitle value for Non-Fiction
		System.out.print("Please enter the title of a Non-Fiction book >> ");
		bookTitle = input.nextLine();
		NonFiction nBook = new NonFiction(bookTitle);

		// Prints Fiction book information
		System.out.println("Book Type: Fiction");
		System.out.println("Book Title: " + fBook.getTitle());
		System.out.println("Book Price: " + fBook.getPrice());

		// Prints Non-Fiction book information
		System.out.println("Book Type: Non-Fiction");
		System.out.println("Book Title: " + nBook.getTitle());
		System.out.println("Book Price: " + nBook.getPrice());

		input.close();
	}
}
