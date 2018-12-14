package bcu.harvardreferencing;

/**
 * This class represents an institutional author.
 * <p>
 * Creates a InstitutionalAuthor object and stores the name of an institutional
 * author.
 * 
 * @author Andrew Kay
 */

public class InstitutionalAuthor implements Author {
	private final String name;

	/**
	 * This creates an InstitutionalAuthor Object.
	 * 
	 * @param name
	 *            The name of the institution.
	 */

	public InstitutionalAuthor(String name) {
		this.name = name;
	}

	/**
	 * Gets the full name of the institution for referencing in bibliographies.
	 * 
	 * @return The full name of the Institution.
	 */
	@Override
	public String fullName() {
		return name;
	}

	/**
	 * Gets the name of the institution for in-text citations.
	 * 
	 * @return The name of the institution for in-text citations.
	 */
	@Override
	public String citeName() {
		return name;
	}
}
