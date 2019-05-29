
import java.applet.Applet;
import java.awt.Graphics;

public class sinus extends Applet {
    public void init() {
        this.setSize(850, 600);
    }
    public void paint(Graphics g) {
        double ydegeri1;
        double ydegeri2;
        for (double x = 0; x <= 5.5; x += 0.1) {
            ydegeri1 = Math.sin(x);
            ydegeri2 = Math.sin(x + 1);
            //4+4*(Math.sin(x))
            g.drawLine(10 + (int) (20 * x), 100 - (int) (20 * ydegeri1), 10 + (int) (20 * (x + 1)), 100 - (int) (20 * ydegeri2));
            g.drawLine(0, 100, 150, 100);
            g.drawLine(10, 1, 10, 200);
        }
    }
}
