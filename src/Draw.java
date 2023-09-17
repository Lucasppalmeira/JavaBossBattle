
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Graphics;

public class Draw extends JPanel {

    private Image background;

    public Draw(String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        background = imageIcon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
    }
}