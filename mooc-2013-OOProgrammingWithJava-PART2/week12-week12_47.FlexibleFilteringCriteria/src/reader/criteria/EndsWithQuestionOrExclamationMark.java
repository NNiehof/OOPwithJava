package reader.criteria;

/**
 * EndsWithQuestionOrExclamationMark.java
 * Check whether a line end in a question mark, or an exclamation mark.
 * Author: nniehof
 */

public class EndsWithQuestionOrExclamationMark implements Criterion {

    @Override
    public boolean complies(String line) {
        int lineEnd = line.length();
        if (lineEnd == 0) {
            return false;
        }
        char lastChar = line.charAt(lineEnd - 1);
        if (lastChar == '?' | lastChar == '!') {
            return true;
        }
        return false;
    }
}
