
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;



import static junit.framework.Assert.assertEquals;

public class BookTest extends AbstractBookTest {

    //private EntityManager em;


    @Test
    public void testOurLogic() {

        BookRepository bookRepository = new BookRepositoryBean(entityManager);
        List<Book> books = bookRepository.findAllBooks();
        assertEquals(2, books.size());


    }

    @Test
    public void testReturnExactlyTwoBooks() throws Exception {
        List<Book> books= entityManager.createQuery("Select b from Book b", Book.class).getResultList();
        assertEquals(2, books.size());

    }

}
