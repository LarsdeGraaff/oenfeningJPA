import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jeansmits on 26/05/15.
 */
@Entity
public class Passenger implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
     private byte[] picture;
    @Column(name = "first_name", length = 50)
    private String firstName;
    private String lastName;
    private String Age;
    private int frequentFlyerMiles;
    @Enumerated(EnumType.STRING)
    private PassengerType type;

    public Passenger( byte[] picture, String firstName, String lastName, String age, int frequentFlyerMiles) {
        this.picture = picture;
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public Passenger() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public int getFrequentFlyerMiles() {
        return frequentFlyerMiles;
    }

    public void setFrequentFlyerMiles(int frequentFlyerMiles) {
        this.frequentFlyerMiles = frequentFlyerMiles;
    }
}
