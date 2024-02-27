package address;

import address.AddressBook;

import address.data.AddressEntry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {


    @Test
    void testAdd() {
        AddressBook testBook = new AddressBook();
        AddressEntry testEntry = new AddressEntry("John", "Doe", "Bakers St", "New York", "NY", 8543, "(888) 535-2346", "johndoe@fmail.com");
        testBook.add(testEntry);

        assertEquals(testEntry, testBook.find("Doe"));
    }

    @Test
    void testRemove() {
        AddressBook testBook = new AddressBook();
        AddressEntry testEntry = new AddressEntry("John", "Doe", "Bakers St", "New York", "NY", 8543, "(888) 535-2346", "johndoe@fmail.com");
        testBook.add(testEntry);
        testBook.remove(testEntry);

        assertNotEquals(testEntry, testBook.find("Doe"));
    }

    @Test
    void testFind() {
        AddressBook testBook = new AddressBook();
        AddressEntry testEntry = new AddressEntry("John", "Doe", "Bakers St", "New York", "NY", 8543, "(888) 535-2346", "johndoe@fmail.com");
    }

    @Test
    void testListAlphabetized() {
    }

    @Test
    void testLoadFromFile() {
    }
}