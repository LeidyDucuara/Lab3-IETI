package co.edu.escuelaing.ieti.usuario.data;

import jdk.jfr.Name;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class User {

    @Id
    private String id;
    private String mane;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private Date createdAt;

    public User(String id, String mane, String lastName, String email, Date createdAt) {
        this.id = id;
        this.mane = mane;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMane(){
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void update(User userDto) {
        id = userDto.getId();
        mane = userDto.getMane();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
        createdAt = userDto.getCreatedAt();
    }
}
