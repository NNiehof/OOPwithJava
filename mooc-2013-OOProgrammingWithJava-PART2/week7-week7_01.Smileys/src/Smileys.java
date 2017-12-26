
public class Smileys {

    public static void main(String[] args) {
         printWithSmileys("Method");
         printWithSmileys("Nynke");
         printWithSmileys("Interface");
    }

    private static void printWithSmileys(String text) {
        // Print text surrounded by smileys

        int length = text.length();
        String smileyLine;
        if (isOdd(length)) {
            // if length of text is odd, add a space at the end of text and
            // increase length by one
            smileyLine = smileysForStringLength(length + 1);
            text += " ";
        } else {
            smileyLine = smileysForStringLength(length);
        }
        
        // Print smileys and text line for line
        System.out.println(smileyLine);
        System.out.println(":) " + text + " :)");
        System.out.println(smileyLine);
    }

    public static String smileysForStringLength(int length) {
        // Add a smiley ":)" for each two characters in length
        // Start with three smileys for the frame around the text
        String smileys = ":):):)";
        for (int index = 0; index < (length / 2); index++) {
            smileys += ":)";
        }
        return smileys;
    }

    public static boolean isOdd(int number) {
        // Return true if the number is odd
        return (number % 2 == 1);
    }
}
