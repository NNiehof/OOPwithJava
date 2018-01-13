
package wordinspection;

import java.io.File;

/**
 *
 * @author NNiehof
 */
public class Main {

    public static void main(String[] args) {
        WordInspection s = new WordInspection( new File("src/shortList.txt") );
        s.palindromes();
    }
    
}
