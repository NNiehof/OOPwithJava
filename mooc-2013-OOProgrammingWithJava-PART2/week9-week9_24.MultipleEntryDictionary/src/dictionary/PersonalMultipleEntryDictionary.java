package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * PersonalMultipleEntryDictionary.java
 * Author: nniehof
 */

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{

    private Map<String, Set<String>> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        // create entry if it doesn't exist yet
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, new HashSet<String>());
        }

        // add the entry
        this.dictionary.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return this.dictionary.get(word);
    }

    @Override
    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
    }
}
