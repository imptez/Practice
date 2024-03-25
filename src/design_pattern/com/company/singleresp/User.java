package design_pattern.com.company.singleresp;

import java.time.LocalDate;

//User entity
public class User {

    private String name;

    private String email;

    private String address;

    private LocalDate birthday;

    private String firstName;

    private String lastName;

    public User() {

    }

    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", address=" + address + "]";
    }

    public void setBirthday(LocalDate of) {
        this.birthday = of;
    }

    public void setFirstName(String ron) {
        this.firstName = ron;
    }

    public void setLastName(String swanson) {
        this.lastName = swanson;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }
}