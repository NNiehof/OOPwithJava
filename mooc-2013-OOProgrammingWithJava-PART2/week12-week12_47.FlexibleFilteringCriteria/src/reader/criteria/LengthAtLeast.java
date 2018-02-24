package reader.criteria;

/**
 * LengthAtLeast.java
 * Author: nniehof
 */

public class LengthAtLeast implements Criterion {

    private int minLength;

    public LengthAtLeast(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean complies(String line) {
        if (line.length() >= this.minLength) {
            return true;
        }
        return false;
    }
}
