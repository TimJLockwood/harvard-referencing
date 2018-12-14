package bcu.harvardreferencing;

import java.util.List;

/**
 * This class represents a book.
 * 
 * <p>
 * It stores the publisher of the book, as well as the books authors, title and
 * year of publication.
 * 
 * @author Andrew Kay
 * @see Publication
 */
public class Book extends Publication {
	private final String publisher;

	/**
	 * Creates a Book object
	 * <p>
	 * It stores the Authors of the book, the title of the book, the year of
	 * publication of the book and the publisher of the book.
	 * 
	 * @param authors
	 *            A list of authors of the book.
	 * @param title
	 *            The title of the book.
	 * @param year
	 *            The year of publication of the book.
	 * @param publisher
	 *            The name of the publisher of the book.
	 */
	public Book(List<Author> authors, String title, int year, String publisher) {
		super(authors, title, year);
		this.publisher = publisher;
	}

	/**
	 * Gets the name of the publisher of the book.
	 * 
	 * @return The name of the book publisher.
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * Gets the Harvard reference for use in Bibliographies in the format
	 * "AUTHORNAMES (YEAR) TITLE. PUBLISHER.".
	 * 
	 * @return The Harvard reference of the book.
	 */
	@Override
	public String harvardReference() {
		return super.harvardReference() + " " + publisher + ".";
	}
}
