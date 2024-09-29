package ca.bcit.comp2522.lab4.BAM;

import java.util.Objects;

/**
 * Class represents a Biography and its information (title, year
 * published, author and subject).
 *
 * @Implements Comparable, Printable, Reversible
 *
 * @author Ben, Andre, Marcus
 * @version 1.0
 */
public class Biography extends Book {

    public final Person subject;

    /**
     * Creates a Biography object based on the given information.
     *
     * @param title         title of the biography
     * @param yearPublished year the biography was published
     * @param author        author of the biography
     * @param subject       subject of the biography
     */
    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject) {
        super(title, yearPublished, author);
        validateSubject(subject);

        this.subject = subject;
    }

    /**
     * Displays information about the biography on the console
     * (title, year published, author and biography).
     */
    @Override
    public void display() {
        final StringBuilder infoBuilder;
        final String info;

        infoBuilder = new StringBuilder();
        infoBuilder.append("Subject: ")
                .append(subject);
        info = infoBuilder.toString();

        super.display();
        System.out.println(info);
    }

    /**
     * Checks and returns true (declared the same) if a given Biography
     * object has the same subject as this object.
     *
     * @param obj   object to be compared
     * @return true if object is a Biography object and has the same subject
     *         as this object
     */
    @Override
    public boolean equals(final Object obj) {
        if(obj == null) {
            return false;
        }

        if(obj == this) {
            return true;
        }

        if(!(obj instanceof Biography)) {
            return false;
        }

        final Biography bioCompare;
        final boolean equal;
        bioCompare = (Biography) obj;
        equal = (this.subject.equals(bioCompare.subject));
        return equal;
    }

    /**
     * Function to return a unique hash code based on the name
     * of the subject.
     *
     * @return object's unique hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(subject.name.first, subject.name.last);
    }

    // Validates the subject to not be null
    private static void validateSubject(final Person subject) {
        if (subject == null) {
            throw new IllegalArgumentException("Null biography subject is not valid.");
        }
    }
}
