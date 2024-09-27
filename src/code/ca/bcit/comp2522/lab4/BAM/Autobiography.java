package ca.bcit.comp2522.lab4.BAM;

/**
 * Class that represents an autobiography book and its information (title, year
 *  * published and author).
 *
 * @author Ben, Marcus, Andre
 * @version 1.0
 */
public class Autobiography extends Biography {

    /**
     * Creates an Autobiography object based on the given information.
     *
     * @param title         title of the autobiography
     * @param yearPublished year the autobbiography was published
     * @param author        author and subject of the autobiography
     */
    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author) {
        super(title, yearPublished, author, author);
    }

}
