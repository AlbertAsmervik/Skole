package Obj1000.MyJava11;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    
    private JTextField usernameField;
    private JPasswordField passwordField;
    
    public Login() {
        setTitle("Innlogging");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        
        // Create a panel to hold the login form
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.anchor = GridBagConstraints.WEST;
        
        JLabel usernameLabel = new JLabel("Brukernavn:");
        loginPanel.add(usernameLabel, constraints);
        
        constraints.gridx = 1;
        usernameField = new JTextField(15);
        loginPanel.add(usernameField, constraints);
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        JLabel passwordLabel = new JLabel("Passord:");
        loginPanel.add(passwordLabel, constraints);
        
        constraints.gridx = 1;
        passwordField = new JPasswordField(15);
        loginPanel.add(passwordField, constraints);
        
        // Add login button
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        JButton loginButton = new JButton("Innlogging");
        loginPanel.add(loginButton, constraints);
        
        // Add panel to the frame
        add(loginPanel);
        
        // Set frame visible
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
