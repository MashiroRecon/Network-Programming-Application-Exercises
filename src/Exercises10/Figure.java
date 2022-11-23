package Exercises10;

import java.awt.*;
import java.util.*;

public class Figure extends Coord{
    Color color;
    int w,h;
    Figure(){
        w=h=0;
        Random x=new Random();
        color=new Color(x.nextInt(256),x.nextInt(256),x.nextInt(256));
    }
    public void paint(Graphics g){}
    public void paint(Graphics g,int i){}
    public void setWH(int w,int h){
        this.w=w;
        this.h=h;
    }
}
