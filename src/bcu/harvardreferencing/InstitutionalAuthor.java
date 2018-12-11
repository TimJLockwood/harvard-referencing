package bcu.harvardreferencing;

/**
 * 
 * Creates a InstitutionalAuthor object and 
 * stores the name of an Institutional author.
 * 
 * @author Andrew Kay
 *
 */

public class InstitutionalAuthor implements Author {
	private final String name;

	/**
	 * This creates an InstitutionalAuthor Object
	 * 
	 * @param name
	 *            The name of the institution.
	 * @see Author
	 * @see IndividualAuthor
	 */

	public InstitutionalAuthor(String name) {
		this.name = name;
	}

	/**
	 * Gets the full name of the institution for referencing in bibliographies.
	 * 
	 * @return gets the full name of the Institution (String)
	 */
	@Override
	public String fullName() {
		return name;
	}

	/**
	 * Gets the name of the institution for in-text citations
	 * 
	 * @return The name of the institution for in-text citations (String)
	 */
	@Override
	public String citeName() {
		return name;
	}
}
