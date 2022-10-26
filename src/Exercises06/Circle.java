package Exercises06;
import java.awt.Graphics;
class Circle extends Coord {
    int color,size;
    Circle(){
        color=0;
        size=50;
    }
    @Override public void paint(Graphics g){
        g.drawOval(x-size/2,y-size/2,size,size);
    }
}
