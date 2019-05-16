
     import java.applet.*;
 import java.awt.*;
 import java.awt.event.KeyEvent;
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.Color;
 import java.awt.Dimension;
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.RenderingHints;
 import java.awt.event.ActionEvent;
 import java.awt.event.KeyEvent;

//public class ball {

public class ball extends Applet implements ActionListener, KeyListener {

private static final long serialVersionUID = 1L;

double x = 0, y = 0;

static int MoveX = 210; 
static int MoveY = 800; 

 public void up(){
        MoveY = -2;
        MoveX = 0;
    }

    public void down(){
        MoveY = 2;
        MoveX = 0;
    }

    public void left(){
       MoveX = -2;
        MoveY = 0;
    }

    public void right(){
        MoveX = 2;
        MoveY = 0;
    }



public void paint(Graphics g){
    //g.drawLine(200+10,150-10, 200+190, 150-10);
    //g.drawLine(200+30,200-30, 200+190, 200-30);
    g.setColor(Color.BLUE);


    g.fillRect(200+10, 150-10, 200+40, 150-10);
    g.fillRect(300+40, 150-10, 300+70, 150-10);


    g.fillRect(200+10, 200-10, 200+10, 200-10);
    g.fillRect(200+10, 230-10, 200+10, 230-10);
    g.fillRect(200+10, 260-10, 200+10, 260-10);
    g.fillRect(200+10, 290-10, 200+10, 290-10);
    g.fillRect(200+10, 320-10, 200+10, 320-10);
    g.fillRect(200+10, 350-10, 200+10, 350-10);
    g.fillRect(200+10, 380-10, 200+10, 380-10);




    g.fillRect(600+300, 90-10, 100+100, 150-10);
    g.fillRect(600+300, 150-10, 100+100, 210-10);
    g.fillRect(600+300, 210-10, 100+100, 270-10);
    g.fillRect(600+300, 270-10, 100+100, 330-10);


    g.fillRect(600+100,400, 200, 180);
    g.fillRect(600+30,400, 200, 180);


    g.fillRect(1000+300, 90-10, 100+100, 150-10);
    g.fillRect(1000+300, 150-10, 100+100, 210-10);
    g.fillRect(1000+300, 210-10, 100+100, 270-10);
    g.fillRect(1000+300, 270-10, 100+100, 330-10);
    g.fillRect(1000+300, 330-10, 100+100, 390-10);
    g.fillRect(1000+300, 390-10, 100+100, 350-10);

    g.setColor(Color.RED); 
    int size =90;
    g.fillOval(MoveX, MoveY, size, size); 






}
public void keyPressed(KeyEvent e) {
    // TODO Auto-generated method stub
     int code = e.getKeyCode();

        if (code == KeyEvent.VK_UP){
            up();
        }

        if (code == KeyEvent.VK_DOWN){
            down();
        }

        if (code == KeyEvent.VK_LEFT){
            left();
        }

        if (code == KeyEvent.VK_RIGHT){
            right();
        }

}
public void keyReleased(KeyEvent e) {
    // TODO Auto-generated method stub

    int code = e.getKeyCode();

    if (code == KeyEvent.VK_UP){
        MoveY = 0;
    }
    if (code == KeyEvent.VK_DOWN){
        MoveY = 0;
    }
    if (code == KeyEvent.VK_LEFT){
        MoveX = 0;
    }
    if (code == KeyEvent.VK_RIGHT){
        MoveX = 0;
    }

}
public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub

}
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
     repaint();
        x += MoveX;
        y += MoveY;

        if(x<0){
            MoveX = 0;
            x = 0;
        }

        if(x>750){
            MoveX = 0;
            x = 750;
        }

        if(y<0);{
            MoveY = 0;
            y = 0;
        }

        if(y>550){
            MoveY = 0;
            y = 550;
        }
   }


  }

