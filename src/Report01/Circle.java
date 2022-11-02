package Report01;

import java.awt.Graphics;
import java.awt.Color;

class Circle extends Figure {
    int size;
    static int count,line_x,line_y =0;
    Circle(){
        count++;
        if(count%2==1) size=10;
        else if(count%2==0) size=50;
    }
    @Override public void paint(Graphics g){
        g.setColor(new Color(color_R,color_G,color_B));
        g.drawOval(x-size/2,y-size/2,size,size);
        if(count!=1) g.drawLine(line_x,line_y,x,y);
        line_x=x;
        line_y=y;
    }
    @Override public void move(int dx,int dy){
        x-=dx;
        y-=dy;
        // system.out.println("move2");
    }
    public void setSize(int s){
        size=s;
    }
}
