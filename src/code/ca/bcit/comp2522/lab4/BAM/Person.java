package ca.bcit.comp2522.lab4.BAM;

/**
 * Represents a person with a name, date of birth, and date of death.
 * Implements Comparable for comparing birth dates and Printable for display functionality.
 * Implements Reversible for reversing the name.
 *
 * @author Ben, Andre, Marcus
 * @version 1.0
 */
public class Person implements Comparable<Person>, Printable, Reversible {
    private static final int MIN_LENGTH = 0;

    private final Date dateOfBirth;
    private final Date dateOfDeath;
    private final Name name;

    /**
     * Constructs a Person object with the specified date of birth, date of death, and name.
     *
     * @param dateOfBirth the date of birth of the person
     * @param dateOfDeath the date of death of the person
     * @param name the name of the person
     * @throws IllegalArgumentException if dateOfBirth or name is null
     */
    public Person(final Date dateOfBirth,
                  final Date dateOfDeath,
                  final Name name) {
        validateDateOfBirth(dateOfBirth);
        validateName(name);

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    public Name getName(){
        return name;
    }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    public Date getDateOfDeath(){
        return dateOfDeath;
    }


    /**
     * Compares this person with another person based on their date of birth.
     *
     * @param person the person to compare with
     * @return a negative integer, zero, or a positive integer as this person
     *         is older than, the same age as, or younger than the specified person
     * @throws IllegalArgumentException if the specified person is null
     */
    @Override
    public int compareTo(final Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }

        if (this.dateOfBirth.getYear() != person.dateOfBirth.getYear()) {
            return Integer.compare(this.dateOfBirth.getYear(), person.dateOfBirth.getYear());
        }

        if (this.dateOfBirth.getMonth() != person.dateOfBirth.getMonth()) {
            return Integer.compare(this.dateOfBirth.getMonth(), person.dateOfBirth.getMonth());
        }

        return Integer.compare(this.dateOfBirth.getDay(), person.dateOfBirth.getDay());
    }

    /**
     * Displays the details of the person including name, date of birth, and date of death.
     */
    @Override
    public void display() {
        final StringBuilder personBuilder;
        personBuilder = new StringBuilder();

        personBuilder.append("Name: ")
                .append(this.name)
                .append("\nDate of Birth: ")
                .append(this.dateOfBirth)
                .append("\nDate of Death: ")
                .append(this.dateOfDeath)
                .append("\n");

        System.out.println(personBuilder.toString());
    }

    /**
     * Reverses and prints the name of the person.
     */
    @Override
    public void backward() {
        final StringBuilder reverseBuilder;
        reverseBuilder = new StringBuilder();

        for (int i = MIN_LENGTH; i < name.toString().length(); i++) {
            reverseBuilder.append(name.toString().charAt(i));
        }

        System.out.println(reverseBuilder);
    }

    /**
     * Validates the date of birth to ensure it is not null.
     *
     * @param dateOfBirth the date of birth to validate
     * @throws IllegalArgumentException if dateOfBirth is null
     */
    private static void validateDateOfBirth(final Date dateOfBirth) {
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("Date of birth cannot be null");
        }
    }

    /**
     * Validates the name to ensure it is not null.
     *
     * @param name the name to validate
     * @throws IllegalArgumentException if name is null
     */
    private static void validateName(final Name name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }
}
