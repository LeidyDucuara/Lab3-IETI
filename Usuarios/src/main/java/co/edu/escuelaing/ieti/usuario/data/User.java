package co.edu.escuelaing.ieti.usuario.data;

public class User {

    private String id;
    private String mane;
    private String lastName;
    private String email;
    private String createdAt;

    public User(String id, String mane, String lastName, String email, String createdAt) {
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

    public String getMane() {
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
