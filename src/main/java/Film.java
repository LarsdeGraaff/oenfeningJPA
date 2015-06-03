import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Film {
    @Id
    @GeneratedValue
    private Integer filmId;
    private String title;
    private int length;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @ManyToOne
    private Director director;
    @ManyToMany
    private List<Actor> actors = new ArrayList<>();

    public Film(String title, int length, Genre genre) {
        this.title = title;
        this.length = length;
        this.genre = genre;
    }

    public Film() {
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;

    }

    public void addActor(Actor a) {
        this.actors.add(a);
    }
}
