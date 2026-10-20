package Library_Q4;
import java.util.HashMap;

public class Library {

    private HashMap<String, Book> books;

    Library() {
        books = new HashMap<>();
    }


    public void addBook(Book book) {

        if (books.containsKey(book.getIsbn())) {
            System.out.println("Book with this ISBN already exists.");
        } else {
            books.put(book.getIsbn(), book);
            System.out.println("Book added successfully.");
        }
    }


    public void removeBook(String isbn) {

        if (books.containsKey(isbn)) {
            books.remove(isbn);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }


    public void displayBooks() {

        for (Book book : books.values()) {
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Title: " + book.getTitle());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("--------------------");
        }
    }
}

