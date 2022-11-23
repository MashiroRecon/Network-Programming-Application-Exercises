package Report02;

import java.awt.*;
import java.io.*;

public class Coord implements Serializable{
    int x=0,y=0;
    Coord(){}
    public void move(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    public void moveto(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void paint(Graphics g,int i){}
}
