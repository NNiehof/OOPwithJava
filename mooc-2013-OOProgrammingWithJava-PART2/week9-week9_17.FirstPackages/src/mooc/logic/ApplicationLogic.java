package mooc.logic;

import mooc.ui.UserInterface;

/**
 * ApplicationLogic.java
 *
 * @author NNiehof
 */
public class ApplicationLogic {

    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes) {
        for (int count = 0; count < howManyTimes; count++) {
            System.out.println("The application logic works");
            this.ui.update();
        }
    }

}
