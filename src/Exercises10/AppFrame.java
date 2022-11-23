package Exercises10;

import java.awt.*;

public class AppFrame extends Frame {
    @Override public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("Hello java!",70,120);
        g.drawRect(50,50,100,100);
        System.out.println("paint");
    }
}
