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

    //background
    private int backgroundY;
    private Image background;

    // player
    public int playerX;
    public int playerY;
    private int playerVelocityX; // Velocidade horizontal do jogador
    private int playerVelocityY; // Velocidade vertical do jogador
    private Image playerImage;

    //boss
     private Image bossImage;
     private int bossX;
     private int bossY;

    private Timer timer;

    public Draw(String backgroundImagePath, String playerImagePath, String bossImagePath,int playerWidth,
                int playerHeight, int initialPlayerX, int initialPlayerY , int initialBossX, int initialBossY, int bossWidth, int bossHeight) {
                    
        // Inicializando o background
        ImageIcon backgroundImageIcon = new ImageIcon(backgroundImagePath);
        background = backgroundImageIcon.getImage();

        // Inicializando o player
        ImageIcon playerImageIcon = new ImageIcon(playerImagePath);
        playerImage = playerImageIcon.getImage().getScaledInstance(playerWidth, playerHeight, Image.SCALE_SMOOTH);
        backgroundY = 0;

        //iniciando o boss
        ImageIcon bossImageIcon = new ImageIcon(bossImagePath);
        bossImage = bossImageIcon.getImage();
        bossImage = bossImageIcon.getImage().getScaledInstance(bossWidth, bossHeight, Image.SCALE_SMOOTH);

        // Configurando o foco para receber eventos de teclado
        setFocusable(true);
        requestFocusInWindow();

        // Configurando os elementos do teclado
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();

                // Atualiza a velocidade com base na tecla pressionada
                if (keyCode == KeyEvent.VK_LEFT) {
                    playerVelocityX = -5; // Define a velocidade para a esquerda
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    playerVelocityX = 5; // Define a velocidade para a direita
                } else if (keyCode == KeyEvent.VK_UP) {
                    playerVelocityY = -5; // Define a velocidade para cima
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    playerVelocityY = 5; // Define a velocidade para baixo
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int keyCode = e.getKeyCode();

                // Reduz a velocidade quando a tecla é liberada
                if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_RIGHT) {
                    playerVelocityX = 0;
                } else if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN) {
                    playerVelocityY = 0;
                }
            }
        });

        // Configura a posição inicial do jogador
        playerX = initialPlayerX;
        playerY = initialPlayerY;

        bossX = initialBossX;
        bossY = initialBossY;

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

        //Desenha boss na tela
        g.drawImage(bossImage, bossX, bossY, this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Atualiza a posição do jogador com base na velocidade atual
        if(playerVelocityX < 0 && playerX > -30) {
            playerX += playerVelocityX;
        } else if (playerVelocityX > 0 && playerX < 1500) {
            playerX += playerVelocityX;
        }
        playerY += playerVelocityY;

        // Atualiza a tela a cada intervalo de tempo do timer
        repaint();
    }
}
