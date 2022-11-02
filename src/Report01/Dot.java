package Report01;

import java.awt.Graphics;

class Dot extends Figure {
    int size;
    Dot(){
        size=5;
    }
    @Override public void paint(Graphics g){
        g.fillOval(x-size/2,y-size/2,size,size);
    }
}
