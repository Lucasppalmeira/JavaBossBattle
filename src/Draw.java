import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

class Draw extends JPanel implements ActionListener {

    private Image background;
    private Image playerImage;

    private int playerX;
    private int playerY;

    private int backgroundY;

    private Timer timer;

    public Draw(String backgroundImagePath, String playerImagePath, int playerWidth,
                int playerHeight, int initialPlayerX, int initialPlayerY) {
        // Inicializando o background
        ImageIcon backgroundImageIcon = new ImageIcon(backgroundImagePath);
        background = backgroundImageIcon.getImage();

        // Inicializando o player
        ImageIcon playerImageIcon = new ImageIcon(playerImagePath);
        playerImage = playerImageIcon.getImage().getScaledInstance(playerWidth, playerHeight, Image.SCALE_SMOOTH);
        backgroundY = 0;

        // Configurando o foco para receber eventos de teclado
        setFocusable(true);
        requestFocusInWindow();

        // Configurando os elementos do teclado
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();

                // Move o jogador com base na tecla pressionada
                if (keyCode == KeyEvent.VK_LEFT) {
                    playerX -= 10; // Move para a esquerda
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    playerX += 10; // Move para a direita
                } else if(keyCode == KeyEvent.VK_UP){
                    playerY -= 10;
                } else if(keyCode == KeyEvent.VK_DOWN){
                    playerY += 10;
                }
            }
        });

        // Configura a posição inicial do jogador
        playerX = initialPlayerX;
        playerY = initialPlayerY;

        // Configura o timer para atualização contínua da tela
        timer = new Timer(10, this);
        timer.start();
    }

    public void moveBackground(int dx, int dy) {
        backgroundY -= dx;
        if (backgroundY > getHeight()) {
            backgroundY = 0;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int imageHeight = background.getHeight(this);

        int y = backgroundY;
        while (y < panelHeight) { // Loop para o efeito infinito no background
            g.drawImage(background, 0, y, panelWidth, imageHeight, this);
            y += imageHeight;
        }

        // Desenha o jogador na tela
        g.drawImage(playerImage, playerX, playerY, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Atualiza a tela a cada intervalo de tempo do timer
        repaint();
    }
}
