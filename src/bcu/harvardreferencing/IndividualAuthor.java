package bcu.harvardreferencing;


/**
 * Creates an IndividualAuthor object and stores the initials and last name of an author. It implements 
 * the Author interface.
 * 
 * @author Andrew Kay
 *
 */
public class IndividualAuthor implements Author {
	private final String lastName;
	private final String initials;

	/**
	 * This creates an IndividualAuthor object and stores the name of the author.
	 * @param lastName
	 *            The last name of the author.
	 * @param initials
	 *            The initials of the author.
	 * @see Author
	 * @see InstitutionalAuthor
	 */
	public IndividualAuthor(String lastName, String initials) {
		this.lastName = lastName;
		this.initials = initials;
	}

	/**
	 * Gets the full name of the author in the format lastName, initials.
	 * 
	 * @return the authors full name in the format lastName, initials as a single string (String).
	 */
	@Override
	public String fullName() {
		return lastName + ", " + initials;
	}

	/**
	 * Gets the in-text citation name (last name) of the author.
	 * 
	 * @return gets the surname(in text citation) of the author (String).
	 */
	@Override
	public String citeName() {
		return lastName;
	}
}
