import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopBar {
    private JPanel Topbar1;
    private JTextField textField1;
    private JButton clickMeButton;
    private JLabel POS;

    public TopBar() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(clickMeButton,textField1.getText()+ "Hello");
            }
        });
    }
}
