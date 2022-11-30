package Report02;

import java.awt.*;

public class Rect extends Figure {
    Rect(){}
    @Override public void paint(Graphics g){
        g.setColor(color);
        if(w>=0&&h>=0)g.drawRect(x,y,w,h);
        else if(w<0&&h>=0)g.drawRect(x+w,y,-w,h);
        else if(w>=0&&h<0)g.drawRect(x,y+h,w,-h);
        else if(w<0&&h<0)g.drawRect(x+w,y+h,-w,-h);
        else g.drawRect(x,y,w,h);
    }
}
