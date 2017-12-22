
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // If a letter has not been guessed yet, add it to the list of guessed
        // letters. If the letter is not in the word, increment the number of
        // faults by one.
        if (!this.guessedLetters.contains(letter)) {
            this.guessedLetters += letter;
            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
            }
        }
    }

    public String hiddenWord() {
        // create the hidden word by iterating through this.word letter by letter
        // if the letter is in the guessed letters, append it to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word
        
        String hiddenWord = "";
        int letters = this.word.length();
        
        for (int index = 0; index < letters; index++){
            char currentLetter = this.word.charAt(index);
            if (!(this.guessedLetters.indexOf(currentLetter) == -1)) {
                // if currentLetter is in guessedLetters, append it to hiddenWord
                hiddenWord += currentLetter;
            } else {
                hiddenWord += "_";
            }
        }
        return hiddenWord;
    }
}
