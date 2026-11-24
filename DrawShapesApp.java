import javax.swing.*;
import java.awt.*;

public class DrawShapesApp extends JPanel {
    private Font font;
    private Color darkGrayColor;
    private Color lightGrayColor;
    private Color backgroundColor;

    public DrawShapesApp() {
        font = new Font("Arial", Font.ITALIC, 18);
        darkGrayColor = Color.DARK_GRAY;
        lightGrayColor = Color.LIGHT_GRAY;
        backgroundColor = Color.WHITE;
        setBackground(backgroundColor);
    }

    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);
        graph.setFont(font);
        graph.setColor(Color.BLACK);
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
        JFrame frame = new JFrame("Draw Shapes - Hitam Putih Abu-abu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 300);
        frame.add(new DrawShapesApp());
        frame.setVisible(true);
        System.out.println("Window DrawShapesApp berhasil dijalankan (tema hitam, putih, abu-abu).");
    }
}