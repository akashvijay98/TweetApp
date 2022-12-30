package twitter.tweetingapp.tweetapp.domain;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "users")

public class Users implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id")
    private UUID id;

    private String name;
    private String country;

    public Users(){}

    public Users(UUID id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }




    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
