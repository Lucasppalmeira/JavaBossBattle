
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Draw extends JPanel {

    private Image background;
    private Image playerImage;
    private Player player; //instanciando a classe player
    private int backgroundY;

    public Draw(String backgroundImagePath, String playerImagePath, int playerWidht, int playerHeight) {
        ImageIcon backgroundImageIcon = new ImageIcon(backgroundImagePath);
        background = backgroundImageIcon.getImage();

        ImageIcon playerImageIcon = new ImageIcon(playerImagePath);
        playerImage = playerImageIcon.getImage().getScaledInstance(playerWidht, playerHeight, Image.SCALE_SMOOTH);

       
        backgroundY = 0;

        //configura o foco para receber eventos de teclado
        setFocusable(true);
        
    }


    public void moveBackground(int dx, int dy) {
        backgroundY -= dx;
        if (backgroundY > getHeight()) {
            backgroundY = 0;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int imageHeight = background.getHeight(this);

        int y = backgroundY;
        while (y < panelHeight) {
            g.drawImage(background, 0, y, panelWidth, imageHeight, this);
            y += imageHeight;
        }

        int playerX = panelWidth/2 - playerImage.getWidth(this)/2;
        int playerY = panelHeight - playerImage.getHeight(this);
        g.drawImage(playerImage, playerX, playerY, this);
    }
}