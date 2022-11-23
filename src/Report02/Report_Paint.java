package Report02;

import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Report_Paint extends Frame implements MouseListener, MouseMotionListener, ActionListener {
    int x,y,z;
    ArrayList<Figure>objList;
//    ArrayList<Figure>objList_D;
//    ArrayList<Figure>objList_B;
//    ArrayList<Figure>objList_C;
    CheckboxGroup cbg;
    Checkbox c1, c2, c3, c4;
    Button end;
    int mode=0;
    Figure obj;
    public static void main(String[] args){
        Report_Paint f=new Report_Paint();
//      f.setSize(640,480);
        f.setSize(1080,720);
        f.setTitle("Report_Paint");
        f.addWindowListener(new WindowAdapter(){
            @Override public void windowClosing(WindowEvent e){
                System.exit(0);
        }});
        f.setVisible(true);
        if(args.length==1)f.load(args[0]);
    }
    Report_Paint(){
        objList=new ArrayList<Figure>();
//        objList_D=new ArrayList<Figure>();
//        objList_B=new ArrayList<Figure>();
//        objList_C=new ArrayList<Figure>();
        setLayout(null);
        cbg=new CheckboxGroup();
        c1=new Checkbox("丸",cbg,true);
        c1.setBounds(10,30,60,30);
        add(c1);
        c2=new Checkbox("円",cbg,false);
        c2.setBounds(10,60,60,30);
        add(c2);
        c3=new Checkbox("四角",cbg,false);
        c3.setBounds(10,90,60,30);
        add(c3);
        c4=new Checkbox("線",cbg,false);
        c4.setBounds(10,120,60,30);
        add(c4);
        end=new Button("終了");
        end.setBounds(10,300,60,30);
        add(end);
        addMouseListener(this);
        addMouseMotionListener(this);
        end.addActionListener(this);
    }
    public void save(String fname){
        try{
            FileOutputStream fos=new FileOutputStream(fname);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(objList);
            oos.close();
            fos.close();
        }
        catch(IOException e){}
    }
    @SuppressWarnings("unchecked")
    public void load(String fname){
        try{
            FileInputStream fis=new FileInputStream(fname);
            ObjectInputStream ois=new ObjectInputStream(fis);
            objList=(ArrayList<Figure>)ois.readObject();
            ois.close();
            fis.close();
        }
        catch(IOException e){}
        catch(ClassNotFoundException e){}
        repaint();
    }
    @Override public void paint(Graphics g){
        Figure f;
        for(int i=0;i<objList.size();i++){
            f=objList.get(i);
            f.paint(g);
        }
/*        for(int i=0;i<objList_D.size();i++){
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
        if(obj!=null)obj.paint(g,0);*/
    }
    @Override public void actionPerformed(ActionEvent e){
        save("paint.dat");
        System.exit(0);
    }
    @Override public void mousePressed(MouseEvent e){
        Checkbox c;
        c=cbg.getSelectedCheckbox();
        obj=null;
        if(c==c1) {
            mode=1;
            obj=new Dot();
//            System.out.println("Sum(Dot) : "+Dot.count_d);
        }
        else if(c==c2) {
            mode=2;
            obj=new Circle();
//            System.out.println("Sum(Circle) : "+Circle.count_c);
        }
        else if(c==c3) {
            mode=2;
            obj=new Rect();
//            System.out.println("Sum(Rect) : "+Box.count_r);
        }
        else if(c==c4){
            mode=2;
            obj=new Line();
//            System.out.println("Sum(Line) : "+Box.count_l);
        }
        else {
            obj=new Rect();
//            System.out.println("Sum(Box) : "+Box.count_b);
        }
        if(obj!=null){
            obj.moveto(e.getX(),e.getY());
//            System.out.println("Sum(All) : "+(Dot.count_d+Circle.count_c));
            repaint();
        }
    }
    @Override public void mouseReleased(MouseEvent e){
        if(mode==1)obj.moveto(e.getX(),e.getY());
        else if(mode==2)obj.setWH(e.getX()-obj.x,e.getY()-obj.y);
        if(mode>=1){
            objList.add(obj);
            obj=null;
        }
        mode=0;
/*         obj.moveto(e.getX(),e.getY());
       if(obj instanceof Dot==true){
            objList_D.add(obj);
            if(objList_D.size()>30)objList_D.remove(0);
        }
        else if(obj instanceof Box==true){
            objList_B.add(obj);
            if(objList_B.size()>30)objList_B.remove(0);
        }
        else if(obj instanceof Circle==true){
            objList_C.add(obj);
            if(objList_C.size()>30)objList_C.remove(0);
        }
        obj=null;*/
        repaint();
    }
    @Override public void mouseClicked(MouseEvent e){}
    @Override public void mouseEntered(MouseEvent e){}
    @Override public void mouseExited(MouseEvent e){}
    @Override public void mouseDragged(MouseEvent e){
        if(mode==1)obj.moveto(e.getX(),e.getY());
        else if(mode==2) obj.setWH(e.getX()-obj.x,e.getY()-obj.y);
//        if(obj!=null)obj.moveto(e.getX(),e.getY());
        repaint();
    }
    @Override public void mouseMoved(MouseEvent e){}
}
