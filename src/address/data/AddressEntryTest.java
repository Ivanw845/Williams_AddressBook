package address.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressEntryTest {

    @Test
    void testToString() {
        AddressEntry addressEntry = new AddressEntry("John", "Doe", "Bakers St", "New York", "NY", 8543, "(888) 535-2346", "johndoe@fmail.com");
        String expectedToString = "John\nDoe\nBakers St\nNew York, NY 8543\n(888) 535-2346\njohndoe@fmail.com\n";
        assertEquals(expectedToString, addressEntry.toString());

    }

    @Test
public void testAll(){
        AddressEntry addressEntry = new AddressEntry();

        addressEntry.setFirstName("John");
        addressEntry.setLastName("Doe");
        addressEntry.setStreet("Bakers St");
        addressEntry.setCity("New York");
        addressEntry.setState("New York");
        addressEntry.setZip(8543);
        addressEntry.setPhone("(888) 535-2346");
        addressEntry.setEmail("janedoe@fmail.com");


        assertEquals("John", addressEntry.getFirstName());
        assertEquals("Doe", addressEntry.getLastName());
        assertEquals("Bakers St", addressEntry.getStreet());
        assertEquals("New York", addressEntry.getCity());
        assertEquals("New York", addressEntry.getState());
        assertEquals(8543, addressEntry.getZip());
        assertEquals("(888) 535-2346", addressEntry.getPhone());
        assertEquals("janedoe@fmail.com", addressEntry.getEmail());

        addressEntry.setFirstName("Ferris");
        addressEntry.setLastName("Bueller");
        addressEntry.setStreet("370 Beech St.");
        addressEntry.setCity("Chicago");
        addressEntry.setState("Illinois");
        addressEntry.setZip(60007);
        addressEntry.setPhone("(773) 719-1846");
        addressEntry.setEmail("Bueller@fmail.org");

        assertEquals("Ferris", addressEntry.getFirstName());
        assertEquals("Bueller", addressEntry.getLastName());
        assertEquals("370 Beech St.", addressEntry.getStreet());
        assertEquals("Chicago", addressEntry.getCity());
        assertEquals("Illinois", addressEntry.getState());
        assertEquals(60007, addressEntry.getZip());
        assertEquals("(773) 719-1846", addressEntry.getPhone());
        assertEquals("Bueller@fmail.org", addressEntry.getEmail());


    }
}
