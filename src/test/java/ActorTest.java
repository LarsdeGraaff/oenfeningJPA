import org.junit.Test;

/**
 * Created by jeansmits on 27/05/15.
 */
public class ActorTest extends AbstractBookTest {
    @Test
    public void actorTestCanBeSaved(){
        Actor alPacino = new Actor("Al ","Pacino",Geslacht.man);
        entityManager.persist(alPacino);

    }

}
