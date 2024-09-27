package ca.bcit.comp2522.lab4.BAM;

public class Biography extends Book {

    public final Person subject;

    public Biography(final String title, final int yearPublished, final Author author, final Person subject) {
        super(title, yearPublished, author);
        validateSubject(subject);

        this.subject = subject;
    }

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
        equal = (this.subject.equals(bioCompare));
        return equal;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(subject.name);
    }

    private static void validateSubject(final Person subject) {
        if (subject == null) {
            throw new IllegalArgumentException("Null biography subject is not valid.");
        }
    }
}
