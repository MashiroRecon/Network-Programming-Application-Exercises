package Exercises10;

import java.awt.*;

public class Circle extends Figure {
    int size;
    static int count_c,line_x,line_y =0;
    Circle(){
        count_c++;
//        if(count_c%2==1) size=10;
//        else if(count_c%2==0) size=50;
    }
    @Override public void paint(Graphics g){
        int r=(int)Math.sqrt((double)(w*w+h*h));
        g.drawOval(x-r,y-r,r*2,r*2);
    }
    @Override public void paint(Graphics g,int i){
        g.setColor(color);
        g.drawOval(x-size/2,y-size/2,size,size);
        if(count_c!=1&&i!=0) g.drawLine(line_x,line_y,x,y);
        line_x=x;
        line_y=y;
    }
    @Override public void move(int dx,int dy){
        x-=dx;
        y-=dy;
    }
    public void setSize(int s){
        size=s;
    }
}
