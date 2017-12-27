
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Dictionary.java
 * Today, we learn Finnish.
 *
 * @author NNiehof
 */
public class Dictionary {

    private HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }

    public String translate(String word) {
        // Return the English translation of a Finnish word
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else {
            return null;
        }
    }
    
    public void add(String word, String translation) {
        // Add a Finnish word and the English translation to the dictionary
        this.dict.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.dict.size();
    }
    
    public ArrayList<String> translationList() {
        // Return an ArrayList of all key-value pairs in the form "key = value"
        ArrayList<String> translations = new ArrayList<String>();
        for (String key : this.dict.keySet()) {
            translations.add(key + " = " + this.dict.get(key));
        }
        return translations;
    }
}
