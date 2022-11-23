package Report02;

import java.awt.*;

public class Dot extends Figure {
    int size=10;
    Dot(){}
    @Override public void paint(Graphics g){
        g.setColor(color);
        g.drawOval(x-size/2,y-size/2,size,size);
    }
}
