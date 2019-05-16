
import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class smiley_face extends Applet implements Runnable { 
    
    @Override
    public void start() {
        super.start(); 
        Thread t1=new Thread(this);
        t1.start();
      //thread nesnesi oluşturduk
      //appletin kendisini parametre olarak verdik
      //bu şekilde run metodu devamlı olarak çağırılacaktır.
    }


    int x =-180;
    Thread t;
    String S=" ";
    public void paint(Graphics g) {
        resize(350,350);
        Font f = new Font("Monospaced", Font.ITALIC, 40);
        g.setFont(f);
        g.drawString(S + "", 50, 30);
        g.drawOval(60, 60, 200, 200);
        g.fillOval(90, 120, 30, 30);
        g.fillOval(190, 120, 30, 30);
        g.drawArc(110, 155, 95, 95, 0, x);
        
    }


    public void run() {
        while(true){
            x=x*-1;
        repaint();
        if (x>0){
            S="Ağlıyor ";
            
        }else{
            S="Gülüyor";
        }
        try {
            Thread.sleep(1000);
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        }
       
    }

}
