package ca.bcit.comp2522.lab4.BAM;

public class Person implements Comparable<Person> {
    public final Date dateOfBirth;
    public final Date dateOfDeath;

    // Marcus:
    // - Name is of type Name, not String
    public final String name;

    // Marcus:
    // - MOTHERFUCKER FORGOT TO PUT FINAL ONCE AGAIN. YOU ARE DEAD THE NEXT TIME I SEE U.
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
            // Marcus:
            // - This is not actually a NullPointerException, it should be IllegalArgumentException.
            //   NullPointerException is only for when you are trying to access a variable or method
            //   from a null variable. In this case, you are just not accepting null as argument.
            //   It doesn't sound that bad, but giving the wrong Exception to a programmer can
            //   make the code harder to debug.
            throw new NullPointerException("Person cannot be null");
        }

        // Marcus:
        // - Dude, you didn't even add an age variable.
        return person.age - this.age;
    }

    @Override
    public void display(){
        final StringBuilder personBuilder;
        final String personBuilt;

        personBuilder = new StringBuilder();

        // Marcus:
        // - You are getting the String value of the StringBuilder before
        //   it's even built. This will return a blank space. Use the toString
        //   after you have built the whole String.
        personBuilt = personBuilder.toString();

        // Marcus:
        // Use append or +, not both (preferably append).
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

        // Marcus:
        // - You are getting the String value of the StringBuilder before
        //   it's even built. This will return a blank space. Use the toString
        //   after you have built the whole String.
        reverseBuilt = reverseBuilder.toString();

        // Marcus:
        // - Is it just me or do I see a magic number here? 😠
        for (int i = 0; i < name.length(); i++) {
            reverseBuilder.append(name.charAt(i));
        }

        System.out.println(reverseBuilt);
    }

    // Marcus:
    // - Follow the naming conventions for methods. Use lowercaseCamelCase
    private static void validatedateOfBirth(Date dateOfBirth) {
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("Date of birth cannot be null");
        }
    }

    // Marcus:
    // - Follow the naming conventions for methods. Use lowercaseCamelCase
    private static void validatename(String name){
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }
}
