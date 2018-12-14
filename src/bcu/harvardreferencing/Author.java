package bcu.harvardreferencing;

/**
 * The interface definition for an author.
 * 
 * @author Andrew Kay
 */
public interface Author {

	/**
	 * Gets the full name of the author, for use in Bibliographies.
	 * 
	 * @return The full name of the author.
	 */
	public String fullName();

	/**
	 * Gets the in-text citation of the author.
	 * 
	 * @return The author's name for in-text citation.
	 */
	public String citeName();
}
