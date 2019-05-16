
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class oyun_odev extends Applet implements Runnable, KeyListener {

    int x = 150;
    int y = 230;
    int dx1=100;
    int dx2=200;
    int dy1=250;
    int puan=0;
    @Override
    public void init() {
        super.init();
        Thread t = new Thread(this);
        t.start();
        addKeyListener(this);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        resize(300, 300);
        //System.out.println("dx: "+dx+" dy: "+dy);
        g.drawString("score: " + puan, 50, 50);
        g.drawLine(dx1, dy1, dx2, dy1);
        
        // g.drawArc(130, 230, 170, 230, 0, 360);
        g.setColor(Color.red);
        g.fillOval(x, y, 20, 20);

    }

    public void keyPressed(KeyEvent e) {
        int tus = e.getKeyCode();
        if (tus == KeyEvent.VK_LEFT) {
            System.out.println("VK_LEFT");
            dx1-=10;
            dx2-=10;
        } else if (tus == KeyEvent.VK_RIGHT) {
            System.out.println("VK_RIGHT");
            dx1 = dx1 + 10;
            dx2 = dx2 + 10;
        }
        repaint();

    }

    @Override
    public void run() {
        while (true) {
            if (x>=150 && y<=230){
                x+=10;
                y-=10;
            }
            if ((x>150 && x<=280)&& y<=100){
                x-=10;
                y-=10;
                
            }
            if ((x>150 && x<=270)&& y<=100){
                x-=10;
                y+=10;
                
            }
            if (y<=100 && x<=150){
                x-=10;
                y+=10;
                if (x==140 && y==0){
                    puan+=1;
                }
                
            }
            if((x>=30 && y>=110) && (x<=150 && y<=230)){
                x+=10;
                y+=10; 
            }
            if (dx1<=x && dx2>=x && y==230){
                    dx1-=5;
                    dx2+=5;
                }
            if(dx1==0 && dx2==300){
                System.exit(0);
            }
            repaint();
            try {
                Thread.sleep(100);

            } catch (Exception e) {
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
