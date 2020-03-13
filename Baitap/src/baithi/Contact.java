package baithi;

public class Contact {
    String name;
    String Company;
    String Email;
    String phone;

    public Contact() {
    }

    public Contact(String name, String company, String email, String phone) {
        this.name = name;
        Company = company;
        Email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
