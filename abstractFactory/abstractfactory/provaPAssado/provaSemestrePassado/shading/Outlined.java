package shading;

import java.awt.*;

// shading.Outlined represents the shading.Shading for outlined cards
public class Outlined extends Shading {

    // We have exactly one instance of the shading.Outlined class
    private static Outlined instance = new Outlined();

    // The private constructor keeps outsiders from making instances
    private Outlined() {
    }

    // getInstance returns the one instance of this class
    public static Shading getInstance() {
        return instance;
    }

    // shading.Outlined fills the cards with the background colour
    public Paint getPaint(Color colour, Color backGround) {
        return backGround;
    }
}
