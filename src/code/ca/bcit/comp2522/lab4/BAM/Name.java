package ca.bcit.comp2522.lab4.BAM;

public class Name implements Printable {

    private final String first;
    private final String last;
    private static final int MAX_NAME_LENGTH = 50;


    public Name(final String first, final String last) {
        lastValidation(last);
        firstValidation(first);

        this.first = first;
        this.last = last;
    }
    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }
    private static void firstValidation(final String first){
        if (first == null || first.isBlank()|| first.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException("First name does not meet the requirements");
        }

    }
    private static void lastValidation(final String last){
        if (last == null || last.isBlank()|| last.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException("Last name does not meet the requirements");
        }
    }

    @Override
    public void display() {
        StringBuilder str;

        str = new StringBuilder();
        str.append("First name: ")
                .append(first)
                .append("Last name: ")
                .append(last);

        System.out.print(str.toString());

    }
}
