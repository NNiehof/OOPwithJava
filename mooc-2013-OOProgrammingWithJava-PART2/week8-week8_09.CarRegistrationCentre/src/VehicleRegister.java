
import java.util.HashMap;
import java.util.ArrayList;

/**
 * VehicleRegister.java
 *
 * @author NNiehof
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (get(plate) != null) {
            // if vehicle already has an owner
            return false;
        } else {
            this.owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate) {
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (get(plate) == null) {
            return false;
        } else {
            this.owners.remove(plate);
            return true;
        }
    }

    public void printRegistrationPlates() {
        // Print each registration plate
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        // Print each owner, but only once
        ArrayList<String> uniqueOwners = new ArrayList<String>();
        for (String owner : this.owners.values()) {
            if (!uniqueOwners.contains(owner)) {
                uniqueOwners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
