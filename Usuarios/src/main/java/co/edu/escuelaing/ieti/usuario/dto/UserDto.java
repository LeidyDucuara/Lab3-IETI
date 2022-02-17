package co.edu.escuelaing.ieti.usuario.dto;

public class UserDto {

    private String mane;
    private String lastName;
    private String email;

    public UserDto(String mane, String lastName, String email) {
        this.mane = mane;
        this.lastName = lastName;
        this.email = email;
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
}
