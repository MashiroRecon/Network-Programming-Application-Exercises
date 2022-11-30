package Report02;

import java.awt.*;

public class Oval extends Figure {
    Oval(){}
    @Override public void paint(Graphics g){
        g.setColor(color);
        if(w>=0&&h>=0)g.drawOval(x-w,y-h,w*2,h*2);
        else if(w<0&&h>=0)g.drawOval(x+w,y-h,w*-2,h*2);
        else if(w>=0&&h<0)g.drawOval(x-w,y+h,w*2,h*-2);
        else if(w<0&&h<0)g.drawOval(x+w,y+h,w*-2,h*-2);
        else g.drawOval(x-w,y-h,w*2,h*2);
    }
}
