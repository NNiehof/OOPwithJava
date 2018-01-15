
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * PhoneSearch.java
 *
 * @author NNiehof
 */
public class PhoneSearch {

    private HashMap<String, ArrayList<String>> personToPhone;
    private HashMap<String, String> phoneToPerson;
    private HashMap<String, ArrayList<String>> personToAddress;
    private HashMap<String, String> addressToPerson;

    public PhoneSearch() {
        this.personToPhone = new HashMap<String, ArrayList<String>>();
        this.phoneToPerson = new HashMap<String, String>();
        this.personToAddress = new HashMap<String, ArrayList<String>>();
        this.addressToPerson = new HashMap<String, String>();
    }

    public void addPhone(String person, String phoneNumber) {
        if (!this.personToPhone.containsKey(person)) {
            this.personToPhone.put(person, new ArrayList<String>());
        }

        this.personToPhone.get(person).add(phoneNumber);

        if (!this.phoneToPerson.containsKey(phoneNumber)) {
            this.phoneToPerson.put(phoneNumber, person);
        }
    }

    public void addAddress(String person, String address) {
        if (!this.personToAddress.containsKey(person)) {
            this.personToAddress.put(person, new ArrayList<String>());
        }

        this.personToAddress.get(person).add(address);

        if (!this.addressToPerson.containsKey(address)) {
            this.addressToPerson.put(address, person);
        }
    }

    public String searchNumber(String person) {
        if (this.personToPhone.containsKey(person)) {
            String numbers = "";
            for (String number : this.personToPhone.get(person)) {
                numbers += (number + "\n");
            }
            return numbers;
        }
        return "phone number not found\n";
    }

    public String searchAddress(String person) {
        if (this.personToAddress.containsKey(person)) {
            String addresses = "";
            for (String address : this.personToAddress.get(person)) {
                addresses += (address + "\n");
            }
            return "address: " + addresses;
        }
        return "address unknown";
    }

    public String searchPersonByNumber(String phoneNumber) {
        if (this.phoneToPerson.containsKey(phoneNumber)) {
            return this.phoneToPerson.get(phoneNumber);
        }
        return "not found";
    }

    public String searchPersonalInformation(String person) {
        String address = searchAddress(person);
        String phoneNumber = searchNumber(person);

        if (address.contains("unknown") && phoneNumber.contains("not found")) {
            return "not found";
        } else if (phoneNumber.contains("not found")) {
            return "  " + address + "\n  " + phoneNumber;
        }
        return "  " + address + "\n  phone numbers:\n" + phoneNumber;
    }

    public void removeInformation(String person) {
        // First, collect all that person's phone numbers and addresses,
        // and remove those
        if (this.personToPhone.containsKey(person)) {
            ArrayList<String> phoneNumbers = this.personToPhone.get(person);
            for (String number : phoneNumbers) {
                this.phoneToPerson.remove(number);
            }
            // Second, remove the person entry
            this.personToPhone.remove(person);
        }

        if (this.personToAddress.containsKey(person)) {
            ArrayList<String> addresses = this.personToAddress.get(person);
            for (String address : addresses) {
                this.addressToPerson.remove(address);
            }
            // Remove the person entry
            this.personToAddress.remove(person);
        }

    }

    public String searchKeyword(String keyword) {
        // Find persons by keyword in names or addresses
        ArrayList<String> names = new ArrayList<String>();
        Set<String> addressKeys = this.addressToPerson.keySet();
        for (String addressKey : addressKeys) {
            if (addressKey.contains(keyword)) {
                names.add(this.addressToPerson.get(addressKey));
            }
        }
        Set<String> nameKeys = this.personToPhone.keySet();
        for (String nameKey : nameKeys) {
            if (nameKey.contains(keyword)) {
                names.add(nameKey);
            }
        }
        Collections.sort(names);
        String foundEntries = "";
        for (String name : names) {
            foundEntries += (name + "\n" + searchPersonalInformation(name));
        }
        return foundEntries;
    }
}
