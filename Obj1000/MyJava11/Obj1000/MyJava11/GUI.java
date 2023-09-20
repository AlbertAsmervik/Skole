package Obj1000.MyJava11;

import java.awt.BorderLayout;
import java.awt.GridLayout;


import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;
    private JFrame frame;
    private JLabel label;
    private JPanel panel;

    public GUI() {

        frame = new JFrame(); 

        JButton button = new JButton("Trykk på meg");
        button.addActionListener(this);

        label = new JLabel("Antall trykk : 1");
        panel = new JPanel();




        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(3, 3));
        panel.add(button);
        panel.add(label);
        

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Alberts Revenge arena for the battle versus Intility");
        frame.pack();
        frame.setVisible(true);
        
        
    
    }
    
    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Antall trykk : " + count);
       
    } 
}