package ca.bcit.comp2522.lab4.BAM;

public class Autobiography extends Biography {

    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author) {
        super(title, yearPublished, author, author.person);
    }

}
