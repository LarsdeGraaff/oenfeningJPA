
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;



import static junit.framework.Assert.assertEquals;

public class BookTest {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    //private EntityManager em;

    @BeforeClass
    public static void initializeEntityManagerFactory(){
        entityManagerFactory = Persistence.createEntityManagerFactory("RealDolmenPersistenceUnit");
    }

    @AfterClass
    public static void destroyEntityManagerFactory() {
        entityManagerFactory.close();
    }

    @Before
    public void initializeEntityManager(){
        entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    @After
    public void destroyEntityManager(){
        entityManager.getTransaction().commit();
        entityManager.close();
    }


    @Test
    public void testOurLogic() {

        BookRepository bookRepository = new BookRepositoryBean(entityManager);
        List<Book> books = bookRepository.findAllBooks();
        assertEquals(2, books.size());


    }


}
