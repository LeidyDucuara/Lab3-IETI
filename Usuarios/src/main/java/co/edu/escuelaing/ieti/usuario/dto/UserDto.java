package co.edu.escuelaing.ieti.usuario.dto;

public class UserDto {

    private String mane;
    private String lastName;
    private String email;
    private String password;

    public UserDto(String mane, String lastName, String email, String password) {
        this.mane = mane;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
