package Exercises07;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Paint2 extends Frame implements MouseListener, MouseMotionListener {
    int x,y;
    ArrayList<Figure>objList;
    Figure obj;
    // Coord c;
    public static void main(String[] args){
        Paint2 f=new Paint2();
        f.setSize(640,480);
        f.setTitle("Paint Sample");
        f.addWindowListener(new WindowAdapter(){
            @Override public void windowClosing(WindowEvent e){
                System.exit(0);
        }});
        f.setVisible(true);
    }
    Paint2(){
        objList=new ArrayList<Figure>();
        // c=null;
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override public void paint(Graphics g){
        Figure f;
        for(int i=0;i<objList.size();i++){
            f=objList.get(i);
            f.paint(g);
        }
        if(obj!=null)obj.paint(g);
        // if(c!=null) c.paint(g);
    }
    @Override public void mousePressed(MouseEvent e){
        if(e.getButton()==MouseEvent.BUTTON1) obj=new Dot();
        else if(e.getButton()==MouseEvent.BUTTON2) obj=new Box();
        else if(e.getButton()==MouseEvent.BUTTON3) obj=new Circle();
        else obj=new Box();
        obj.moveto(e.getX(),e.getY());
        // x=e.getX();
        // y=e.getY();
        // test60(e);
    }
    @Override public void mouseReleased(MouseEvent e){
        obj.moveto(e.getX(),e.getY());
        objList.add(obj);
        obj=null;
        repaint();
    }
    @Override public void mouseClicked(MouseEvent e){}
    @Override public void mouseEntered(MouseEvent e){}
    @Override public void mouseExited(MouseEvent e){}
    @Override public void mouseDragged(MouseEvent e){
        if(obj!=null)obj.moveto(e.getX(),e.getY());
        repaint();
        /*if(c!=null){
            c.move(e.getX()-x,e.getY()-y);
            repaint();
        }*/
        // x=e.getX();
        // y=e.getY();
    }
    @Override public void mouseMoved(MouseEvent e){}
    public void test60(MouseEvent e){
        obj=new Circle();
        obj.moveto(e.getX(),e.getY());
        objList.add(0,obj);
        repaint();
    }
}
