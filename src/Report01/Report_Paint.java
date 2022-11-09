package Report01;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Report_Paint extends Frame implements MouseListener, MouseMotionListener {
    int x,y,z;
    ArrayList<Figure>objList_D;
    ArrayList<Figure>objList_B;
    ArrayList<Figure>objList_C;
    Figure obj;
    public static void main(String[] args){
        Report_Paint f=new Report_Paint();
        f.setSize(640,480);
        f.setTitle("Report_Paint Sample");
        f.addWindowListener(new WindowAdapter(){
            @Override public void windowClosing(WindowEvent e){
                System.exit(0);
        }});
        f.setVisible(true);
    }
    Report_Paint(){
        objList_D=new ArrayList<Figure>();
        objList_B=new ArrayList<Figure>();
        objList_C=new ArrayList<Figure>();
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override public void paint(Graphics g){
        Figure f;
        for(int i=0;i<objList_D.size();i++){
            f=objList_D.get(i);
            f.paint(g,i);
        }
        for(int i=0;i<objList_B.size();i++){
            f=objList_B.get(i);
            f.paint(g,i);
        }
        for(int i=0;i<objList_C.size();i++){
            f=objList_C.get(i);
            f.paint(g,i);
        }
        if(obj!=null)obj.paint(g,0);
    }
    @Override public void mousePressed(MouseEvent e){
        if(e.getButton()==MouseEvent.BUTTON1) {
            obj=new Dot();
            System.out.println("Sum(Dot) : "+Dot.count_d);
        }
        else if(e.getButton()==MouseEvent.BUTTON2) {
            obj=new Box();
            System.out.println("Sum(Box) : "+Box.count_b);
        }
        else if(e.getButton()==MouseEvent.BUTTON3) {
            obj=new Circle();
            System.out.println("Sum(Circle) : "+Circle.count_c);
        }
        else {
            obj=new Box();
            System.out.println("Sum(Box) : "+Box.count_b);
        }
        obj.moveto(e.getX(),e.getY());
        System.out.println("Sum(All) : "+(Dot.count_d+Box.count_b+Circle.count_c));
        repaint();
    }
    @Override public void mouseReleased(MouseEvent e){
        obj.moveto(e.getX(),e.getY());
        if(obj instanceof Dot==true)objList_D.add(obj);
        else if(obj instanceof Box==true)objList_B.add(obj);
        else if(obj instanceof Circle==true)objList_C.add(obj);
        obj=null;
        repaint();
    }
    @Override public void mouseClicked(MouseEvent e){}
    @Override public void mouseEntered(MouseEvent e){}
    @Override public void mouseExited(MouseEvent e){}
    @Override public void mouseDragged(MouseEvent e){
        if(obj!=null)obj.moveto(e.getX(),e.getY());
        repaint();
    }
    @Override public void mouseMoved(MouseEvent e){}
}
