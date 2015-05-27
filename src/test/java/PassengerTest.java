import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by jeansmits on 27/05/15.
 */
public class PassengerTest extends AbstractBookTest{
    @Test
    public void testPassengerCanBeSafed(){

        Passenger p =new Passenger(null,"youri","tielemans","18",10000 );
        Passenger p2 =new Passenger(null,"Luc","Nilis","48",25000 );
        entityManager.persist(p);
        entityManager.persist(p2);

        p.setLastName("HELD TIELEMANS");
        Passenger pssngrDB = entityManager.find(Passenger.class,1);
        assertEquals(pssngrDB.getLastName(), p.getLastName());
    }

    @Test
    public void testReturnExactlyTwoPassengers() throws Exception {
        List<Passenger> ps= entityManager.createQuery("Select b from Passenger b", Passenger.class).getResultList();
        assertEquals(2, ps.size());

    }
}
