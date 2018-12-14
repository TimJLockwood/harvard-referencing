package bcu.harvardreferencing;

import java.util.Collections;
import java.util.List;

/**
 * This class represents a publication.
 * <p>
 * Creates a Publication object that stores information about a publication,
 * such as its authors title and year.
 * 
 * @author Andrew Kay
 */
public class Publication {
	private final List<Author> authors;
	private final String title;
	private final int year;

	/**
	 * Creates a Publication Object that stores the authors as a list, the title and
	 * a year of publication.
	 * 
	 * @param authors
	 *            A list of authors for the publication as list of Author objects.
	 * @see Author
	 * @param title
	 *            The title of the publication.
	 * @param year
	 *            The year of issue for the publication.
	 */
	public Publication(List<Author> authors, String title, int year) {
		if (authors.isEmpty()) {
			throw new IllegalArgumentException("Empty authors list");
		}

		this.authors = authors;
		this.title = title;
		this.year = year;
	}

	/**
	 * Gets the list of authors of the publication.
	 * 
	 * @return a list of authors.
	 */
	public List<Author> getAuthors() {
		return Collections.unmodifiableList(authors);
	}

	/**
	 * Gets the title of the publication.
	 * 
	 * @return The title of the publication.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Gets the year of issue or publication for the publication.
	 * 
	 * @return The year of issue for the publication.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Gets the Harvard reference for the publication. For use in bibliographies.
	 * 
	 * @return The Harvard reference for the publication in the form "AUTHORNAMES
	 *         (YEAR) TITLE."
	 */
	public String harvardReference() {
		return authorNames() + " (" + year + ") " + title + ".";
	}

	/**
	 * Gets the names of the authors for the publication.
	 * <p>
	 * It intelligently creates its return value based on the number of authors. It
	 * will ensure that they are comma separated with the last name first, then
	 * their initial and that the final author has "and" prepended.
	 * 
	 * @return The formatted names of the publication.
	 */
	public String authorNames() {
		String nameString = "";

		int secondLast = authors.size() - 2;
		for (int i = 0; i < authors.size(); i++) {
			nameString += authors.get(i).fullName();
			if (i < secondLast) {
				nameString += ", ";
			} else if (i == secondLast) {
				nameString += " and ";
			}
		}

		return nameString;
	}
}
