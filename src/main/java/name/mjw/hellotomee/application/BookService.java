package name.mjw.hellotomee.application;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaQuery;

import name.mjw.hellotomee.entities.Book;

import java.util.List;

@Stateless
public class BookService {

    @PersistenceContext(unitName = "book-pu")
    private EntityManager entityManager;

    public void addBook(Book book)
    {
      entityManager.persist(book);
    }

    public List<Book> getAllBooks()
    {
        CriteriaQuery<Book> cq = entityManager.getCriteriaBuilder().createQuery(Book.class);
        cq.select(cq.from(Book.class));
        return entityManager.createQuery(cq).getResultList();
    }
}