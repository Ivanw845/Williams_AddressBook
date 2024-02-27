package address;
import address.data.AddressBook;
import address.data.AddressEntry;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu class
 *
 * @author Ivan Williams
 * @version 1.0
 * @since February 2024, JDK 5.0
 **/

class AddressBookApplication {

    public static void main(String args[]) {

        // Menu is a class with a bunch of static methods --so we do not
        // need to create an instance to invoke those methods
        //Call ALL the Menu prompts
       /* Menu.prompt_FirstName();

        Menu.prompt_LastName();

        Menu.prompt_Street();

        Menu.prompt_City();

        Menu.prompt_State();

        Menu.prompt_Zip();

        Menu.prompt_Telephone();

        Menu.prompt_Email();


        */

        AddressBook ab = new AddressBook();

        initAddressBookExercise(ab);

    }

    public static void initAddressBookExercise(AddressBook ab){

        AddressEntry part1 = new AddressEntry();
        AddressEntry part2 = new AddressEntry("John", "Deer", "Mission Str", "CA", 85432, "(888) 535-2345", "johndoe@fmail.com" );
        AddressBook.add(part1);
        AddressBook.add(part2);
        ab.list();
    }

}


