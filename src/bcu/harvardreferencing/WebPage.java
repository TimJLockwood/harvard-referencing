package bcu.harvardreferencing;

import java.util.List;

/**
 * This class represents a Webpage.
 * <p>
 * Creates a WebPage object that stores information about a Webpage. 
 * 
 * @author Andrew Kay
 */
public class WebPage extends Publication {
	private final String url;
	private final String dateAccessed;

	/**
	 * Creates a WebPage object that stores information about a Webpage. It stores:
	 * the names of the authors as a list of authors, the title of the Webpage , the
	 * year of publication for the Webpage, the URL of the Webpage and the date the
	 * Webpage was last accessed.
	 * 
	 * @param authors
	 *            A list of the articles authors.
	 * @param title
	 *            The title of the Webpage.
	 * @param year
	 *            The year the Webpage was published.
	 * @param url
	 *            The URL of the Webpage.
	 * @param dateAccessed
	 *            The date the Webpage was last accessed.
	 */
	public WebPage(List<Author> authors, String title, int year, String url, String dateAccessed) {
		super(authors, title, year);
		this.url = url;
		this.dateAccessed = dateAccessed;
	}

	/**
	 * Gets the URL of the Webpage.
	 * 
	 * @return The URL of the Webpage.
	 */
	public String getURL() {
		return url;
	}

	/**
	 * Gets the date the Webpage was last accessed.
	 * 
	 * @return The date the Webpage was last accessed.
	 */
	public String getDateAccessed() {
		return dateAccessed;
	}

	/**
	 * Gets the Harvard reference of the Webpage in the format ""AUTHORNAMES (YEAR)
	 * TITLE. Available at: URL [Accessed DATEACCESSED]".
	 * 
	 * @return The Harvard reference for the Webpage.
	 */
	@Override
	public String harvardReference() {
		String reference = super.harvardReference();

		reference += " Available at: " + url;
		reference += " [Accessed " + dateAccessed + "].";

		return reference;
	}
}
