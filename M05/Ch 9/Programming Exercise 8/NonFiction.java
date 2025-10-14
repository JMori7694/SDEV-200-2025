/* Chapter 9 pg 387
 * Programming Exercise 8 B
 * 
 * Written by: Jei
 * Date: 10/13/2025
 */

public class NonFiction extends Book {
	// Overrides the abstract class Book's setPrice() method
	@Override
	public void setPrice() {
		this.price = 37.99;
	}

	// Overrides the abstract class Book's setType() method
	@Override
	public void setType() {
		this.bookType = "Non-Fiction";
	}

	// Constructor for the NonFiction book class
	public NonFiction(String bookTitle) {
		super(bookTitle);
		// Calls the setPrice() Method
		setPrice();
	}
}
