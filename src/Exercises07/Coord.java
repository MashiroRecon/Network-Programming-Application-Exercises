package Exercises07;

import java.awt.Graphics;

class Coord {
    int x,y;
    Coord(){
        x=y=0;
    }
    public void move(int dx,int dy){
        x+=dx;
        y+=dy;
        // System.out.print("move1");
    }
    public void moveto(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void print(){
        System.out.println("x = "+x+" y = "+y);
    }
    public void paint(Graphics g){}
}
