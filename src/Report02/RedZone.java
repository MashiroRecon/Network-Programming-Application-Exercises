package Report02;

import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import javax.sound.sampled.*;


public class RedZone {
    public static void redzone(){
        JFrame dialog=new JFrame();
        String fmessage[]={
            "[RED ZONE]が目覚めようとしています。",
            "このまま続行しますか？"
        };
        String smessage[]={
            "[RED ZONE]が本気を出します。",
            "続行してよろしいですか？"
        };
        int first=JOptionPane.showConfirmDialog(dialog,fmessage,"RED ZONE", JOptionPane.OK_CANCEL_OPTION);
        if(first==JOptionPane.OK_OPTION){
            int second=JOptionPane.showConfirmDialog(dialog,smessage,"Final Confirmation", JOptionPane.OK_CANCEL_OPTION);
            if(second==JOptionPane.OK_OPTION){
                Clip bgm=createClip(new File("RedZone.wav"));
                bgm.start();
                try {
                    Thread.sleep(80000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bgm.close();
            }
            else if(second==JOptionPane.CANCEL_OPTION){}
        }
        else if(first==JOptionPane.CANCEL_OPTION){}
    }
    public static Clip createClip(File path){
        try(AudioInputStream ais=AudioSystem.getAudioInputStream(path)){
            AudioFormat af=ais.getFormat();
            DataLine.Info dataLine=new DataLine.Info(Clip.class,af);
            Clip c=(Clip)AudioSystem.getLine(dataLine);
            c.open(ais);
            return c;
        }
        catch(MalformedURLException e){
            e.printStackTrace();
        }
        catch(UnsupportedAudioFileException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(LineUnavailableException e){
            e.printStackTrace();
        }
        return null;
    }


}
