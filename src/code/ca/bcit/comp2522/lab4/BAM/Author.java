package ca.bcit.comp2522.lab4.BAM;

/**
 * Represents an author with a name, date of birth, date of death, and a literary genre.
 * Extends the Person class and implements Printable for display functionality.
 *
 * @author Ben, Andre, Marcus
 * @version 1.0
 */
public class Author extends Person implements Printable {
    private static final int MAX_GENRE_LENGTH = 30;

    private final String genre;

    /**
     * Constructs an Author object with the specified date of birth, date of death, name, and genre.
     *
     * @param dateOfBirth the date of birth of the author
     * @param dateOfDeath the date of death of the author
     * @param name the name of the author
     * @param genre the literary genre of the author
     * @throws IllegalArgumentException if genre is null, empty, blank, or exceeds maximum length
     */
    public Author(final Date dateOfBirth, final Date dateOfDeath, final Name name, final String genre) {
        super(dateOfBirth, dateOfDeath, name);
        validateGenre(genre);
        this.genre = genre;
    }

    /**
     * Displays the details of the author including name, date of birth, date of death, and genre.
     */
    @Override
    public void display() {
        final StringBuilder authorBuilder;
        final String authorBuilt;
        authorBuilder = new StringBuilder();

        authorBuilder.append("Name: ")
                .append(getName())
                .append("\nDate of birth: ")
                .append(getDateOfBirth())
                .append("\nDate of death: ")
                .append(getDateOfDeath())
                .append("\nGenre: ")
                .append(genre)
                .append("\n");

        authorBuilt = authorBuilder.toString();

        System.out.println(authorBuilt);
    }

    /**
     * Validates the genre to ensure it is not null, empty, blank, or too long.
     *
     * @param genre the genre to validate
     * @throws IllegalArgumentException if genre is null, empty, blank, or exceeds maximum length
     */
    public static void validateGenre(final String genre) {
        if (genre == null) {
            throw new IllegalArgumentException("Genre cannot be null.");
        }

        if (genre.isEmpty()) {
            throw new IllegalArgumentException("Genre cannot be empty.");
        }

        if (genre.isBlank()) {
            throw new IllegalArgumentException("Genre cannot be blank.");
        }

        if (genre.length() > MAX_GENRE_LENGTH) {
            throw new IllegalArgumentException("Genre name is too long.");
        }
    }
    @Override
    public String toString(){
        return getName().getFirst();
    }
}
