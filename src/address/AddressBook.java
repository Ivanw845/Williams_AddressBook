package address;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;


import java.io.IOException;
import java.util.*;

import address.data.AddressEntry;


/**
 * This class is the address book that stores all the addresses for the user.
 *
 * @author Ivan Williams
 */
public class AddressBook {

    static LinkedList<AddressEntry> addressEntryList = new LinkedList<>();

    /**
     * This method prints out the list of address entries in the linked list
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

    /**
     * Removes an address entry from the address book.
     */
    public void remove(AddressEntry addressEntry) {
        addressEntryList.remove(addressEntry);
    }


    /**
     * Finds and returns an address entry based on the last name
     */
    public AddressEntry find(String lastName) {

        for (AddressEntry entry : addressEntryList) {
            if (entry.getLastName().equalsIgnoreCase(lastName)) {
                return entry;
            }
        }
        return null;
    }

    /**
     * Lists address entries in alphabetical order based on last names
     */
    public void listAlphabetized() {

        List<AddressEntry> sortedList = new ArrayList<>(addressEntryList);
        sortedList.sort(Comparator.comparing(AddressEntry::getLastName));

        for (int i = 0; i < sortedList.size(); i++) {
            AddressEntry addressEntry = sortedList.get(i);
            System.out.println("\n" + (i + 1) + ": " + addressEntry.toString());
        }
    }


    /**
     * Loads address entries from a file into the address book
     * @param filePath the path to trace for the file
     */
    public void loadFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Split the line based on the delimiter
                String[] fields = line.split(",");

                // Check if the line has the expected number of fields
                if (fields.length == 8) { // firstName, lastName, street, city, state, zip, phone, email

                    // Extract fields
                    String firstName = fields[0].trim();
                    String lastName = fields[1].trim();
                    String street = fields[2].trim();
                    String city = fields[3].trim();
                    String state = fields[4].trim();
                    int zip = Integer.parseInt(fields[5].trim());
                    String phone = fields[6].trim();
                    String email = fields[7].trim();

                    // Create an AddressEntry object
                    AddressEntry addressEntry = new AddressEntry(firstName, lastName, street, city, state, zip, phone, email);

                    // Add the AddressEntry to the addressEntryList
                    addressEntryList.add(addressEntry);
                } else {
                    System.out.println("Invalid line: " + line);
                }
            }
        } catch (IOException e) {

            e.printStackTrace(); // Exception handler
            System.out.println("Current Working Directory: " + System.getProperty("user.dir"));

        }
    }
}
