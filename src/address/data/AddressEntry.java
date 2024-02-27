package address.data;

/**
 * This class is the form the address entries will take in the book.
 * @author Ivan Williams
 *
 */
public class AddressEntry {

    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    /**
     * This method is a hardcoded example of an address entry.
     */
    public AddressEntry(){
        firstName = "Jane";
        lastName = "Doe";
        street = "Bakers Street";
        city = "New York";
        state = "New York";
        zip = 8543;
        phone = "(888) 535-2346";
        email = "janedoe@fmail.com";
    }

    /**
     * This method is for creating new entries including all relevant details.
     *
     * @param fName The first name
     * @param lName The last name
     * @param str The street name/number
     * @param st The state of the address
     * @param z The zip code of the address
     * @param ph The phone number of the person
     * @param em The email address of the person
     */
    public AddressEntry(String fName, String lName, String str, String c, String st, int z, String ph, String em){

        firstName = fName;
        lastName = lName;
        street = str;
        city = c;
        state = st;
        zip = z;
        phone = ph;
        email = em;

    }

    /**
     * Concatenates all relevant data into a block of text
     * @return A block formatted address book entry
     */
    public String toString(){

        return firstName+"\n"+lastName+"\n"+street+"\n"+city+", "+state+" "+zip+"\n"+phone+"\n"+email+"\n";
    }


    /**
     * Changes the entries first name
     * @param newFirstName name to change to
     */
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    /**
     * retrieves the entries first name
     * @return The entries first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Changes the entries last name
     * @param NewlastName name to change to
     */
    public void setLastName(String NewlastName) {
        this.lastName = NewlastName;
    }

    /**
     * retrieves the entries last name
     * @return The entries last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Changes the entries city
     * @param newCity name to change to
     */
    public void setCity(String newCity) {
        this.city = newCity;
    }

    /**
     * retrieves the entries city
     * @return The entries city
     */
    public String getCity() {
        return city;
    }

    /**
     * Changes the entries state
     * @param newState name to change to
     */
    public void setState(String newState) {
        this.state = newState;
    }

    /**
     * retrieves the entries state
     * @return The entries state
     */
    public String getState() {
        return state;
    }

    /**
     * Changes the entries street
     * @param newStreet name to change to
     */
    public void setStreet(String newStreet) {
        this.street = newStreet;
    }

    /**
     * retrieves the entries street address
     * @return The entries street address
     */
    public String getStreet() {
        return street;
    }

    /**
     * Changes the entries phone number
     * @param newPhone number to change to
     */
    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    /**
     * retrieves the entries phone number
     * @return The entries phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Changes the entries email address
     * @param newEmail email to change to
     */
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    /**
     * retrieves the entries email address
     * @return The entries email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Changes the entries zip code
     * @param newZip zip code to change to
     */
    public void setZip(int newZip) {
        this.zip = newZip;
    }

    /**
     * retrieves the entries zip code
     * @return The entries zip code
     */
    public int getZip() {
        return zip;
    }
}

