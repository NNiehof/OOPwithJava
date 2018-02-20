package reference.domain;

/**
 * Rating.java
 * Film ratings
 * Author: nniehof
 */

public enum Rating {
    BAD(-5),
    MEDIOCRE(-3),
    NOT_WATCHED(0),
    NEUTRAL(1),
    FINE(3),
    GOOD(5);

    private int grade;

    private Rating(int grade) {
        this.grade = grade;
    }

    public int getValue() {
        return this.grade;
    }
}
