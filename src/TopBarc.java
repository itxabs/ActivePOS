import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopBarc {
    private JPanel Topbar;
    private JTextField textField1;
    private JButton clickMeButton;
    private JLabel POS;

    public TopBarc() {
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(clickMeButton,textField1.getText()+ "Hello");
            }
        });
    }
}
