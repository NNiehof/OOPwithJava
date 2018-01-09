package moving.logic;

import java.util.List;
import java.util.ArrayList;
import moving.domain.Box;
import moving.domain.Thing;

/**
 * Packer.java
 *
 * @author NNiehof
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        ArrayList<Box> boxes = new ArrayList<Box>();
        Box currentBox = new Box(this.boxesVolume);

        for (Thing thing : things) {
            boolean packed = currentBox.addThing(thing);
            if (!packed) {
                // if box is full, put it away in boxes, make new box, add
                // thing to the new box
                boxes.add(currentBox);
                currentBox = new Box(this.boxesVolume);
                currentBox.addThing(thing);
            }
        }
        // also add the final box if it is not empty
        if (currentBox.getVolume() > 0) {
            boxes.add(currentBox);
        }
        return boxes;
    }
}
