package Report01;

import java.awt.Graphics;
import java.util.Random;

public class Figure extends Coord{
    int color_R,color_G,color_B;
    Figure(){
        Random x=new Random();
        color_R=x.nextInt(256);
        color_G=x.nextInt(256);
        color_B=x.nextInt(256);
    }
    public void paint(Graphics g){}
}
