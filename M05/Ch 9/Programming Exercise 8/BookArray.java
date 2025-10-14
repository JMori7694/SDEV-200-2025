/* Chapter 9 pg 387
 * Programming Exercise 8 D
 * 
 * Written by: Jei
 * Date: 10/13/2025
 */

import java.util.*;

public class BookArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book books[] = new Book[10];
		int x;

		for (x = 0; x < books.length; ++x) {
			String bookTitle;
			String bookType;

			System.out.print("Please enter a book title >> ");
			bookTitle = input.nextLine();

			System.out.print("Is this a Fiction (F) " +
					"or Non-Fiction (N) book? >> ");
			bookType = input.nextLine();

			if (bookType.equalsIgnoreCase("F")) {
				books[x] = new Fiction(bookTitle);
			} else {
				if (bookType.equalsIgnoreCase("N")) {
					books[x] = new NonFiction(bookTitle);
				} else {
					--x;
				}
			}
		}

		for (x = 0; x < books.length; ++x) {
			System.out.print("\nTitle: " + books[x].getTitle() +
					"\nType: " + books[x].getType() +
					"\nPrice: $" + books[x].getPrice());
			System.out.println();
		}

		input.close();
	}
}
