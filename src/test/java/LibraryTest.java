import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;

    @Before
    public void before(){
        library = new Library("Libros", 3);
        book = new Book("The day of the Triffids", "John Wyndham", "Sci-Fi");
        book2 = new Book("The Picture of Dorian Gray", "Oscar Wilde", "Sci-Fi");
    }

    @Test
    public void bookCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void addBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddMoreBooks() {
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canLendBook(){
        library.addBook(book);
        library.addBook(book2);
        assertEquals(2, library.bookCount());
        library.lendBook();
        assertEquals(1, library.bookCount());
    }
}
