import javax.swing.*;
public class Main{
    public static void main(String args[]){
        
        JFrame frame = new JFrame("Hello");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(3);
        frame.add(new JLabel("Hello World"));
        System.out.println("Hello");
        System.out.println("World");
        frame.setVisible(true);

        
    }   
}