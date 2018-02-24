package reader.criteria;

/**
 * Not.java
 * Author: nniehof
 */

public class Not implements Criterion {

    private Criterion criterion;

    public Not(Criterion criterion) {
        this.criterion = criterion;
    }

    @Override
    public boolean complies(String line) {
        if (!criterion.complies(line)) {
            return true;
        }
        return false;
    }
}
