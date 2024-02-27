package address;

import java.util.InputMismatchException;
import java.util.Scanner; // Import the Scanner Class


/**
 * This class contains all of the necessary menu functionality.
 */
public class    Menu {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Closes the scanner, it's not used but should be here anyway
     */
    public static void closeScanner() {
        scanner.close();
    }

    /**
     * Displays the menu options for the address book application.
     */
    public void displayMenu() {
        System.out.println("+---------------------------------+");
        System.out.println("Please enter your menu selection");
        System.out.println("A) Loading From File");
        System.out.println("B) Addition");
        System.out.println("C) Removal");
        System.out.println("D) Find");
        System.out.println("E) Listing");
        System.out.println("F) Quit");
        System.out.println("+---------------------------------+");
    }


    /**
     * retrieves user menu choice
     * @return the selected menu choice
     * */
    public static String getUserChoice() {
        return scanner.nextLine();
    }

    /**
     * Prompts the users first name
     * @return the user entered first name
     */
    public static String prompt_FirstName(){
        System.out.println("\nEnter first name: ");

        return scanner.nextLine();
    }

    /**
     * Prompts the users last name
     * @return the user entered last name
     */
    public static String prompt_LastName(){
        System.out.println("\nEnter last name: ");

        return scanner.nextLine();
    }

    /**
     * Prompts the users street address
     * @return the user entered street address
     */
    public static String prompt_Street(){
        System.out.println("\nEnter street name: ");

        return scanner.nextLine();
    }

    /**
     * Prompts the users city
     * @return the user entered city
     */
    public static String prompt_City(){
        System.out.println("\nEnter city: ");

        return scanner.nextLine();
    }

    /**
     * Prompts the users state
     * @return the user entered state
     */
    public static String prompt_State(){
        System.out.println("\nEnter State: ");

        return scanner.nextLine();
    }

    /**
     * Prompts the users zip code
     * @return the user entered zip code
     */
    public static Integer prompt_Zip(){
        Scanner mynum = new Scanner(System.in);
        System.out.println("\nEnter Zip code: ");

        try{
            return mynum.nextInt();
        } catch(InputMismatchException ignored){
            System.out.println("Invalid input for zip code. Please enter a valid integer.\n");
            return prompt_Zip(); // Recursive call if the input is not a valid integer
        }

    }

    /**
     * Prompts the users phone #
     * @return the user entered phone #
     */
    public static String prompt_Telephone(){
        System.out.println("\nEnter phone #: ");

        return scanner.nextLine();
    }

    /**
     * Prompts the users email address
     * @return the user entered email address
     */
    public static String prompt_Email(){
        System.out.println("\nEnter Email: ");

        return scanner.nextLine();
    }


}

