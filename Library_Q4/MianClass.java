package Library_Q4;

public class MianClass {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book(
                "Robert C. Martin",
                "Clean Code",
                "9780132350884"
        );

        Book b2 = new Book(
                "James Gosling",
                "Java Programming",
                "1234567890"
        );

        Book b3 = new Book(
                "Robert C. Martin",
                "Clean Code",
                "9780132350884"
        );

        library.addBook(b1);
        library.addBook(b2);

        // Duplicate ISBN
        library.addBook(b3);

//        System.out.println("\nBooks in Library:");
//        library.displayBooks();
//
//        // Remove
//        library.removeBook("9780132350884");
//

    }
}
