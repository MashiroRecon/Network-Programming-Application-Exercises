package Exercises10;

import java.awt.*;

public class Dot extends Figure {
    int size;
    static int count_d,line_x,line_y =0;
    Dot(){
        count_d++;
        size=10;
    }
    @Override public void paint(Graphics g){
        g.drawOval(x-size/2,y-size/2,size,size);
    }
    @Override public void paint(Graphics g,int i){
        g.setColor(color);
        g.fillOval(x-size/2,y-size/2,size,size);
        if(count_d!=1&&i!=0) g.drawLine(line_x,line_y,x,y);
        line_x=x;
        line_y=y;
    }
}
