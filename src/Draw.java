
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Graphics;

public class Draw extends JPanel {

    private Image background;
    private int backgroundY;

    // Construtor
    public Draw(String imagePath) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        background = imageIcon.getImage();

        backgroundY = 0;
    }

    // Método para mover o fundo
    public void moveBackground( int dx, int dy){
        //movendo o fundo para esquerda
        backgroundY -= dx;

        // Se o fundo sair da tela, reinicie
        if(backgroundY > getWidth()){
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

        // Desenhe a imagem de fundo repetidamente
        int y = backgroundY;
        while (y < panelHeight) {
             g.drawImage(background, 0, y, panelWidth, imageHeight, this);
            y += imageHeight;
        }
           
    }
}

    