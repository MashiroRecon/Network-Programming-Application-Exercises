package Exercises10;

import java.awt.*;

public class Line extends Figure{
    Line(){}
    @Override public void paint(Graphics g){
        g.drawLine(x,y,x+w,y+h);
    }
}
