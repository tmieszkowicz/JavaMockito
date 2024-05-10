import java.util.Arrays;
import java.util.List;

public class BookRepositoryStub implements BookRepository {

    @Override
    public List<Book> getAllBooks() {
        Book b1 = new Book("Komórka", Book.Category.Action);
        Book b2 = new Book("Biały śnieg", Book.Category.Action);
        Book b3 = new Book("Karaluchy", Book.Category.Fiction);
        Book b4 = new Book("Szary cefal", Book.Category.Drama);

        return Arrays.asList(b1, b2, b3, b4);
    }

    @Override
    public Book save(Book book) {
        return book;
    }
}
