/**
 * Created by jeansmits on 26/05/15.
 */



public class Main {

    // Set up
    EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("RealDolmenPersistenceUnit");
    EntityManager entityManager =
            entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    // Ready to do stuff!
    // Tear down
    entityManager.getTransaction().commit();
    entityManager.close();
    entityManagerFactory.close();
}
