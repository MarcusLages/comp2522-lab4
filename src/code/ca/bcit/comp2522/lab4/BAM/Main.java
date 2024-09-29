package ca.bcit.comp2522.lab4.BAM;

public class Main{
        public static void main(String[] args) {

            // Create Author objects with a name, date of birth, date of death (if applicable), and genre
            Author orwell = new Author(new Date(1903, 6, 25), new Date(1950, 1, 21), "George Orwell", "ham");
            Author lee = new Author(new Date(1926, 4, 28), new Date(2016, 2, 19), "Harper Lee", "ster");
            Author austen = new Author(new Date(1775, 12, 16), new Date(1817, 7, 18), "Jane Austen", "yo mama");
            Author fitzgerald = new Author(new Date(1896, 9, 24), new Date(1940, 12, 21), "F. Scott Fitzgerald", "bruh");
            Author melville = new Author(new Date(1819, 8, 1), new Date(1891, 9, 28), "Herman Melville", "huh");

            Person Moses = new Person(new Date(10,10,10), new Date(10,10,10),"Robert Moses" );
            Person Jobs = new Person(new Date(10,10,10), new Date(10,10,10),"Steve Jobs" );
            Person Churchill = new Person(new Date(10,10,10), new Date(10,10,10),"Winston Churchill" );
            Person Hamilton = new Person(new Date(10,10,10), new Date(10,10,10),"Alexander Hamilton" );
            Person Einstein = new Person(new Date(10,10,10), new Date(10,10,10),"Albert Einstein" );

            Person Frank = new Person(new Date(10,10,10), new Date(10,10,10),"Anne Frank" );
            Person Mandela = new Person(new Date(10,10,10), new Date(10,10,10),"Nelson Mandela" );
            Person Ghandi = new Person(new Date(10,10,10), new Date(10,10,10),"Mahatma Ghandi" );
            Person Angelou = new Person(new Date(10,10,10), new Date(10,10,10),"Maya Angelou" );
            Person X = new Person(new Date(10,10,10), new Date(10,10,10),"Malcolm X" );


            // Create Book objects with a title, year published, and author
            Book book1 = new Book("1984", 1949, orwell);
            Book book2 = new Book("To Kill a Mockingbird", 1960, lee);
            Book book3 = new Book("Pride and Prejudice", 1813, austen);
            Book book4 = new Book("The Great Gatsby", 1925, fitzgerald);
            Book book5 = new Book("Moby-Dick", 1851, melville);

            //Create Biography objects with distinct authors and subjects
            Biography bio1 = new Biography("The Power Broker", 1974, melville, Moses);
            Biography bio2 = new Biography("Steve Jobs", 2011, orwell, Jobs);
            Biography bio3 = new Biography("Churchill: A Life", 1991, fitzgerald, Churchill);
            Biography bio4 = new Biography("Alexander Hamilton", 2004, lee, Hamilton);
            Biography bio5 = new Biography("Einstein: His Life and Universe", 2007, austen, Einstein);



            // Create Five Autobiographies
            Autobiography auto1 = new Autobiography("The Diary of a Young Girl", 1947, new Author(new Date(1929, 6, 12), new Date(1945, 3, 31), "Anne Frank", Frank)); // what da hell bruh what da hell
            Autobiography auto2 = new Autobiography("Long Walk to Freedom", 1994, new Author(new Date(1918, 7, 18), new Date(2013, 12, 5), "Nelson Mandela", Mandela));
            Autobiography auto3 = new Autobiography("The Story of My Experiments with Truth", 1927, new Author(new Date(1869, 10, 2), new Date(1948, 1, 30), "Mahatma Gandhi", Ghandi));
            Autobiography auto4 = new Autobiography("I Know Why the Caged Bird Sings", 1969, new Author(new Date(1928, 4, 4), new Date(2014, 5, 28), "Maya Angelou", Angelou));
            Autobiography auto5 = new Autobiography("Autobiography of Malcolm X", 1965, new Author(new Date(1925, 5, 19), new Date(1965, 2, 21), "Malcolm X", X));

            // Comparisons and Printing n shit

        }
    }