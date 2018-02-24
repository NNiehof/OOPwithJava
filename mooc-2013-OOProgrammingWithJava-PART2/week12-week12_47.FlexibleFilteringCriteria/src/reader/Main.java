package reader;

import reader.criteria.*;

public class Main {

    public static void main(String[] args) {
        String address = "http://www.gutenberg.org/files/2554/2554-0.txt";
        GutenbergReader book = new GutenbergReader(address);

        Criterion criterion =new AtLeastOne(
                new ContainsWord("beer"),
                new ContainsWord("milk"),
                new ContainsWord("oil")
        );

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
    }
}