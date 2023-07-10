package especialProva;

import factory.Symbol;
import shading.Shading;

import java.awt.*;

public class Triangulo extends Symbol {

	public static Triangulo instance = new Triangulo();

	public static Symbol getInstance() {
		return instance;
	}

	@Override
	public void draw(Graphics g, int yValue, Color color, Color backGround, Shading shading){
		Graphics2D g2d = (Graphics2D) g;

		int x[]={70,40,100};
		int y[]={yValue,yValue+30,yValue+30};
		g2d.setColor(color);
		g2d.setStroke(new BasicStroke(5.0f));
		g2d.drawPolygon(x,y,3);
		g2d.setPaint(shading.getPaint(color, backGround));
		g2d.fillPolygon(x,y,3);
	}
}
