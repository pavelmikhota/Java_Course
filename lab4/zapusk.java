import javax.swing.*;
public class zapusk {
    public static void main(String args[]){
        okno mainFrame = new okno("Привет, SWING!");
        mainFrame.setSize(400, 200);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
    }
}