package address;
import address.data.AddressEntry;

/** main AddressBookApplication: purpose is to invoke some methods of the Menu class
 *
 * @author Ivan Williams
 * @version 1.0
 * @since February 2024, JDK 5.0
 **/

class AddressBookApplication {

    public static void main(String[] args) {

        AddressBook ab = new AddressBook();

        initAddressBookExercise();

        Menu menu = new Menu();

        while (true) {
            menu.displayMenu();
            String choice = menu.getUserChoice();
            switch (choice.toLowerCase()){
                case "a":
                    System.out.print("enter the filename: ");
                    String filename = menu.getUserChoice();
                    ab.loadFromFile(filename);
                    break;
                case "b":
                    addEntry();
                    break;
                case "c":
                    removeEntry(ab);
                    break;
                case "d":
                    findEntry(ab);
                    break;
                case "e":
                    listEntries(ab);
                    break;
                case "f":
                    System.out.println("Exiting the Address Book Program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice, Try Again");
                    break;
            }
        }


    }

    /**
     * initializes the address book with a hardcoded entry
     */
    public static void initAddressBookExercise(){

       // AddressEntry part1 = new AddressEntry(Menu.prompt_FirstName(), Menu.prompt_LastName(), Menu.prompt_Street(), Menu.prompt_City(), Menu.prompt_State(), Menu.prompt_Zip(), Menu.prompt_Telephone(), Menu.prompt_Email());
        AddressEntry part2 = new AddressEntry("John", "Deer", "Mission Str", "Fremont","CA", 85432, "(888) 535-2345", "johndoe@fmail.com" );
        //AddressBook.add(part1);
        AddressBook.add(part2);
       // ab.list();
    }

    /**
     * adds new entry to the address book
     */
    private static void addEntry(){
        AddressEntry newEntry = new AddressEntry(
                Menu.prompt_FirstName(),
                Menu.prompt_LastName(),
                Menu.prompt_Street(),
                Menu.prompt_City(),
                Menu.prompt_State(),
                Menu.prompt_Zip(),
                Menu.prompt_Telephone(),
                Menu.prompt_Email()
        );
        AddressBook.add(newEntry);
        System.out.println("New Entry Added Successfully");
    }

    /**
     * Removes an address entry from the address book
     * @param ab The address book from which to remove the entry
     */
    private static void removeEntry(AddressBook ab){
        String lastNameToRemove = Menu.prompt_LastName();
        AddressEntry entryToRemove = ab.find(lastNameToRemove);

        if(entryToRemove != null){
            ab.remove(entryToRemove);
            System.out.println("Entry removed successfully");
        }else {
            System.out.println("Entry not found");
        }
    }


    /**
     * Finds an address entry by last name and displays it
     * @param ab the address book to search for the entry from
     */
    private static void findEntry(AddressBook ab){

        String lastNameTarget = Menu.prompt_LastName();

        AddressEntry foundEntry = ab.find(lastNameTarget);

        if(foundEntry != null){
            System.out.println("Found entry:" + foundEntry.toString());
        }else {
            System.out.println("Entry not found.");
        }
    }

    /**
     * Lists all address entries in alphabetic order by last name
     * @param ab the address book to list out, alphabetized
     */
    private static void listEntries(AddressBook ab){
        ab.listAlphabetized();
    }




}



