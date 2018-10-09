import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> collection;
    private int capacity;

    public Library(String name, int capacity) {
        this.name = name;
        this.collection = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return collection.size();
    }

    public void addBook(Book book) {
        if(capacity > bookCount()) collection.add(book);
    }

    public Book lendBook() {
        return collection.remove(0);
    }
}
