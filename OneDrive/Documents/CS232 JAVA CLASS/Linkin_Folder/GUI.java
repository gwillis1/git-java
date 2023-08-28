package Linkin_Folder;
import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Welcome to Programming Languages!");
        frame.add(label);
        frame.setTitle("Programming Languages");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

