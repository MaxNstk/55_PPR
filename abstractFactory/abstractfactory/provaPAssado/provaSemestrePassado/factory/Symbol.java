package factory;

import shading.Shading;

import java.awt.*;

// A factory.Symbol is one of the shapes that need drawing, oval, diamond or squiggle
public abstract class Symbol {
    public static Symbol getInstance() {
        return null;
    }

    abstract public void draw(Graphics g, int yValue, Color color,
                              Color backGround, Shading shading);
}
