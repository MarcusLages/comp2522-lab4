package ca.bcit.comp2522.lab4.BAM;

public class Main {
    public static void main(final String[] args) {

        final Author orwell;
        final Author lee;
        final Author austen;
        final Author fitzgerald;
        final Author melville;

        final Author Frank;
        final Author Mandela;
        final Author Ghandi;
        final Author Angelou;
        final Author X;

        final Person Moses;
        final Person Jobs;
        final Person Churchill;
        final Person Hamilton;
        final Person Einstein;

        final Name Nameorwell;
        final Name Namelee;
        final Name Nameausten;
        final Name Namefitzgerald;
        final Name Namemelville;

        final Name NameFrank;
        final Name NameMandela;
        final Name NameGhandi;
        final Name NameAngelou;
        final Name NameX;

        final Name NameMoses;
        final Name NameJobs;
        final Name NameChurchill;
        final Name NameHamilton;
        final Name NameEinstein;

        final Book book1;
        final Book book2;
        final Book book3;
        final Book book4;
        final Book book5;

        final Biography bio1;
        final Biography bio2;
        final Biography bio3;
        final Biography bio4;
        final Biography bio5;

        final Autobiography auto1;
        final Autobiography auto2;
        final Autobiography auto3;
        final Autobiography auto4;
        final Autobiography auto5;

        final int MIN_COMPARE = 0;

        Nameorwell = new Name("George", "Orwell");
        Namelee = new Name("Harper", "Lee");
        Nameausten = new Name("Jane", "Austen");
        Namefitzgerald = new Name("F. Scott", "Fitzgerald");
        Namemelville = new Name("Herman", "Melville");

        NameFrank = new Name("Anne", "Frank");
        NameMandela = new Name("Nelson", "Mandela");
        NameGhandi = new Name("Mahatma", "Ghandi");
        NameAngelou = new Name("Maya", "Angelou");
        NameX = new Name("Malcolm", "X");

        NameMoses = new Name("Robert", "Moses");
        NameJobs = new Name("Steve", "Jobs");
        NameChurchill = new Name("Winston", "Churchill");
        NameHamilton = new Name("Alexander", "Hamilton");
        NameEinstein = new Name("Albert", "Einstein");

        orwell = new Author(new Date(1903, 6, 25), new Date(1950, 1, 21), Nameorwell, "ham");
        lee = new Author(new Date(1926, 4, 28), new Date(2016, 2, 19), Namelee, "ster");
        austen = new Author(new Date(1775, 12, 16), new Date(1817, 7, 18), Nameausten, "yo mama");
        fitzgerald = new Author(new Date(1896, 9, 24), new Date(1940, 12, 21), Namefitzgerald, "bruh");
        melville = new Author(new Date(1819, 8, 1), new Date(1891, 9, 28), Namemelville, "huh");

        Moses = new Person(new Date(10, 10, 10), new Date(10, 10, 10), NameMoses);
        Jobs = new Person(new Date(10, 10, 10), new Date(10, 10, 10), NameJobs);
        Churchill = new Person(new Date(10, 10, 10), new Date(10, 10, 10), NameChurchill);
        Hamilton = new Person(new Date(10, 10, 10), new Date(10, 10, 10), NameHamilton);
        Einstein = new Person(new Date(10, 10, 10), new Date(10, 10, 10), NameEinstein);

        Frank = new Author(new Date(10, 10, 10), new Date(10, 10, 10), NameFrank, "bruh");
        Mandela = new Author(new Date(10, 10, 10), new Date(10, 10, 10), NameMandela, "ham");
        Ghandi = new Author(new Date(10, 10, 10), new Date(10, 10, 10), NameGhandi, "hamster");
        Angelou = new Author(new Date(10, 10, 10), new Date(10, 10, 10), NameAngelou, "kachow");
        X = new Author(new Date(10, 10, 10), new Date(10, 10, 10), NameX, "weeee");

        book1 = new Book("1984", 1949, orwell);
        book2 = new Book("To Kill a Mockingbird", 1960, lee);
        book3 = new Book("Pride and Prejudice", 1813, austen);
        book4 = new Book("The Great Gatsby", 1925, fitzgerald);
        book5 = new Book("Moby-Dick", 1851, melville);

        bio1 = new Biography("The Power Broker", 1974, melville, Moses);
        bio2 = new Biography("Steve Jobs", 2011, orwell, Jobs);
        bio3 = new Biography("Churchill: A Life", 1991, fitzgerald, Churchill);
        bio4 = new Biography("Alexander Hamilton", 2004, lee, Hamilton);
        bio5 = new Biography("Einstein: His Life and Universe", 2007, austen, Einstein);

        auto1 = new Autobiography("The Diary of a Young Girl", 1947, Frank);
        auto2 = new Autobiography("Long Walk to Freedom", 1994, Mandela);
        auto3 = new Autobiography("The Story of My Experiments with Truth", 1927, Ghandi);
        auto4 = new Autobiography("I Know Why the Caged Bird Sings", 1969, Angelou);
        auto5 = new Autobiography("Autobiography of Malcolm X", 1965, X);

        // Use Printable interface to display information
        book1.display();
        bio1.display();
        auto1.display();

        // Use Reversible interface to print names and titles backward
        System.out.println(" ");
        book1.backward();
        bio1.backward();
        auto1.backward();

        // Test comparisons for books
        book1.display();
        System.out.println("\nBook Publication Year Comparison Test:");
        if (book1.compareTo(book2) < MIN_COMPARE) {
            System.out.println("INCORRECT: " + book1.getTitle() + "(" + book1.getYearPublished() + ") was published before " +
                    book2.getTitle() + "(" +book2.getYearPublished() + ")");
        } else {
            System.out.println("CORRECT: " + book1.getTitle() + "(" + book1.getYearPublished() + ") is published before " +
                    book2.getTitle() + "(" +book2.getYearPublished() + ")");
        }
        if (book3.compareTo(book4) < MIN_COMPARE) {
            System.out.println("INCORRECT: " + book3.getTitle() + "(" + book3.getYearPublished()  + ") was published before " +
                    book4.getTitle() + "(" +book4.getYearPublished() + ")");
        } else {
            System.out.println("CORRECT: " + book4.getTitle() + "(" + book4.getYearPublished() + ") is published AFTER " +
                    book3.getTitle() + "(" +book3.getYearPublished() + ")");
        }
        // Test comparisons for authors
        System.out.println("\nAuthor Birth Year Comparison Test:");
        if (orwell.compareTo(lee) < MIN_COMPARE) {
            System.out.println("CORRECT: " + orwell.getName() + " was born before " + lee.getName());
        } else {
            System.out.println("INCORRECT: " + orwell.getName() + " should be born before " + lee.getName());
        }
        if (austen.compareTo(melville) < MIN_COMPARE) {
            System.out.println("CORRECT: " + austen.getName() + " was born before " + melville.getName());
        } else {
            System.out.println("INCORRECT: " + austen.getName() + " should be born before " + melville.getName());
        }

        // Test equality for biographies
        System.out.println("\nBiography Equality Test:");
        if (bio1.equals(bio2)) {
            System.out.println("INCORRECT: " + bio1.getSubject().getName() + " is equal to " + bio2.getSubject().getName());
        } else {
            System.out.println("CORRECT: " + bio1.getSubject().getName() + " is not equal to " + bio2.getSubject().getName());
        }
    }
}