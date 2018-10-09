import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower("Juan");
        library = new Library("Libros", 10);
        book = new Book("The Picture of Dorian Gray", "Oscar Wilde", "Sci-Fi");
    }

    @Test
    public void hasBooks(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canBorrowBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
        borrower.borrowBook(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.bookCount());
    }
}
