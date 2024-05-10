import java.util.List;

public interface BookRepository {
    List<Book> getAllBooks();

    Book save(Book book);
}
