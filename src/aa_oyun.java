
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aa_oyun extends Applet implements Runnable, MouseListener {

    int r, g, b;
    int x1, x2, y1, y2;
    int sleep_time = 500;
    @Override
    public void init() {
        super.init();
        Thread T = new Thread(this);
        T.start();
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        //while(true){
        super.paint(g);
        resize(600, 600);
        try {
            //Thread.sleep(1000);
            
            g.fillOval(250, 200, 100, 100);
           
            
        g.fillOval(285, 450, 30, 30); 
        
       g.fillOval(285, 490, 30, 30); 
        
        
        g.setColor(Color.BLACK);
        g.fillOval(285, 530, 30, 30);
        Thread.sleep(sleep_time); 
        g.setColor(Color.WHITE);
        g.fillOval(285, 530, 30, 30);
        Thread.sleep(sleep_time); 
            
        
        
            g.setColor(Color.BLUE);
            g.drawLine(300, 100, 300, 200);
            g.fillOval(285, 70, 30, 30);
            Thread.sleep(sleep_time);
            g.setColor(Color.WHITE);
            g.drawLine(300, 100, 300, 200);
            g.fillOval(285, 70, 30, 30);
            g.setColor(Color.BLUE);
            g.drawLine(150, 250, 250, 250);
            g.fillOval(120, 235, 30, 30);
            Thread.sleep(sleep_time);
            g.setColor(Color.WHITE);
            g.drawLine(150, 250, 250, 250);
            g.fillOval(120, 235, 30, 30);
            g.setColor(Color.BLUE);
            g.drawLine(300, 300, 300, 400);
            g.fillOval(285, 400, 30, 30);
            Thread.sleep(sleep_time);
            g.setColor(Color.WHITE);
            g.drawLine(300, 300, 300, 400);
            g.fillOval(285, 400, 30, 30);
            g.setColor(Color.BLUE);
            g.drawLine(350, 250, 450, 250);
            g.fillOval(450, 235, 30, 30);
            Thread.sleep(sleep_time);
            
            //g.fillOval(285, 450, 30, 30);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //} 

    @Override
    public void run() {

        while (true) {
            repaint();
        }
    }

    private Color Color(int r, Graphics g, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      Graphics g=getGraphics();
      //g.fillOval(285, 490, 30, 30);
      

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
