import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by jeansmits on 3/06/15.
 */
@Entity
public class Director {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Director() {
    }

    public Director(String name) {
       this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
