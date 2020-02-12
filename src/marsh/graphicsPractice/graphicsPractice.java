package marsh.graphicsPractice;

import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.Line;
import comp127graphics.Rectangle;

import java.awt.*;

public class graphicsPractice {

    public static void main(String[] args) {

        CanvasWindow canvas = new CanvasWindow("Test Window", 500, 500);

        Rectangle rect = new Rectangle(250, 250, 100, 100);

        rect.setFillColor(Color.PINK);
        rect.setFilled(true);
        rect.setStroked(false);

        Line l = new Line(250, 10, 10, 250);
        l.setStrokeColor(Color.blue);
        l.setStrokeWidth(10);

        Ellipse e = new Ellipse(350, 50, 100, 30);
        e.setFillColor(new Color(223, 255, 124));
        e.setFilled(true);
        e.setStrokeColor(new Color(177, 217, 50));
        e.setStrokeWidth(4);

        canvas.add(rect);
        canvas.add(l);
        canvas.add(e);
    }
}
