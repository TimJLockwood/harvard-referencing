package bcu.harvardreferencing;

import java.util.List;

/**
 * Creates a Book object. It is a subclass of Publication.
 * @see Publication
 * <p> Stores the publisher of the Book, in addition to the attributes it
 * inherits from its superclass.
 * 
 * @author Andrew Kay
 * @see Publication
 */
public class Book extends Publication {
    private final String publisher;
    
    /**
     * Creates a Book object that stores the Authors of the book,
     * the title of the book, the year of publication of the book
     * and the publisher of the book.
     * 
     * @param authors A list of authors of the book.
     * @param title The title of the book.
     * @param year The year of publication of the book.
     * @param publisher The name of the publisher of the book.
     */
    public Book(
        List<Author> authors, String title, int year,
        String publisher
    ) {
        super(authors, title, year);
        this.publisher = publisher;
    }
    
    /**
     * Gets the name of the publisher of the book.
     * @return Gets the name of the book publisher (String).
     */
    public String getPublisher() {
        return publisher;
    }
        
    /**
     * Gets the Harvard reference for use in Bibliographies.
     * Uses the superclass to create the reference then adds
     * the publisher to the end of the reference.
     * 
     * 
     * @return Gets the Harvard reference of the book (String).
     */
    @Override
    public String harvardReference() {
        return super.harvardReference() + " " + publisher + ".";
    }
}
