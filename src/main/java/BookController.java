import java.util.List;
import java.util.stream.Collectors;

public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    List<Book> getAllBooksWithCategory() {
        return bookRepository.getAllBooks().stream()
                .filter(Book::hasCategory)
                .collect(Collectors.toList());
    }

    List<Book> getAllActionBooks() {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getCategory() == Book.Category.Action)
                .collect(Collectors.toList());
    }

    List<Book> getAllFictionBooks() {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getCategory() == Book.Category.Fiction)
                .collect(Collectors.toList());
    }

    List<Book> getAllDramaBooks() {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getCategory() == Book.Category.Drama)
                .collect(Collectors.toList());
    }

    List<Book> getAllRomanceBooks() {
        return bookRepository.getAllBooks().stream()
                .filter(book -> book.getCategory() == Book.Category.Romance)
                .collect(Collectors.toList());
    }

    Book addBook(Book book) {
        return bookRepository.save(book);
    }
}
