package bcu.harvardreferencing;

/**
 * This class represents an individual author.
 * <p>
 * It creates an IndividualAuthor object and stores the initials and last name
 * of an author.
 * 
 * @author Andrew Kay
 */
public class IndividualAuthor implements Author {
	private final String lastName;
	private final String initials;

	/**
	 * This creates an IndividualAuthor object and stores the name of the author.
	 * 
	 * @param lastName
	 *            The last name of the author.
	 * @param initials
	 *            The initials of the author.
	 */
	public IndividualAuthor(String lastName, String initials) {
		this.lastName = lastName;
		this.initials = initials;
	}

	/**
	 * The author's full name in the format "lastName, initials".
	 * 
	 * @return Gets the full name of the author
	 */
	@Override
	public String fullName() {
		return lastName + ", " + initials;
	}

	/**
	 * Gets the in-text citation name (last name) of the author.
	 * 
	 * @return The surname of the author.
	 */
	@Override
	public String citeName() {
		return lastName;
	}
}
