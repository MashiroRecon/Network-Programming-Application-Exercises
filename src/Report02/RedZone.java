package Report02;

import java.awt.*;
import javax.swing.*;

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
            if(second==JOptionPane.OK_OPTION){}
            else if(second==JOptionPane.CANCEL_OPTION){}
        }
        else if(first==JOptionPane.CANCEL_OPTION){}
    }
}
