
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMFrame extends JFrame {

    public ATMFrame() {
        super("ATM");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
      //  panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setLayout(new FlowLayout());

        JLabel accountLabel = new JLabel("Account Number:");
        JTextField accountField = new JTextField(20);
        panel.add(accountLabel);
        panel.add(accountField);

        JLabel pinLabel = new JLabel("PIN:");
        JPasswordField pinField = new JPasswordField(4);
        panel.add(pinLabel);
        panel.add(pinField);

        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountField = new JTextField(40);
        panel.add(amountLabel);
        panel.add(amountField);

        JButton withdrawButton = new JButton("Withdraw");
        panel.add(withdrawButton);

        add(panel);
        setVisible(true);

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pin = Integer.parseInt(pinField.getText());
                if (pin == 5555) {
                    JOptionPane.showMessageDialog(null, "Pin is correct");
                } else {
                    JOptionPane.showMessageDialog(null, "Pin is wrong!");
                }
            }
        });
    }

}
