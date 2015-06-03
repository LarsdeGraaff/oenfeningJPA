import org.junit.Test;

import java.util.ArrayList;

public class FilmDirectorTest extends AbstractBookTest{
    @Test
    public void film_director(){
        Film scarface = new Film("Scarface",2,Genre.actie);
        entityManager.persist(scarface);

        Director directors=new Director("spielberg");
        entityManager.persist(directors);

        scarface.setDirector(directors);

        Actor alPacino = new Actor("Al ","Pacino",Geslacht.man);
        Actor steven = new Actor("Steven ","Bauer",Geslacht.man);
        Actor vrouw = new Actor("Madame","Sniff",Geslacht.vrouw);
        entityManager.persist(alPacino);
        entityManager.persist(steven);
        entityManager.persist(vrouw);

        scarface.addActor(alPacino);
        scarface.addActor(vrouw);
        scarface.addActor(steven);
    }

    @Test
    public void test(){
        Film f = new Film("American gangster",2,Genre.actie);
        entityManager.persist(f);
        Film f2=entityManager.find(Film.class,1);
        f.getActors();
        f.getDirector();
    }

    @Test
    public void actor_film(){
        Actor alPacino = new Actor("Al", "Pacino",Geslacht.man);
        entityManager.persist(alPacino);

        Film scarface = new Film("Scarface",2,Genre.actie);
        Film godfather = new Film("Godfather",6,Genre.actie);
        entityManager.persist(scarface);
        entityManager.persist(godfather);

        alPacino.addFilm(scarface);
        alPacino.addFilm(godfather);
    }
}
