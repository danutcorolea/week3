package onlinestore;

public class Customer {
    String firstName;
    String lastName;
    double cnp;
    Address address;

    public Customer( String firstName,String lastName, double cnp, Address address)
    {
    this.firstName=firstName;
    this.lastName=lastName;
    this.cnp=cnp;
    this.address=address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
