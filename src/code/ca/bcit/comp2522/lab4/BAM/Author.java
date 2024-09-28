package ca.bcit.comp2522.lab4.BAM;

public class Author extends Person{
    private static final int MAX_GENRE_LENGTH = 30;

    public final String genre;

    public Author(final Date dateOfBirth, final Date dateOfDeath, final String name, final String genre) {
        super(dateOfBirth, dateOfDeath, name);
        this.genre = genre;

        validategenre(genre);
    }

    public void display(){
        final StringBuilder authorBuilder;
        final String authorBuilt;

        authorBuilder = new StringBuilder();
        authorBuilt = authorBuilder.toString();

        authorBuilder.append("Name: " + name +
                "\nDate of Birth: " + dateOfBirth +
                "\nDate of Death: " + dateOfDeath + "\n");

        System.out.println(authorBuilt);
    }



    public static void validategenre(final String genre){
        if(genre == null){
            throw new IllegalArgumentException("Genre cannot be null.");
        }

        if(genre.isEmpty()){
            throw new IllegalArgumentException("Genre cannot be empty.");
        }

        if(genre.isBlank()){
            throw new IllegalArgumentException("Genre cannot be blank.");
        }

        if (genre.length() > MAX_GENRE_LENGTH){
            throw new IllegalArgumentException("Genre name is too long");
        }

    }
}
