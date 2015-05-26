
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;



import static junit.framework.Assert.assertEquals;

/**
 * Created by jeansmits on 26/05/15.
 */


public class BookTest {
    private Logger logger = LoggerFactory.getLogger(BookTest.class);

    private EntityManager em;
    @Test
    public void testOurLogic() {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("RealDolmenPersistenceUnit");
        EntityManager em =
                entityManagerFactory.createEntityManager();
        em.getTransaction().

                begin();

        BookRepository bookRepository = new BookRepositoryBean(em);
        List<Book> books = bookRepository.findAllBooks();
        assertEquals(2, books.size());

        em.getTransaction().

                commit();

        em.close();
        entityManagerFactory.close();

    }


}
