package lab4;
import java.awt.Graphics;
import java.awt.Canvas;

public abstract class FiguraGeometrica extends Canvas implements Observer {
	
	public void update() {
		repaint();
	}

}
