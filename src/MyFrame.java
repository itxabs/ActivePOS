import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //open the window in fulwidth
        this.setVisible(true);


        ImageIcon image = new ImageIcon("as.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255,255,250));

    }


}
