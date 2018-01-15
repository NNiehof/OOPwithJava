
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NNiehof
 */
public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        PhoneSearch phonebook = new PhoneSearch();

        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
        
        while (true) {
            System.out.println("command: ");
            String command = reader.nextLine();
            
            if (command.equals("1")) {
                System.out.println("whose number: ");
                String person = reader.nextLine();
                System.out.println("number: ");
                String number = reader.nextLine();
                
                phonebook.addPhone(person, number);
            }
            else if (command.equals("2")) {
                System.out.println("whose number: ");
                String person = reader.nextLine();
                
                String foundNumber = phonebook.searchNumber(person);
                if (foundNumber.contains("not found")) {
                    System.out.println("  not found");
                }
                else
                    System.out.println(" " + foundNumber);
            }
            else if (command.equals("3")) {
                System.out.println("number: ");
                String number = reader.nextLine();
                System.out.println(" " + phonebook.searchPersonByNumber(number));
            }
            else if (command.equals("4")) {
                System.out.println("whose address: ");
                String person = reader.nextLine();
                System.out.println("street: ");
                String street = reader.nextLine();
                System.out.println("city: ");
                String city = reader.nextLine();
                
                phonebook.addAddress(person, (street + " " + city));
            }
            else if (command.equals("5")) {
                System.out.println("whose information: ");
                String person = reader.nextLine();
                
                System.out.println(phonebook.searchPersonalInformation(person));
            }
            else if (command.equals("6")) {
                System.out.println("whose information: ");
                String person = reader.nextLine();
                phonebook.removeInformation(person);
            }
            else if (command.equals("7")) {
                System.out.println("keyword (if empty, all listed): ");
                String keyword = reader.nextLine();
                
                String foundEntries = phonebook.searchKeyword(keyword);
                if (foundEntries.isEmpty()) {
                    System.out.println(" keyword not found");
                }
                else {
                    System.out.println(foundEntries);
                }
                
            }
            else if (command.equals("x")) {
                break;
            }
        }
    }

}
