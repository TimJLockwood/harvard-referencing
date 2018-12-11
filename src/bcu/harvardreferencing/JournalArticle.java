package bcu.harvardreferencing;

import java.util.List;

/**
 * This class represents a Journal Article.
 * It stores the information about the journal article.
 * 
 * <p> Authors are stored as a list of Author objects {@code List<Author> authors}.
 * 
 * @author Andrew Kay
 *
 */
public class JournalArticle extends Publication {
    private final String journalName;
    private final int volume;
    private final int issue;
    private final int pageFrom;
    private final int pageTo;
    
    /**
     * Creates a new JournalArticle that stores: the List of authors; the title of the work; the 
     * year the work was published; the name of the Journal it is published in; the volume of the Journal
     * the issue of the Journal; the page the article starts on in the Journal and the page the article
     * finishes on in the Journal.
     * 
     * @param authors Takes a list of Authors.
     * @see Author
     * @param title Takes the title of the work.
     * @param year	Takes the year of publication of the work.
     * @param journalName Takes the name of the journal the work is published in.
     * @param volume Takes the volume of the journal the work is published in.
     * @param issue Takes the issue of the journal the work is published in.
     * @param pageFrom Takes the page of the journal the work starts on.
     * @param pageTo Takes the page of the journal the work finishes on.
     */
    public JournalArticle(
        List<Author> authors, String title, int year,
        String journalName, int volume, int issue, int pageFrom, int pageTo
    ) {
        super(authors, title, year);
        this.journalName = journalName;
        this.volume = volume;
        this.issue = issue;
        this.pageFrom = pageFrom;
        this.pageTo = pageTo;
    }
    
    /**
     * Gets the name of the journal the work is in.
     * @return Gets the name of the Journal (String).
     */
    public String getJournalName() {
        return journalName;
    }
    
    /**
     * Gets the volume number of the journal the article is written in.
     * @return Gets the volume number of the journal (int).
     */
    public int getVolume() {
        return volume;
    }
    
    /**
     * Gets the issue number of the journal the article is written in.
     * @return Gets the issue number of the journal (int).
     */
    public int getIssue() {
        return issue;
    }
    
    /**
     * Gets the page number the article starts on in the Journal.
     * @return Gets the starting page number of the article (int).
     */
    public int getPageFrom() {
        return pageFrom;
    }
    
    /**
     * Gets the page number the article finishes on in the Journal.
     * @return Gets the finishing page number of the article (int).
     */
    public int getPageTo() {
        return pageTo;
    }
    
    /**
     * Gets the Harvard reference of the Journal article to generate the bibliography.
     * @return Gets the Harvard reference of the article (String).
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
