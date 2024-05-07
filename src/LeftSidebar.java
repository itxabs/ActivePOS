import javax.swing.*;
import java.awt.*;

public class LeftSidebar extends JPanel {

    LeftSidebar() {

        this.setBackground(new Color(200, 200, 200));
        this.setSize(250,100);

        JButton btn1 = new JButton("Product");
        this.add(btn1);
        JButton btn2 = new JButton("User");
        this.add(btn2);
        JButton btn3 = new JButton("Testing");
        this.add(btn3);

        this.setLayout(new GridLayout(10,1,10,10));
    }
}
