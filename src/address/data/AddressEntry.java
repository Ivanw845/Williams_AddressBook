package address.data;
import java.util.LinkedList;

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
    public AddressEntry(String fName, String lName, String str, String st, int z, String ph, String em){

        firstName = fName;
        lastName = lName;
        street = str;
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

        return firstName+"\n"+lastName+"\n"+street+"\n"+state+"\n"+zip+"\n"+phone+"\n"+email+"\n\n";
    };


    /**
     * Changes the entries first name
     * @param firstName name to change to
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
     * @param lastName name to change to
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * @param city name to change to
     */
    public void setCity(String city) {
        this.city = city;
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
     * @param state name to change to
     */
    public void setState(String state) {
        this.state = state;
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
     * @param street name to change to
     */
    public void setStreet(String street) {
        this.street = street;
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
     * @param phone number to change to
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * @param email email to change to
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @param zip zip code to change to
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * retrieves the entries zip code
     * @return The entries zip code
     */
    public int getZip() {
        return zip;
    }
}

