package Report01;

import java.awt.Graphics;

class Dot extends Figure {
    int size;
    static int count_d,line_x,line_y =0;
    Dot(){
        count_d++;
        size=5;
    }
    @Override public void paint(Graphics g,int i){
        g.setColor(color);
        g.fillOval(x-size/2,y-size/2,size,size);
        if(count_d!=1&&i!=0) g.drawLine(line_x,line_y,x,y);
        line_x=x;
        line_y=y;
    }
}
