
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        // Objects must have the same type
        if (getClass() != object.getClass()) {
            return false;
        }

        // Now we know that the objects have the same type, cast the compared
        // object as a bird
        Bird otherBird = (Bird) object;

        if (this.latinName != otherBird.latinName) {
            return false;
        }

        if (this.ringingYear != otherBird.ringingYear) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return this.latinName.hashCode() + this.ringingYear;
    }
}


