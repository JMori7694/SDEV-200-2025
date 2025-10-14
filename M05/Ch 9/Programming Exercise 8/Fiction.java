/* Chapter 9 pg 387
 * Programming Exercise 8 B
 * 
 * Written by: Jei
 * Date: 10/13/2025
 */

public class Fiction extends Book {
	// Overrides the abstract class Book's setPrice() method
	@Override
	public void setPrice() {
		this.price = 24.99;
	}

	// Override the abstract class Book's setType() method
	@Override
	public void setType() {
		this.bookType = "Fiction";
	}

	// Constructor for the Fiction class
	public Fiction(String bookTitle) {
		super(bookTitle);
		// Calls the setPrice() method
		setPrice();
	}
}
