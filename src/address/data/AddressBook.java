package address.data;
import java.util.LinkedList;
import address.data.AddressEntry;


/**
 * This class is the address book that stores all the addresses for the user.
 *
 * @author Ivan Williams
 */
public class AddressBook {

    static LinkedList<AddressEntry> addressEntryList = new LinkedList<>();

    /**
     * This method prints out the list of address entries in the linked list.
     * @
     */
    public void list(){
        for (AddressEntry addressEntry : addressEntryList) {

            System.out.println(addressEntry.toString());
        }

    }

    /**
     * This method adds an entry into the address book.
     * @param ab The entry to be placed into the book.
     */
   public static void add(AddressEntry ab){
        addressEntryList.add(ab);
   }
}
