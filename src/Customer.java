public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private long telNumber;

    public Customer(int id, String firstName, String lastName, long telNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(long telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public String toString(){

        return "Customer ["+getId()+", firstName= "+getFirstName()+", lastName= "+getLastName()+", telNumber="+getTelNumber()+"]";
    }
}

