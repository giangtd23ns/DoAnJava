package client;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {
    private JTextField usernameField;
    private JButton loginButton;
    private JLabel usernameLabel;

    public Login() {
        setTitle("Đăng nhập");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(230, 230, 250));
        panel.setLayout(null);
        
        usernameLabel = new JLabel("Tên người dùng:");
        usernameLabel.setBounds(10, 10, 100, 25);
        panel.add(usernameLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(120, 10, 160, 25);
        panel.add(usernameField);
        
        loginButton = new JButton("Đăng nhập");
        loginButton.setBounds(10, 50, 270, 25);
        loginButton.setBackground(new Color(186, 85, 211));
        loginButton.setForeground(Color.WHITE);
        panel.add(loginButton);
        
        add(panel);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                if (!username.isEmpty()) {
                    dispose();
                    new Client();
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập tên người dùng!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}
