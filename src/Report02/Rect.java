package Report02;

import java.awt.*;

public class Rect extends Figure {
    Rect(){}
    @Override public void paint(Graphics g){
        g.setColor(color);
        g.drawRect(x,y,w,h);
    }
}
