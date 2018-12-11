package bcu.harvardreferencing;

import java.util.Collections;
import java.util.List;

/**
 * Creates a Publication object that stores information about a Publication.
 * @author Andrew Kay
 *
 */
public class Publication {
    private final List<Author> authors;
    private final String title;
    private final int year;
    
    /**
     * Creates a Publication Object that stores the authors as a list, 
     * the title and a year of publication.
     * @param authors A list of authors for the publication as list of Author objects.
     * @param title	The title of the publication
     * @param year The year of issue for the publication.
     */
    public Publication(List<Author> authors, String title, int year) {
        if(authors.isEmpty()) {
            throw new IllegalArgumentException("Empty authors list");
        }
        
        this.authors = authors;
        this.title = title;
        this.year = year;
    }
    
    /**
     * Gets the list of authors of the publication.
     * @return Gets a list of authors (List<Author>).
     */
    public List<Author> getAuthors() {
        return Collections.unmodifiableList(authors);
    }
    
    /**
     * Gets the title of the Publication.
     * @return Gets the title of the Publication (String).
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Gets the year of issue or publication for the publication
     * @return gets the year of issue for the publication (int).
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Gets the Harvard reference for the publication. For use in Bibliographies.
     * @return Gets the Harvard reference for the Publication in the form (YEAR) TITLE. (String)
     */
    public String harvardReference() {
        return authorNames() + " (" + year + ") " + title + ".";
    }
    
    /**
     * Gets the names of the authors for the publication.
     * It intelligently creates its return value based on the number of authors,
     * ensuring that they are comma separated with the last name first then their initial
     * and that the final author has "and" prepended.  
     * 
     * @return Returns the formatted names of the publication (String).
     */
    public String authorNames() {
        String nameString = "";
        
        int secondLast = authors.size() - 2;
        for(int i = 0; i < authors.size(); i++) {
            nameString += authors.get(i).fullName();
            if(i < secondLast) {
                nameString += ", ";
            } else if(i == secondLast) {
                nameString += " and ";
            }
        }
        
        return nameString;
    }
}
