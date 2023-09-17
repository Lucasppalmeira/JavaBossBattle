import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class Maingame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BossBattle");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Draw draw = new Draw("src/sprites/background.jpg");
            frame.add(draw);

            frame.setSize(800, 600); // Defina o tamanho da janela como desejado
            frame.setVisible(true);
        });

        Player player = new Player(100, 10);
        System.out.println(player.getVidaPlayer() + " " + player.getDanoPlayer());

        //criando boss
        Boss boss = new Boss("placeholder", 1000, 50);
        System.out.println(boss.getNomeBoss() + " " + boss.getVidaBoss() + " " + boss.getDanoBoss() + "\n"); 
        
    }
    
}
