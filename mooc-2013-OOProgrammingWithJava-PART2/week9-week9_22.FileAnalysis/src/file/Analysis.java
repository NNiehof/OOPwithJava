package file;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Analysis.java
 * Author: nniehof
 */


public class Analysis {

    private File file;
    private Scanner reader;
    private ArrayList<String> linesRead;

    public Analysis(File file) {
        this.file = file;
        this.linesRead = new ArrayList<String>();
        try {
            reader = new Scanner(this.file);
        } catch (Exception e) {
            System.out.println("Unable to read file");
        }
        while (reader.hasNextLine()) {
            this.linesRead.add(reader.nextLine());
        }
    }

    public int lines() {
        return this.linesRead.size();
    }

    public int characters() {
        int numChars = 0;
        for (String line : linesRead) {
            numChars += line.length() + 1; // one extra char for line break
        }
        return numChars;
    }
}
