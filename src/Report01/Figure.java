package Report01;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;

public class Figure extends Coord{
    Color color;
    Figure(){
        Random x=new Random();
        color=new Color(x.nextInt(256),x.nextInt(256),x.nextInt(256));
    }
    public void paint(Graphics g,int i){}
}
