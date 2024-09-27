package ca.bcit.comp2522.lab4.BAM;

import java.util.Currency;

public class Book
        implements Comparable<Book>, Printable, Reversible {

    private static final int MAX_TITLE_SIZE = 100;
    private static final int FIRST_YEAR = 1;
    private static final int CURRENT_YEAR = 2024;

    private final String title;
    private final int yearPublished;
    private final Author author;

    public Book(final String title, final int yearPublished, final Author author) {
        validateTitle(title);
        validateYrPublished(yearPublished);
        validateAuthor(author);

        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    @Override
    public void display() {
        final StringBuilder infoBuilder;
        final String info;

        infoBuilder = new StringBuilder();
        infoBuilder.append(title)
                .append("(")
                .append(yearPublished)
                .append(") by ")
                .append(author);

        info = infoBuilder.toString();

        System.out.println(info);
    }

    @Override
    public void backward() {
        final StringBuilder reverseBuilder;
        final String reverse;

        reverseBuilder = new StringBuilder();
        for(int i = 0; i < title.length(); i++) {
            reverseBuilder.append(title.charAt(i));
        }

        reverse = reverseBuilder.toString();

        System.out.println(reverse);
    }

    @Override
    public int compareTo(final Book book) {
        return book.yearPublished - this.yearPublished;
    }

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

    private static void validateYrPublished(final int yearPublished) {
        if (yearPublished < FIRST_YEAR || yearPublished > CURRENT_YEAR) {
            throw new IllegalArgumentException("Year not accepted. Must be between " + FIRST_YEAR +
                    " and " + CURRENT_YEAR +
                    ". Year published given: " + yearPublished);
        }
    }

    private static void validateAuthor(final Author author) {
        if (author == null) {
            throw new IllegalArgumentException("Null author not accepted.");
        }
    }

}
