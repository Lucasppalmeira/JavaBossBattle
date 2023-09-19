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

    private int playerVelocityX; // Velocidade horizontal do jogador
    private int playerVelocityY; // Velocidade vertical do jogador

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
<<<<<<< HEAD

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
=======
                // Move o jogador com base na tecla pressionada
                if (keyCode == KeyEvent.VK_LEFT) {
                    if(playerX > -30){
                        playerX -= 10; // Move para a esquerda
                    }
                    //playerX -= 10; // Move para a esquerda
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    if(playerX < 1500){
                        playerX += 10;
                    }
                    //playerX += 10; // Move para a direita
                } else if(keyCode == KeyEvent.VK_UP){
                    playerY -= 10;
                } else if(keyCode == KeyEvent.VK_DOWN){
                    playerY += 10;
>>>>>>> 23f68836a56f7bba5279194cc00d27fa684307d3
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
        // Atualiza a posição do jogador com base na velocidade atual
        playerX += playerVelocityX;
        playerY += playerVelocityY;

        // Atualiza a tela a cada intervalo de tempo do timer
        repaint();
    }
}
