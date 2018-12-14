package bcu.harvardreferencing;

import java.util.List;

/**
 * This class represents a journal article.
 * 
 * <p>
 * It stores the information about the journal article such as its name, issue
 * and volume number.
 * 
 * @author Andrew Kay
 */
public class JournalArticle extends Publication {
	private final String journalName;
	private final int volume;
	private final int issue;
	private final int pageFrom;
	private final int pageTo;

	/**
	 * Creates a new JournalArticle.
	 * <p>
	 * It stores: the List of authors, the title of the work, the year the work was
	 * published, the name of the journal it is published in, the volume of the
	 * journal the issue of the journal, the page the article starts on in the
	 * journal and the page the article finishes on in the journal.
	 * 
	 * @param authors
	 *            A list of Authors.
	 * @see Author
	 * @param title
	 *            The title of the work.
	 * @param year
	 *            The year of publication of the work.
	 * @param journalName
	 *            The name of the journal the work is published in.
	 * @param volume
	 *            The volume of the journal the work is published in.
	 * @param issue
	 *            The issue of the journal the work is published in.
	 * @param pageFrom
	 *            The page of the journal the work starts on.
	 * @param pageTo
	 *            The page of the journal the work finishes on.
	 */
	public JournalArticle(List<Author> authors, String title, int year, String journalName, int volume, int issue,
			int pageFrom, int pageTo) {
		super(authors, title, year);
		this.journalName = journalName;
		this.volume = volume;
		this.issue = issue;
		this.pageFrom = pageFrom;
		this.pageTo = pageTo;
	}

	/**
	 * Gets the name of the journal the work is in.
	 * 
	 * @return The name of the journal.
	 */
	public String getJournalName() {
		return journalName;
	}

	/**
	 * Gets the volume number of the journal the article is written in.
	 * 
	 * @return The volume number of the journal.
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * Gets the issue number of the journal the article is written in.
	 * 
	 * @return The issue number of the journal.
	 */
	public int getIssue() {
		return issue;
	}

	/**
	 * Gets the page number the article starts on in the journal.
	 * 
	 * @return The starting page number of the article.
	 */
	public int getPageFrom() {
		return pageFrom;
	}

	/**
	 * Gets the page number the article finishes on in the journal.
	 * 
	 * @return The finishing page number of the article.
	 */
	public int getPageTo() {
		return pageTo;
	}

	/**
	 * Gets the Harvard reference of the nournal article to generate the
	 * bibliography in the format "AUTHORNAMES (YEAR) TITLE. JOURNALNAME, volume
	 * (ISSUENUMBER) pp. PAGEFROM-PAGETO.".
	 * 
	 * @return The Harvard reference of the article.
	 */
	@Override
	public String harvardReference() {
		String reference = super.harvardReference();

		reference += " " + journalName + ", ";
		reference += volume + "(" + issue + "), ";
		reference += "pp. " + pageFrom + "-" + pageTo + ".";

		return reference;
	}
}
