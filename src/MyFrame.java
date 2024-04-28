import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("Welcome to Active POS");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //open the window in fulwidth



        ImageIcon image = new ImageIcon("as.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(255,255,250));
        this.setLayout(new BorderLayout());
        JLabel test = new JLabel("text");
        this.add(new LeftSidebar(),BorderLayout.WEST);

        this.setVisible(true);
        this.setResizable(true);

    }


}
