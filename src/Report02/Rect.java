package Report02;

import java.awt.*;

public class Rect extends Figure {
    int size;
    static int count_b,line_x,line_y =0;
    Rect(){
        count_b++;
        size=50;
    }
    @Override public void paint(Graphics g){
        g.drawRect(x,y,w,h);
    }
    @Override public void paint(Graphics g,int i){
        g.setColor(color);
        g.drawRect(x-size/2,y-size/2,size,size);
        if(count_b!=1&&i!=0) g.drawLine(line_x,line_y,x,y);
        line_x=x;
        line_y=y;
    }
}
