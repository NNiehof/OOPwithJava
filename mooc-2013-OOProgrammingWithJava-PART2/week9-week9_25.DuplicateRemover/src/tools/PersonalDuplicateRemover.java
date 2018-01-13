package tools;

import java.util.*;

/**
 * PersonalDuplicateRemover.java
 * Author: nniehof
 */

public class PersonalDuplicateRemover implements DuplicateRemover{

    private List<String> words;
    private int duplicates;

    public PersonalDuplicateRemover() {
        this.words = new ArrayList<String>();
        this.duplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if (this.words.contains(characterString)) {
            this.duplicates++;
        }
        this.words.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
                return new HashSet<String>(this.words);
            }

    @Override
    public void empty() {
        this.words = new ArrayList<String>();
        this.duplicates = 0;
    }
}
