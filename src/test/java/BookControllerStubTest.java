import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

class BookControllerStubTest {

    @org.junit.jupiter.api.Test
    void getAllBooksWithCategory() {
        //given
        BookRepository bookRepository = new BookRepositoryStub();
        BookController bookController = new BookController(bookRepository);

        //when
        List<Book> bookList = bookController.getAllBooksWithCategory();

        //then
        assertThat(bookList,hasSize(4));
    }

    @org.junit.jupiter.api.Test
    void getAllActionBooks() {
        //given
        BookRepository bookRepository = new BookRepositoryStub();
        BookController bookController = new BookController(bookRepository);

        //when
        List<Book> bookList = bookController.getAllActionBooks();

        //then
        assertThat(bookList,hasSize(2));
    }

    @org.junit.jupiter.api.Test
    void getAllFictionBooks() {
        //given
        BookRepository bookRepository = new BookRepositoryStub();
        BookController bookController = new BookController(bookRepository);

        //when
        List<Book> bookList = bookController.getAllFictionBooks();

        //then
        assertThat(bookList,hasSize(1));
    }

    @org.junit.jupiter.api.Test
    void getAllDramaBooks() {
        //given
        BookRepository bookRepository = new BookRepositoryStub();
        BookController bookController = new BookController(bookRepository);

        //when
        List<Book> bookList = bookController.getAllDramaBooks();

        //then
        assertThat(bookList,hasSize(1));
    }

    @org.junit.jupiter.api.Test
    void getAllRomanceBooks() {
        //given
        BookRepository bookRepository = new BookRepositoryStub();
        BookController bookController = new BookController(bookRepository);

        //when
        List<Book> bookList = bookController.getAllRomanceBooks();

        //then
        assertThat(bookList,hasSize(0));
    }
}