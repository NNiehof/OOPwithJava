package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.attribute.FileAttributeView;
import java.util.HashMap;
import java.util.Scanner;

/**
 * MindfulDictionary.java
 * Author: nniehof
 */

public class MindfulDictionary {

    private HashMap<String, String> finToEng;
    private HashMap<String, String> engToFin;
    private File file;
    private FileWriter writer;

    public MindfulDictionary() {
        this.finToEng = new HashMap<String, String>();
        this.engToFin = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) throws IOException {
        this();
        this.file = new File(file);
    }

    public void add(String word, String translation) {
        if (!this.finToEng.containsKey(word)) {
            this.finToEng.put(word, translation);
        }
        if (!this.engToFin.containsKey(translation)) {
            this.engToFin.put(translation, word);
        }
    }

    public String translate(String word) {
        if (this.finToEng.containsKey(word)) {
            return this.finToEng.get(word);
        }
        if (this.engToFin.containsKey(word)) {
            return this.engToFin.get(word);
        }
        return null;
    }

    public void remove(String toBeRemoved) {
        // get translation of the word to remove it from both dicts
        if (this.finToEng.containsKey(toBeRemoved)) {
            String translation = this.finToEng.get(toBeRemoved);
            this.finToEng.remove(toBeRemoved);
            this.engToFin.remove(translation);
        }
        else if (this.engToFin.containsKey(toBeRemoved)) {
            String translation = this.engToFin.get(toBeRemoved);
            this.engToFin.remove(toBeRemoved);
            this.finToEng.remove(translation);
        }
    }

    public boolean load() {
        try {
            Scanner reader = new Scanner(this.file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":"); // line split at :
                this.finToEng.put(parts[0], parts[1]);
                this.engToFin.put(parts[1], parts[0]);
            }
            return true;
        }
        catch (FileNotFoundException e) {
            return false;
        }
    }

    public boolean save() {
        try {
            writer = new FileWriter(this.file);

            for (String key : this.finToEng.keySet()) {
                writer.write(key + ":" + this.finToEng.get(key) + "\n");
            }
            writer.close();
            return true;

        } catch (IOException e) {
            return false;
        }
    }
}
