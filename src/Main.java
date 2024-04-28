import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame pos = new JFrame("Welcome to ActivePOS");
        pos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pos.setExtendedState(JFrame.MAXIMIZED_BOTH); //open the window in fulwidth
        pos.setVisible(true);


        ImageIcon image = new ImageIcon("as.png");
        pos.setIconImage(image.getImage());
        pos.getContentPane().setBackground(new Color(255,255,250));

        }
    }
