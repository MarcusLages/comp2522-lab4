package ca.bcit.comp2522.lab4.BAM;

/**
 * Class represents a book and its information (title, year
 * published and author).
 *
 * @author Ben, Andre, Marcus
 * @version 1.0
 * @Implements Comparable, Printable, Reversible
 */
public class Book
        implements Comparable<Book>, Printable, Reversible {

    private static final int MAX_TITLE_SIZE = 100;
    private static final int FIRST_YEAR = 1;
    private static final int CURRENT_YEAR = 2024;

    private final String title;
    private final int yearPublished;
    private final Author author;

    /**
     * Creates a Book object based on given information.
     *
     * @param title         title of the book
     * @param yearPublished year the book was published
     * @param author        author of the book
     */
    public Book(final String title, final int yearPublished, final Author author) {
        validateTitle(title);
        validateYrPublished(yearPublished);
        validateAuthor(author);

        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    /**
     * Displays information about the book on the console
     * (title, year published and author).
     */
    @Override
    public void display() {
        final StringBuilder infoBuilder;
        final String info;

        infoBuilder = new StringBuilder();
        infoBuilder.append("Title: ")
                .append(title)
                .append("\nYear Published: ")
                .append(yearPublished)
                .append("\nAuthor: ")
                .append(author);

        info = infoBuilder.toString();

        System.out.println(info);
    }

    /**
     * Displays information about the name of the book backwards (reversed).
     */

    //Andre Dizon:
    //MAGIC NUMBER ┌∩┐(◣_◢)┌∩┐
    @Override
    public void backward() {
        final StringBuilder reverseBuilder;
        final String reverse;

        reverseBuilder = new StringBuilder();
        for (int i = 0; i < title.length(); i++) {
            reverseBuilder.append(title.charAt(i));
        }

        reverse = reverseBuilder.toString();

        System.out.println(reverse);
    }

    /**
     * Compares if a book is older than the given book.
     * If yes, return > 0. If equal, return == 0.
     * If not, return < 0
     *
     * @param book book to be compared.
     * @return return > 0 if the Book argument is newer than this object (year published),
     * return = 0 if both objects were published on the same year
     * return < 0 if the Book argument is older than this object
     */
    @Override
    public int compareTo(final Book book) {
        if (book == null) {
            throw new NullPointerException("Cannot access a null book.");
        }

        return book.yearPublished - this.yearPublished;
    }

    // Validates title to not be null, empty or blank and to have less than MAX_TITLE_SIZE characters
    private static void validateTitle(final String title) {
        if (title == null) {
            throw new IllegalArgumentException("Null book title not accepted.");
        } else if (title.isBlank() || title.isEmpty()) {
            throw new IllegalArgumentException("Blank or empty title not accepted.");
        } else if (title.length() < MAX_TITLE_SIZE) {
            throw new IllegalArgumentException("Title is bigger than the max size of " + MAX_TITLE_SIZE +
                    ". Title given: " + title);
        }
    }

    // Validates year published so its between FIRST_YEAR and CURRENT_YEAR
    private static void validateYrPublished(final int yearPublished) {
        if (yearPublished < FIRST_YEAR || yearPublished > CURRENT_YEAR) {
            throw new IllegalArgumentException("Year not accepted. Must be between " + FIRST_YEAR +
                    " and " + CURRENT_YEAR +
                    ". Year published given: " + yearPublished);
        }
    }

    // Validates author to be not be null
    private static void validateAuthor(final Author author) {
        if (author == null) {
            throw new IllegalArgumentException("Null author not accepted.");
        }
    }

}
