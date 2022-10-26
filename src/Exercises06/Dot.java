package Exercises06;

import java.awt.Graphics;

class Dot extends Coord {
    int color,size;
    Dot(){
        color=0;
        size=5;
    }
    @Override public void paint(Graphics g){
        g.fillOval(x-size/2,y-size/2,size,size);
    }
}
