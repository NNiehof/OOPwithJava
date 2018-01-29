
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }

        String myText = "dear diary, today everything was awesome";
        t.save("diary.txt", myText);

        ArrayList<String> myRamblings = new ArrayList<String>();
        myRamblings.add("Java is my thing");
        myRamblings.add("here is how I write to file");
        myRamblings.add("this is a haiku");
        t.save("haiku.txt", myRamblings);
    }
}
