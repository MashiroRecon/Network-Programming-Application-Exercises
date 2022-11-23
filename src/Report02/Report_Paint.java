package Report02;

import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Report_Paint extends Frame implements MouseListener, MouseMotionListener, ActionListener {
    int x,y,z;
    ArrayList<Figure>objList;
    CheckboxGroup cbg_f,cbg_c;
    Checkbox f1,f2,f3,f4,c1,c2,c3,c4;
    Button end;
    int mode=0;
    Figure obj;
    Color color;
    public static void main(String[] args){
        Report_Paint f=new Report_Paint();
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
        setLayout(null);
        cbg_f=new CheckboxGroup();
        cbg_c=new CheckboxGroup();
        f1=new Checkbox("丸",cbg_f,true);
        f1.setBounds(10,30,60,30);
        add(f1);
        f2=new Checkbox("円",cbg_f,false);
        f2.setBounds(10,60,60,30);
        add(f2);
        f3=new Checkbox("四角",cbg_f,false);
        f3.setBounds(10,90,60,30);
        add(f3);
        f4=new Checkbox("線",cbg_f,false);
        f4.setBounds(10,120,60,30);
        add(f4);
        c1=new Checkbox("黒",cbg_c,true);
        c1.setBounds(80,30,60,30);
        add(c1);
        c2=new Checkbox("赤",cbg_c,false);
        c2.setBounds(80,60,60,30);
        add(c2);
        c3=new Checkbox("緑",cbg_c,false);
        c3.setBounds(80,90,60,30);
        add(c3);
        c4=new Checkbox("青",cbg_c,false);
        c4.setBounds(80,120,60,30);
        add(c4);
        end=new Button("終了");
        end.setBounds(10,600,60,30);
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
            f=(Figure)objList.get(i);
            f.paint(g);
        }
        if(mode>=1)obj.paint(g);
    }
    @Override public void actionPerformed(ActionEvent e){
        save("paint.dat");
        System.exit(0);
    }
    @Override public void mousePressed(MouseEvent e){
        Checkbox f,c;
        f=cbg_f.getSelectedCheckbox();
        c=cbg_c.getSelectedCheckbox();
        obj=null;
        if(f==f1) {
            mode=1;
            obj=new Dot();
        }
        else if(f==f2) {
            mode=2;
            obj=new Circle();
        }
        else if(f==f3) {
            mode=2;
            obj=new Rect();
        }
        else if(f==f4){
            mode=2;
            obj=new Line();
        }
        else {
            obj=new Rect();
        }
        if(c==c1)color=Color.black;
        else if(c==c2)color=Color.red;
        else if(c==c3)color=Color.green;
        else if(c==c4)color=Color.blue;
        else color=Color.black;
        obj.color=color;
        if(obj!=null){
            obj.moveto(e.getX(),e.getY());
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
        repaint();
    }
    @Override public void mouseClicked(MouseEvent e){}
    @Override public void mouseEntered(MouseEvent e){}
    @Override public void mouseExited(MouseEvent e){}
    @Override public void mouseDragged(MouseEvent e){
        if(mode==1)obj.moveto(e.getX(),e.getY());
        else if(mode==2) obj.setWH(e.getX()-obj.x,e.getY()-obj.y);
        repaint();
    }
    @Override public void mouseMoved(MouseEvent e){}
}
