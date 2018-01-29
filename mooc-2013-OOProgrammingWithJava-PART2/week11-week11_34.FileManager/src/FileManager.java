
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private File file;

    public ArrayList<String> read(String filename) throws FileNotFoundException {

        ArrayList<String> text = new ArrayList<String>();
        File file = new File(filename);
        Scanner reader = new Scanner(file);

        while (reader.hasNextLine())
            text.add(reader.nextLine());
        return text;
    }

    public void save(String filename, String text) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(text);
        writer.close();
    }

    public void save(String filename, ArrayList<String> texts) throws IOException {
        FileWriter writer = new FileWriter(filename);

        for (String line : texts) {
            writer.write(line + "\n");
        }
        writer.close();
    }
}
