import java.util.List;

/**
 * Created by jeansmits on 26/05/15.
 */
public interface BookRepository {
    List<Book> findAllBooks();
}
