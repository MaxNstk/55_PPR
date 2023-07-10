package factory.AdilsonSymbols;

import factory.defaultAulaSymbols.Oval;
import shading.Shading;
import factory.Symbol;

import java.awt.*;
import java.awt.geom.Path2D;

public class Estrela extends Symbol {

    private static Estrela instance = new Estrela();

    private Estrela() {
    }

    public static Symbol getInstance() {
        return instance;
    }

    @Override
    public void draw(Graphics g, int yValue, Color color, Color backGround, Shading shading) {
        int x = 75;

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        double startAngleRad = Math.toRadians(-18);
        double outerRadius = 10 * 2.63;
        double innerRadius = 10;

        double centerX = x;
        double centerY = yValue+20;

        Path2D path = new Path2D.Double();
        double deltaAngleRad = Math.PI / 5;
        for (int i = 0; i < 5 * 2; i++)
        {
            double angleRad = startAngleRad + i * deltaAngleRad;
            double ca = Math.cos(angleRad);
            double sa = Math.sin(angleRad);
            double relX = ca;
            double relY = sa;
            if ((i & 1) == 0)
            {
                relX *= outerRadius;
                relY *= outerRadius;
            }
            else
            {
                relX *= innerRadius;
                relY *= innerRadius;
            }
            if (i == 0)
            {
                path.moveTo(centerX + relX, centerY + relY);
            }
            else
            {
                path.lineTo(centerX + relX, centerY + relY);
            }
        }
        path.closePath();
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.draw(path);
        g2d.setPaint(shading.getPaint(color, backGround));
        g2d.fill(path);
    }
}
