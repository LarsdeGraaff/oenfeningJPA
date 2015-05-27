import org.junit.Test;

import javax.persistence.EntityManager;

/**
 * Created by jeansmits on 27/05/15.
 */
public class FilmTest extends AbstractBookTest{
    @Test
    public void filmTestCanBeSaved(){
        Film scarface = new Film("Scarface",2,Genre.actie);
        entityManager.persist(scarface);

    }

}
