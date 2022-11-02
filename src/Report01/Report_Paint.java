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
    ArrayList<Figure>objList;
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
        objList=new ArrayList<Figure>();
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
    }
    @Override public void mousePressed(MouseEvent e){
        test60(e);
    }
    @Override public void mouseReleased(MouseEvent e){
        test60(e);
    }
    @Override public void mouseClicked(MouseEvent e){}
    @Override public void mouseEntered(MouseEvent e){}
    @Override public void mouseExited(MouseEvent e){}
    @Override public void mouseDragged(MouseEvent e){
        test60(e);
    }
    @Override public void mouseMoved(MouseEvent e){}
    public void test60(MouseEvent e){
        obj=new Circle();
        obj.moveto(e.getX(),e.getY());
        objList.add(obj);
        repaint();
        z++;
        System.out.println(z);
        System.out.println(objList.size());
        if(objList.size()>30) objList.remove(0);
    }
}
