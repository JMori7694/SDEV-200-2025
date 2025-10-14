/* Chapter 9 pg 387
 * Programming Exercise 8 A
 * 
 * Written by: Jei
 * Date: 10/13/2025
 */

public abstract class Book {
	// String and double fields for title and price
	private String title;
	public double price;
	public String bookType;

	// Constructor that requires the book title
	public Book(String title) {
		setTitle(title);
		setPrice();
		setType();
	}

	// Get method that returns the title
	public String getTitle() {
		return title;
	}

	// Get method that returns the price
	public double getPrice() {
		return price;
	}

	// Get method that returns the book type
	public String getType() {
		return bookType;
	}

	// Method to set the book title
	public void setTitle(String bookTitle) {
		title = bookTitle;
	}

	// Abstract method to set the price
	public abstract void setPrice();

	// Abstract method to set the book type
	public abstract void setType();
}