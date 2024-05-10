import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class BookControllerTest {

    @org.junit.jupiter.api.Test
    void getAllBooksWithCategory() {
        //given
        List<Book> books = prepareBookData();
        BookRepository bookRepository = mock(BookRepository.class);
        BookController bookController = new BookController(bookRepository);
        given(bookRepository.getAllBooks()).willReturn(books);

        //when
        List<Book> bookList = bookController.getAllBooksWithCategory();

        //then
        assertThat(bookList, hasSize(4));
    }

    @org.junit.jupiter.api.Test
    void getAllBooksWithoutCategory() {
        //given
        BookRepository bookRepository = mock(BookRepository.class);
        BookController bookController = new BookController(bookRepository);
        given(bookRepository.getAllBooks()).willReturn(Collections.emptyList());

        //when
        List<Book> bookList = bookController.getAllBooksWithCategory();

        //then
        assertThat(bookList, hasSize(0));
    }

    @org.junit.jupiter.api.Test
    void getAllActionBooks() {
        //given
        List<Book> books = prepareBookData();
        BookRepository bookRepository = mock(BookRepository.class);
        BookController bookController = new BookController(bookRepository);
        given(bookRepository.getAllBooks()).willReturn(books);

        //when
        List<Book> bookList = bookController.getAllActionBooks();

        //then
        assertThat(bookList, hasSize(2));
    }

    @org.junit.jupiter.api.Test
    void getAllFictionBooks() {
        //given
        List<Book> books = prepareBookData();
        BookRepository bookRepository = mock(BookRepository.class);
        BookController bookController = new BookController(bookRepository);
        given(bookRepository.getAllBooks()).willReturn(books);

        //when
        List<Book> bookList = bookController.getAllFictionBooks();

        //then
        assertThat(bookList, hasSize(1));
    }

    @org.junit.jupiter.api.Test
    void getAllDramaBooks() {
        //given
        List<Book> books = prepareBookData();
        BookRepository bookRepository = mock(BookRepository.class);
        BookController bookController = new BookController(bookRepository);
        given(bookRepository.getAllBooks()).willReturn(books);

        //when
        List<Book> bookList = bookController.getAllDramaBooks();

        //then
        assertThat(bookList, hasSize(1));
    }

    @org.junit.jupiter.api.Test
    void getAllRomanceBooks() {
        //given
        List<Book> books = prepareBookData();
        BookRepository bookRepository = mock(BookRepository.class);
        BookController bookController = new BookController(bookRepository);
        given(bookRepository.getAllBooks()).willReturn(books);

        //when
        List<Book> bookList = bookController.getAllRomanceBooks();

        //then
        assertThat(bookList, hasSize(0));
    }

    private List<Book> prepareBookData() {
        Book b1 = new Book("Komórka", Book.Category.Action);
        Book b2 = new Book("Biały śnieg", Book.Category.Action);
        Book b3 = new Book("Karaluchy", Book.Category.Fiction);
        Book b4 = new Book("Szary cefal", Book.Category.Drama);

        return Arrays.asList(b1, b2, b3, b4);
    }

    @org.junit.jupiter.api.Test
    void addBook() {
        //given
        BookRepository bookRepository = mock(BookRepository.class);
        BookController bookController = new BookController(bookRepository);
        given(bookRepository.save(Mockito.any(Book.class))).willReturn(new Book("Lolita"));

        //when
        Book book = bookController.addBook(new Book());

        //then
        Assertions.assertEquals(book.getTitle(), "Lolita");
    }
}
