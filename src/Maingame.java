import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;

public class Maingame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("bossbattle");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Draw backgroundPanel = new Draw("src/sprites/background.jpg","src/sprites/player.png",75,75);
            frame.add(backgroundPanel);

            frame.setSize(800, 600);
            frame.setVisible(true);

            Timer timer = new Timer(20, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    backgroundPanel.moveBackground(6,0);
                    backgroundPanel.repaint();
                }
            });
            timer.start();

            // Agora crie os objetos Player e Boss aqui dentro do bloco Swing
            Player player = new Player(100, 10);
            Boss boss = new Boss("placeholder", 1000, 50);
        });
    }
}