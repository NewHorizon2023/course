package TABA.question3;

/**
 * @author Xiangnan Liu
 * @date 2023-08-25 18:55
 */
public class Customer {
    private long id;
    private String fname;
    private String lname;
    private String country;
    private String email;

    public Customer(long id, String fname, String lname, String country, String email) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.country = country;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
