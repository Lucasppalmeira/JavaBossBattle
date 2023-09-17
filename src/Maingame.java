import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Maingame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Scrollable Background");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Draw backgroundPanel = new Draw("src/sprites/background.jpg");
            frame.add(backgroundPanel);

            frame.setSize(800, 600);
            frame.setVisible(true);

            Timer timer = new Timer(20, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    backgroundPanel.moveBackground(2,0);
                    backgroundPanel.repaint();
                }
            });
            timer.start();
        });


        Player player = new Player(100, 10);
        System.out.println(player.getVidaPlayer() + " " + player.getDanoPlayer());

        //criando boss
        Boss boss = new Boss("placeholder", 1000, 50);
        System.out.println(boss.getNomeBoss() + " " + boss.getVidaBoss() + " " + boss.getDanoBoss() + "\n"); 
        
    }
    
}
