
/**
 * Change.java
 * Change a character in a string into another character.
 * 
 * @author NNiehof
 */

public class Change {

    char fromCharacter;
    char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    /**
     * 
     * @param characterString the string to be changed
     * @return the changed string
     */
    public String change(String characterString) {
        String newString = "";
        for (int index = 0; index < characterString.length(); index++) {
            // Go thourgh string one character at a time, and substitute the
            // new character if it is the to be changed character.
            char currentSymbol = characterString.charAt(index);
            if (currentSymbol == this.fromCharacter) {
                newString += this.toCharacter;
            } else {
                newString += currentSymbol;
            }
        }
        return newString;
    }
}
