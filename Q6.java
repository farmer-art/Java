import javax.swing.*;
import java.awt.*;

public class Q6 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw a rectangle
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 150, 80);

        // Draw a circle
        g.setColor(Color.RED);
        g.drawOval(250, 50, 80, 80);

        // Draw a string
        g.setColor(Color.BLACK);
        g.drawString("Welcome to Java Applets!", 50, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Q6());
        frame.setSize(400, 250);
        frame.setVisible(true);
    }
}   