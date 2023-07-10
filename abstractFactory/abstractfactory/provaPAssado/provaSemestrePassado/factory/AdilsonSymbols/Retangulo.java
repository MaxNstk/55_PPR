package factory.AdilsonSymbols;

import shading.Shading;
import factory.Symbol;

import java.awt.*;

public class Retangulo extends Symbol {

    private static Retangulo instance = new Retangulo();

    private Retangulo() {
    }

    public static Symbol getInstance() {
        return instance;
    }

    @Override
    public void draw(Graphics g, int yValue, Color color, Color backGround, Shading shading) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.drawRect(40, yValue, 70, 40);

        g2d.setPaint(shading.getPaint(color, backGround));
        g2d.fillRect(40, yValue, 70, 40);
    }
}
