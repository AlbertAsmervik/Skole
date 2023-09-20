package Obj1000.MyJava11;
import javax.swing.*;
import java.awt.Font;

public class JFrame1 {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Title");
        
       
        Font myFont = new Font("Arial", Font.BOLD, 24);
        ImageIcon image = new ImageIcon("Azuregg.jpeg");
        JLabel myLabel = new JLabel(image);
        JLabel lab1 = new JLabel("This is my picture");
        myFrame.add(lab1);


        myFrame.add(myLabel);
        

        myFrame.setVisible(true);
        myFrame.setBounds(200,200,400,400);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(true);
    }
}
