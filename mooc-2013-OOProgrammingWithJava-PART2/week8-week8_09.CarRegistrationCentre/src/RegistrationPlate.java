
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            // return false if object is null reference
            return false;
        }
        if (this.getClass() != object.getClass()) {
            // false if the objects are not of the same type
            return false;
        }
        // Now we know that the objects are of the same type, typecast
        // the parameter object as RegistrationPlate
        RegistrationPlate compared = (RegistrationPlate) object;
        
        if (this.country == null || this.country != compared.getCountry()) {
            return false;
        }
        if (this.regCode == null || this.regCode != compared.getRegCode()) {
            return false;
        }
        return true;
        
    }
    
    @Override
    public int hashCode() {
        if (this.country == null || this.regCode == null) {
            return 0;
        }
        // override the hashcode with hashcodes that are always the same when
        // fields country and regCode are the same
        return this.country.hashCode() + this.regCode.hashCode();
    }
    
    public String getCountry() {
        return this.country;
    }
    
    public String getRegCode() {
        return this.regCode;
    }

}
