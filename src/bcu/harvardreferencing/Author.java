package bcu.harvardreferencing;

/**
 * The interface definition for the Author.
 * @author Andrew Kay
 */
public interface Author {
	/**
	 * Gets the full name of the author. For use in Bibliographies.
	 * @return Gets the full name of the author (String).
	 */
    public String fullName();
    
    /**
     * Gets the in-text citation of the author.
     * @return Gets the authors name for in-text citation (String).
     */
    public String citeName();
}
