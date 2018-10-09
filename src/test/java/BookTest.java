import org.junit.Before;
import org.junit.Test;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("The day of the Triffids", "John Wyndham", "Sci-Fi");
    }
}
