package name.mjw.hellotomee.presentation;

import name.mjw.hellotomee.application.BookService;
import name.mjw.hellotomee.entities.Book;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@Named
public class BookBean {

    @Inject
    private BookService bookService;
    private List<Book> booksAvailable;
    private String bookTitle;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public List<Book> getBooksAvailable() {
        return booksAvailable;
    }

    public void setBooksAvailable(List<Book> booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    public String fetchBooks()
    {
        booksAvailable=bookService.getAllBooks();
        return "success";
    }

    public String add()
    {
        Book book = new Book();
        book.setBookTitle(bookTitle);
        bookService.addBook(book);
        return "success";
    }
}
