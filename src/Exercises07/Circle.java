package Exercises07;

import java.awt.Graphics;

class Circle extends Figure {
    int size;
    Circle(){
        size=50;
    }
    @Override public void paint(Graphics g){
        g.drawOval(x-size/2,y-size/2,size,size);
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
