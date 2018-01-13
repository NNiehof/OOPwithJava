package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * WordInspection.java
 *
 * @author NNiehof
 */
public class WordInspection {

    private Scanner reader;
    private ArrayList<String> wordList;

    public WordInspection(File file) {
        try {
            reader = new Scanner(file, "UTF-8");
        } catch (FileNotFoundException e) {
            System.out.println("Could not read file. " + e.getMessage());
            return;
        }
        this.wordList = new ArrayList<String>();
        while (reader.hasNext()) {
            this.wordList.add(reader.next());
        }
    }

    public int wordCount() {
        return this.wordList.size();
    }

    public List<String> wordsContainingZ() {
        ArrayList<String> wordsWithZ = new ArrayList<String>();
        for (String word : this.wordList) {
            if (word.contains("z")) {
                wordsWithZ.add(word);
            }
        }
        return wordsWithZ;
    }

    public List<String> wordsEndingInL() {
        ArrayList<String> wordsEndingInL = new ArrayList<String>();
        for (String word : this.wordList) {
            if (word.endsWith("l")) {
                wordsEndingInL.add(word);
            }
        }
        return wordsEndingInL;
    }

    public List<String> palindromes() {
        ArrayList<String> palindrome = new ArrayList<String>();
        for (String word : this.wordList) {
            int letters = word.length();
            int index1 = 0;
            int index2 = letters - 1;
            while (word.charAt(index1) == (word.charAt(index2))) {
                if (index1 >= index2) {
                    palindrome.add(word);
                    break;
                }
                index1++;
                index2--;
            }
        }
        return palindrome;
    }

    public List<String> wordsWhichContainAllVowels() {
        ArrayList<String> containAllVowels = new ArrayList<String>();
        String allVowels = "aeiouyäö";
        for (String word : this.wordList) {
            int index = 0;
            while (true) {
                // break if the word doesn't contain the vowel
                if (word.indexOf(allVowels.charAt(index)) < 0) {
                    break;
                }
                index++;
                if (index == allVowels.length()) {
                    containAllVowels.add(word);
                    break;
                }
            }
        }
        return containAllVowels;
    }
}
