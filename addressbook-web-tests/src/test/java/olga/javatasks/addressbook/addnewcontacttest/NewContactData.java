package olga.javatasks.addressbook.addnewcontacttest;

public class NewContactData {
    private final String firstname;
    private final String lastname;
    private final String address;
    private final String mobile;
    private final String email;

    public NewContactData(String firstname, String lastname, String address, String mobile, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}
