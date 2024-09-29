package ca.bcit.comp2522.lab4.BAM;

public class Author extends Person implements Printable{
    private static final int MAX_GENRE_LENGTH = 30;

    public final String genre;

    public Author(final Date dateOfBirth, final Date dateOfDeath, final String name, final String genre) {
        super(dateOfBirth, dateOfDeath, name);
        this.genre = genre;

        // Marcus:
        // Validate first, then you assign. Not the opposite.
        validategenre(genre);
    }

    public void display(){
        final StringBuilder authorBuilder;
        final String authorBuilt;

        authorBuilder = new StringBuilder();

        // Marcus:
        // - You are getting the String value of the StringBuilder before
        //   it's even built. This will return a blank space. Use the toString
        //   after you have built the whole String.
        authorBuilt = authorBuilder.toString();

        // Marcus:
        // Use append or +, not both (preferably append).
        authorBuilder.append("Name: " + name +
                "\nDate of Birth: " + dateOfBirth +
                "\nDate of Death: " + dateOfDeath + "\n");

        System.out.println(authorBuilt);
    }



    public static void validategenre(final String genre){
        if(genre == null){
            throw new IllegalArgumentException("Genre cannot be null.");
        }

        // Marcus:
        // - This is okay, but you can prob join isEmpty || isBlank if you want
        if(genre.isEmpty()){
            throw new IllegalArgumentException("Genre cannot be empty.");
        }

        if(genre.isBlank()){
            throw new IllegalArgumentException("Genre cannot be blank.");
        }

        // Marcus:
        // - It would be good to display the name of the genre that was given,
        //   so you can debug it easier.
        if (genre.length() > MAX_GENRE_LENGTH){
            throw new IllegalArgumentException("Genre name is too long");
        }

    }
}
