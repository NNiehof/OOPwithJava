package mooc.ui;


/**
 * TextUserInterface.java
 *
 * @author NNiehof
 */

public class TextUserInterface implements UserInterface{

    @Override
    public void update() {
        System.out.println("Updating the user interface");
    }
}
