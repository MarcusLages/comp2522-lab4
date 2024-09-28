package ca.bcit.comp2522.lab4.BAM;

public class Person implements Comparable<Person> {
    public final Date dateOfBirth;
    public final Date dateOfDeath;
    public final String name;
    public Person(Date dateOfBirth, Date dateOfDeath, String name) {
        validatedateOfBirth(dateOfBirth);
        validatename(name);

        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.name = name;

    }


    @Override
    public int compareTo(final Person person){
        if (person == null){
            throw new NullPointerException("Person cannot be null");
        }
        return person.age - this.age;
    }

    @Override
    public void display(){
        final StringBuilder personBuilder;
        final String personBuilt;

        personBuilder = new StringBuilder();
        personBuilt = personBuilder.toString();

        personBuilder.append("Name: " + name +
                "\nDate of Birth: " + dateOfBirth +
                "\nDate of Death: " + dateOfDeath + "\n");

        System.out.println(personBuilt);
    }

    @Override
    public void backward(){
        final StringBuilder reverseBuilder;
        final String reverseBuilt;

        reverseBuilder = new StringBuilder();
        reverseBuilt = reverseBuilder.toString();

        for (int i = 0; i < name.length(); i++) {
            reverseBuilder.append(name.charAt(i));
        }

        System.out.println(reverseBuilt);
    }

    private static void validatedateOfBirth(Date dateOfBirth) {
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("Date of birth cannot be null");
        }
    }


    private static void validatename(String name){
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }
}
