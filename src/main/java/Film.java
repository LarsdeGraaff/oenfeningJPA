import javax.persistence.*;

@Entity
public class Film {
    @Id
    @GeneratedValue
    private Integer filmId;
    private String title;
    private int length;
    @Enumerated(EnumType.STRING)
    private Genre genre;

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
}
