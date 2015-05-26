import javax.persistence.EntityManager;
import java.util.List;


import static junit.framework.Assert.assertEquals;

/**
 * Created by jeansmits on 26/05/15.
 */


public class BookTest {

    private EntityManager em;
    @BookTest
    public void testOurLogic() {
        BookRepository bookRepository = new BookRepositoryBean(em);
        List<Book> books = bookRepository.findAllBooks();
        assertEquals(2, books.size());
    }


}
