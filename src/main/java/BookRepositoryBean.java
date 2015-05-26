import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by jeansmits on 26/05/15.
 */
public class BookRepositoryBean implements BookRepository{
    private EntityManager em;
    public BookRepositoryBean(EntityManager em) {
        this.em = em;
    }
    @Override
    public List<Book> findAllBooks() {
        return em.createQuery("select b from Book b",
                Book.class).getResultList();
    }
}
