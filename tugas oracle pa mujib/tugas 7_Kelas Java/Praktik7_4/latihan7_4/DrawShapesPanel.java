package latihan7_4;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawShapesPanel extends JPanel {
    private Font font;
    private Color darkGrayColor;
    private Color lightGrayColor;
    private Color backgroundColor;

    public DrawShapesPanel() {
        font = new Font("Arial", Font.ITALIC, 18);
        darkGrayColor = Color.DARK_GRAY;
        lightGrayColor = Color.LIGHT_GRAY;
        backgroundColor = Color.GRAY;
        setBackground(backgroundColor);
    }

    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);

        graph.setFont(font);
        graph.setColor(Color.WHITE);
        graph.drawString("Draw Shapes", 90, 20);

        graph.setColor(darkGrayColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);

        graph.setColor(Color.BLACK);
        graph.fillArc(110, 110, 50, 50, 0, 360);

        graph.setColor(lightGrayColor);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shapes - Hitam Putih Abu-Abu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 300);
        frame.add(new DrawShapesPanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}