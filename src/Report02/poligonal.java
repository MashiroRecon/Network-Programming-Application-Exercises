package Report02;

import java.awt.*;

public class poligonal extends Figure {
    static int count_p,line_x,line_y = 0;
    poligonal(){
        count_p++;
    }
    @Override public void paint(Graphics g,int i){
        g.setColor(color);
        if(count_p==1||i==1)g.drawLine(x,y,x+w,y+h);
        else if(count_p!=1&&i!=1)g.drawLine(line_x,line_y,x+w,y+h);
        else g.drawLine(x,y,x+w,y+h);
        line_x=x+w;
        line_y=y+h;
    }
}
