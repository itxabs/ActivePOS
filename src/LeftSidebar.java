import javax.swing.*;
import java.awt.*;

public class LeftSidebar extends JPanel {

    LeftSidebar() {

        this.setBackground(new Color(200, 200, 200));
        this.setSize(200,100);

        JButton btn1 = new JButton("Product");
        this.add(btn1);
        JButton btn2 = new JButton("User");
        this.add(btn2);

        this.setLayout(new GridLayout(10,1));
    }
}
