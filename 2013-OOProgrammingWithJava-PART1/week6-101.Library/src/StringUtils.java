
/**
 *
 * @author NNiehof
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
        // Strip whitespace from search word and convert to uppercase
        // Return a boolean for whether the search word occurs in the word
        String wordCleaned = word.trim().toUpperCase();
        String searchWordCleaned = searched.trim().toUpperCase();
        return wordCleaned.contains(searchWordCleaned);
    }
}
