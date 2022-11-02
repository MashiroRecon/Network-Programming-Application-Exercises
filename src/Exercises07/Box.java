package Exercises07;

import java.awt.Graphics;

class Box extends Figure {
    int size;
    Box(){
        size=50;
    }
    @Override public void paint(Graphics g){
        g.drawRect(x-size/2,y-size/2,size,size);
    }
}
